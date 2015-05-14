package com.makenv.spring.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by caoqitong on 15-5-8.
 */
@Controller
public class AdminController {

  @RequestMapping(value = {"/admin/index"},method = RequestMethod.GET)
  public String adminAction(){
      return "/admin/index";
  }

  @RequestMapping(value = {"/admin/add"},method = RequestMethod.GET)
  public String addAction(){
    return "/admin/add";
  }

  @RequestMapping(value = {"/admin/edit"},method = RequestMethod.GET)
  public String editAction(){
    return "/admin/edit";
  }
  @RequestMapping(value = {"/admin/detial"},method = RequestMethod.GET)
  public String detialAction(){
    return "/admin/detial";
  }
  @RequestMapping(value = {"/admin/delete"},method = RequestMethod.GET)
  public String deleteAction(){
    return "/admin/delete";
  }
}
