package com.qf.j1906.config;

import com.qf.j1906.vo.MyShiroRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(
            @Qualifier("securityManager") DefaultWebSecurityManager securityManager
    ){
        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();
//        配置安全管理器
        filterFactoryBean.setSecurityManager(securityManager);
//     设置shiro鉴权的过滤链
        Map<String,String> map = new HashMap<>();
        map.put("/static/**","anon");
        map.put("/login","anon");
        map.put("/dealLogin","anon");
        map.put("/indexqt","anon");
        map.put("/showRegister","anon");
        map.put("/Register","anon");
        //map.put("/index","authc");//必须登陆后，方可访问
        map.put("/**","authc");
//          map.put("/one","perms[user_edit]");//需要登录且拥有user_edit权限才可访问
//          map.put("/two","perms[user_forbidden]");//需要登录且拥有user_edit权限才可访问
        filterFactoryBean.setFilterChainDefinitionMap(map);
        filterFactoryBean.setLoginUrl("/login.html");//设置登录页
        filterFactoryBean.setUnauthorizedUrl("/outpower");//权限不足提示页
        return filterFactoryBean;
    }

    //    创建shiro的安全管理器
    @Bean("securityManager")
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("myRealm") AuthorizingRealm myRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        securityManager.setRealm(getMyShiroRealm());
        securityManager.setRealm(myRealm);
        return securityManager;
    }
    //  自定义认证授权的安全策略
    @Bean("myRealm")
    public MyShiroRealm getMyShiroRealm(){
        return new MyShiroRealm();
    }

    /**
     * 开启Shiro注解(如@RequiresRoles,@RequiresPermissions),
     * 需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator和AuthorizationAttributeSourceAdvisor)
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }
    /**
     * 开启aop注解支持
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager defaultWebSecurityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(defaultWebSecurityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
