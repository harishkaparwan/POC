package com.hck.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.hck.domain.SpringTagUser;
import com.hck.service.SpringTagUserService;

@SuppressWarnings("deprecation")
public class SpringTagUserController extends SimpleFormController {

	private SpringTagUserService springTagUserService;

	public SpringTagUserController()	{
		setCommandClass(SpringTagUser.class);
		setCommandName("user");
	}
	
	public void setUserService(SpringTagUserService userService) {
		this.springTagUserService = userService;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map referenceData = new HashMap();
		referenceData.put("countryList", springTagUserService.getAllCountries());
		referenceData.put("communityList", springTagUserService.getAllCommunities());
		return referenceData;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		SpringTagUser springTagUser = (SpringTagUser) command;
		springTagUserService.add(springTagUser);
		return new ModelAndView("springTaguserSuccess","user",springTagUser);
	}

}
