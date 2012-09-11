package com.hck.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.hck.domain.Roles;
import com.hck.service.UserServiceImpl;

public class MultiUserController extends MultiActionController {
	private UserServiceImpl userServiceImpl;
	private List<Roles> roleList;
	
	public ModelAndView view(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(" multiuser Add method called");
		Roles roleForm= new Roles();
		return  new ModelAndView("guest", "roleForm", roleForm);
	}
	
	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response , Roles roleForm) throws Exception {
		System.out.println("roles.getRoleName() :::"+roleForm.getRoleName());
		getUserServiceImpl().persist(roleForm);
		return  new ModelAndView("guest", "roleForm", roleForm);
	}
	
	public ModelAndView remove(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("multiuser Remove method called");
		return new ModelAndView("multiuser", "message", "Remove method called");
	}

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	public List<Roles> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Roles> roleList) {
		this.roleList = roleList;
	}
	
	
}
