package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Company;

public interface CompanyService {
	public String addcompany(Company company);
	public List<Company> viewallcompanies();
	public List<Company> viewallcompaniesincity(String cityname);
	public Company viewcompanybyid(int id);
	public void deletecompanybyid(int id);
}
