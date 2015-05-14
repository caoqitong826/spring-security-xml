package com.makenv.spring.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.tools.FileObject;

/**
 * Created by caoqitong on 15-5-8.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
    public String homeAction(){

        return "/index";
    }

    @RequestMapping(value = {"/login"},method = RequestMethod.GET)
    public String loginAction(){

        //return "login";
        return "/login";
    }

    @RequestMapping(value = {"/loginPost"},method = RequestMethod.POST)
    public String loginPOSTAction(){

        //return "login";
        return "/admin/index";
    }

//    @RequestMapping(value = "/error",method = RequestMethod.GET)
//    @ResponseBody
//    public String errorAction(){
//        return "/error";
//    }
}
