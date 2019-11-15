package com.qf.j1906.vo;


import com.qf.j1906.pojo.Permission;
import com.qf.j1906.pojo.Role;
import com.qf.j1906.pojo.User;
import com.qf.j1906.service.PermisissionService;
import com.qf.j1906.service.RoleService;
import com.qf.j1906.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyShiroRealm extends AuthorizingRealm {
    private static final Logger logger = LogManager.getLogger(MyShiroRealm.class);
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserService userService;
    @Autowired
    private PermisissionService permisissionService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String principal = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        //根据用户名查询权限清单
        Set<String> roles = new HashSet<String>();
        List<Role> rolesByUserName = roleService.findRolesByUserName(principal);
        logger.info("roles :======="+rolesByUserName);

        for (Role role:rolesByUserName){
            roles.add(role.getRoleName());

        }
        List<Permission> permsByLoginName = permisissionService.findPermsByLoginName(principal);
        for (Permission permission:permsByLoginName){
            authorizationInfo.addStringPermission(permission.getPermName());
        }
        authorizationInfo.setRoles(roles);
        return authorizationInfo;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
       //获取用户信息
        String principal = (String) token.getPrincipal();
        User user = userService.findUser(principal);
        if (user!=null){
            String password = user.getPassword();
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(principal, password, this.getName());
            return authenticationInfo;
        }
        return null;
    }
}

