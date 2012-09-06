package com.hck.service;

import java.util.ArrayList;
import java.util.List;

import com.hck.domain.Community;
import com.hck.domain.Country;
import com.hck.domain.SpringTagUser;

public class SpringTagUserServiceImpl implements SpringTagUserService {

	@Override
	public void add(SpringTagUser user) {
		//Persist the user object here. 
		System.out.println("SpringTagUser added successfully");

	}

	@SuppressWarnings("unchecked")
	@Override
	public List getAllCountries() {
		List countryList = new ArrayList();
		countryList.add(new Country(1,"India"));
		countryList.add(new Country(2,"USA"));
		countryList.add(new Country(3,"UK"));
		return countryList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List getAllCommunities() {
		List communityList = new ArrayList();
		communityList.add(new Community("Spring","Spring"));
		communityList.add(new Community("Hibernate","Hibernate"));
		communityList.add(new Community("Struts","Struts"));
		return communityList;
	}

}
