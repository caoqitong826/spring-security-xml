package com.makenv.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by caoqitong on 15-5-8.
 */
@Controller
public class SnacksLinkController {
    @RequestMapping(value = "/snackslink/add",method = RequestMethod.GET)
    @ResponseBody
    public String addAction(){

        return "add success";
    }

    @RequestMapping(value = "/snackslink/edit",method = RequestMethod.GET)
    @ResponseBody
    public String editAction(){

        return "edit success";
    }

    @RequestMapping(value = "/snackslink/delete",method = RequestMethod.GET)
    @ResponseBody
    public String deleteAction(){

        return "delete success";
    }

    @RequestMapping(value = "/snackslink/index",method = RequestMethod.GET)
    @ResponseBody
    public String indexAction(){

        return "index success";
    }
}
