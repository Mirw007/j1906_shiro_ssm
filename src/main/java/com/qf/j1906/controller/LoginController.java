package com.qf.j1906.controller;


import com.qf.j1906.mapper.UserMapper;
import com.qf.j1906.pojo.Role;
import com.qf.j1906.pojo.User;
import com.qf.j1906.pojo.UserExample;
import com.qf.j1906.service.RoleService;
import com.qf.j1906.vo.UserVo;
import com.sun.org.apache.bcel.internal.generic.I2F;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.swing.plaf.PanelUI;
import java.util.List;

@Controller
//@SessionAttributes("current_user")
public class LoginController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleService roleService;

    private static final Logger logger = LogManager.getLogger(LoginController.class);
    //显示登录页
    @RequestMapping(value="login")
    public String showLoginView(){
        return "login";
    }
    @RequestMapping("/showRegister")
    public String register(){
        return "Register";
    }

    //处理登录
    
    @RequestMapping(value = "/dealLogin",method = RequestMethod.POST)
    public String dealLogin(UserVo userVo, HttpSession session, Model model){

//        model.addAttribute("current_user", userVo);
        //创建令牌
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(userVo.getLoginName(), userVo.getPassword());
            //获取shiro主体
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            if (subject.isAuthenticated()) {
                logger.info("认证成功");

                //判断用户角色
                String loginName = userVo.getLoginName();
                User user = userMapper.selectByName(loginName);
                session.setAttribute("yongHu",user);
                //根据username获取角色信息
                Role role = roleService.findRoleByUserName(loginName);
                String roleName = role.getRoleName();


                if (roleName.equals("超级管理员")||"管理员".equals(roleName)){
                    logger.info("管理员登入");
                    return "index";
                }else {
                    logger.info("会员登入"+user);
                    return "indexqt";
                }
            }
        } catch (AuthenticationException e) {
            logger.info("认证失败");
        }
        return "login";

    }
    //用户列表
   @RequiresPermissions(value = {" "})
      @RequestMapping("/admin/userlist")
    public ModelAndView adminManger(){
        ModelAndView mov = new ModelAndView();
          UserExample userExample = new UserExample();
//        List<TbSysUser> users = userMapper.selectAllAdmin();
          List<User> users = userMapper.selectByExample(userExample);
          mov.addObject("userList",users);
        mov.setViewName("admin_list");
        return mov;
    }
    //视图控制
    @RequestMapping(value = "/{view}",method = RequestMethod.GET)
    public String viewContor(@PathVariable(value = "view")String view){
        return view;
    }

//    显示无权访问
    @RequestMapping("/outpower")
    public String showUnAuth(){
        return "error";
    }
    @RequestMapping("/logout")

    public String logOut(){
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.logout();
//           清楚业务会话信息

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:login";
    }

}
