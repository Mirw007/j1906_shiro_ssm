package com.qf.j1906.controller;

import com.qf.j1906.mapper.UserMapper;
import com.qf.j1906.pojo.User;
import com.qf.j1906.service.UserService;
import com.qf.j1906.vo.DataGridResult;
import com.qf.j1906.vo.UserVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 飞
 * @date 2019/11/5
 */
@Controller
@SessionAttributes("current_user")
public class UserController {

    Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    /**
     * 注册账户
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(User user) {
        log.info("====注册====user={"+user+"}===========");
        if (user != null) {
            userService.insert(user);
            return "login";
        }
        return "Register";

    }

    /**
     * 修改密码
     *
     * @param userId
     * @param password1
     * @param password2
     * @param password
     * @return
     */
    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    public String updatePassword(@RequestParam("userId") int userId,
                                 @RequestParam("password1") String password1,
                                 @RequestParam("password2") String password2,
                                 @RequestParam("password") String password) {
        log.info("==============================================liwenfei===========================================================");
        log.info("====id========" + userId + "===" + password1 + "===" + password2 + "=====password===" + password);
        User user = userService.getUserID(userId);
        log.info(user + "==============user======");

        if (!password1.equals(password2)) {
            return "error";
        } else if (user.getPassword().equals(password2)) {
            log.info(user.getPassword() + "================password===========");
            userService.updatePssword(password, userId);
            return "member_xiangqing";
        } else {
            return "error";
        }

    }

    /**
     * 根据用户姓名查询
     *
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/admin_role")
    public String getUser(@ModelAttribute("current_user") User user, Model model) {
        String userName = user.getUserName();
        List<User> users = userService.getUserByName(userName);
        log.info(users + "================userName=====");
        if (users != null) {
            model.addAttribute("result", users);
            return "member_xiangqing";
        }
        return "error";
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @param model
     * @return
     */
    @RequestMapping(value = "/getUserById/{userId}", method = RequestMethod.GET)
    public String getUserById(int userId, Model model) {
        log.info("=======ssss=====" + userId);
        List<User> users = userService.getUserById(userId);
        log.info("=users===" + users);
        if (users != null) {
            model.addAttribute("result", users);
            log.info(users + "=========user==+===model===================" + model);
            return "member_xiangqing";
        }
        return "error";
    }

    /**
     * 查询所有用户信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/member_list1", method = RequestMethod.GET)
    public String getUser(Model model) {
        List<User> users = userService.getUser();
        if (users != null) {
            model.addAttribute("result", users);
            return "member_list";
        }
        return "error";
    }

    /**
     * 分页查询
     *
     * @param userName
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/member_list", method = RequestMethod.POST)
    @ResponseBody
    public DataGridResult findItems(
            @RequestParam(value = "userName", defaultValue = "") String userName,
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "rows", defaultValue = "10") int pageSize) {
        log.info(userName + "=-===" + page + "====" + pageSize);
        DataGridResult users = userService.findItemsByPage(userName, page, pageSize);
        log.info("============" + users);
        return users;
    }
}


  /*  *//**
     * 求首页
     * @return
     *//*
    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String showMain(User user, Model model) {
      *//*  String userName = user.getUserName();
        String password= user.getPassword();*//*
        User users = userService.findUserByName(user.getUserName());
        model.addAttribute("current_user", users);
        if (users.getUserName().equals(user.getUserName())) {
            if (users.getPassword().equals(user.getPassword())) {

                return "index";

            } else {
                return "error";
            }
        }
        return "error";
    }*/
   /* //显示登录页
  @RequestMapping("/login")
    public String showLoginView(){
        return "login";
    }
//处理用户登录

    @RequestMapping(value="/dealLogin" ,method=RequestMethod.POST)
    public String dealLogin(UserVo userVo){
        try {
//        认证过程
//        创建令牌
            UsernamePasswordToken token = new UsernamePasswordToken(userVo.getLoginName(), userVo.getPassword());
//        获取shiro主体对象
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            if(subject.isAuthenticated()){
                return "main";
            }
        } catch (AuthenticationException e) {
//            e.printStackTrace();
           log.error("认证失败！");
        }
    return "login";
    }
//    显示主视图
    @RequestMapping(value="/main" ,method=RequestMethod.GET)
    public String showMainView(){
        return "main";
    }
//    显示无权访问
    @RequestMapping("/unauth")
    public String showUnAuth(){
        return "unauth";
    }
    //    显示功能1视图
    @RequiresPermissions(value={"user_edit"})
    @RequestMapping("/one")
    public String showOne(){
        return "one";
    }
    //    显示功能2视图
    @RequiresPermissions(value={"user_forbidden"})
    @RequestMapping("/two")
    public String showTwo(){
        return "two";
    }
    @RequestMapping("/logOut")
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

    */
