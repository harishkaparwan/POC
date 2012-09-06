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
		List<Roles> arrayList=getUserServiceImpl().getAllGuests();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Roles roles = (Roles) iterator.next();
		System.out.println("roles---"+roles.getRoleDescription());	
		}
		return  new ModelAndView("guest", "roleList", arrayList);
	}
	
	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("multiuser add method called");
		
		Roles roles= new Roles();
		roles.setRoleName(request.getParameter("rolename"));
		roles.setRoleDescription(request.getParameter("roledescription"));
		getUserServiceImpl().persist(roles);
		roles=new Roles();
		List<Roles> arrayList=getUserServiceImpl().getAllGuests();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			 roles = (Roles) iterator.next();
		System.out.println("roles--add method-"+roles.getRoleDescription());	
		}
		return  new ModelAndView("guest", "roleList", arrayList);
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
