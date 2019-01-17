package org.lanqiao.project.controller;

import org.lanqiao.project.pojo.User;
import org.lanqiao.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
//    @RequestMapping("/userlist")
//    public String query(Model model){
////        List<User>userList=userService.selectAll();
////        System.out.println("---------"+userList.size());
////        model.addAttribute("userlist",userList);
////        return "userlist";
////    }
    @RequestMapping("ad-index")
    public String index(Model model){

        return "ad-index";
    }
    @RequestMapping("member-list.html")
    public String aa(Model model){
        List<User>userList=userService.selectAll();
        System.out.println("---------"+userList.size());
        model.addAttribute("userlist",userList);
        return "member-list";
    }
    @RequestMapping("member-edit.html")
    public String bb(Model model){
        return "member-edit.html";
    }





}