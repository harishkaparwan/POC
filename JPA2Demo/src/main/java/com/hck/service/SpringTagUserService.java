package com.hck.service;

import java.util.List;

import com.hck.domain.Community;
import com.hck.domain.Country;
import com.hck.domain.SpringTagUser;

public interface SpringTagUserService {

	public void add(SpringTagUser user);
	public List<Country> getAllCountries();
	public List<Community> getAllCommunities(); 
}
