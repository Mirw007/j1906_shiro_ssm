package com.qf.j1906.controller;


import com.qf.j1906.mapper.UserMapper;
import com.qf.j1906.pojo.Role;
import com.qf.j1906.service.RoleService;
import com.qf.j1906.service.UserService;
import com.qf.j1906.vo.DataGridResult;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class RoleController {
    private static final Logger logger = LogManager.getLogger(RoleController.class);
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    //管理员列表
   // @RequiresRoles("admin")

    @RequestMapping("/add")
    public JSONObject addAdmin(){
        return null;
    }


    //视图控制
    @RequestMapping(value = "/{view}",method = RequestMethod.GET)
    public String viewContor(@PathVariable(value = "view")String view){
        return view;
    }


    @RequestMapping(value = "/admin_member_list",method = RequestMethod.GET)
    public String all(Model model) {
        List<Role> roles=roleService.findAll();
        logger.info(roles);
        model.addAttribute("result",roles);
        return "member_list";

    }
    @RequestMapping("/getrole")
    public DataGridResult condition(int page, int pageSize,String roleName) {
        return roleService.findRoleByCondition(page, pageSize,roleName);
    }

}
