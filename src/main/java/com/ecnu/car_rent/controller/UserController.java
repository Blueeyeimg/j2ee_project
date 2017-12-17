package com.ecnu.car_rent.controller;

import com.ecnu.car_rent.model.User;
import com.ecnu.car_rent.service.UserService;
import lombok.experimental.var;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;


    //1,使用HttpServletRequest获取
    // 2,Spring会自动将表单参数注入到方法参数，和表单的name属性保持一致。和Struts2一样------@RequestParam("name")String name
    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model,@RequestParam("name")String name,@RequestParam("pass")String password){

        log.info("查询所有用户信息");
 /*     String name = request.getParameter("name");
        log.info("request.getParameter:::::"+name);

        String[] dd=request.getParameterValues("name");
        log.info("request.getParameterValues:::::"+dd[0].toString());*/

        log.info("RequestParam::::"+name);
        log.info("RequestParam::::"+password);

        /*List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);*/
        return "showUser";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model){
        return "login";
    }

    //3,自动注入Bean属性----User user https://www.cnblogs.com/chentingk/p/6073963.html
    @RequestMapping("/haha")
    public String showUserssss(HttpServletRequest request, Model model,User user){
        //int isSuccess = userService.insertNewUser(user);//做了一个插入的列子
        User u = userService.getUserById(6);
        //User user1 = userService.getUserById(2);
        //model.addAttribute("userList",userList);
        //model.addAttribute("User",user1);
        //model.addAttribute("isSuccess",isSuccess);
        model.addAttribute("user",u);
        return "showUser";
    }

}
