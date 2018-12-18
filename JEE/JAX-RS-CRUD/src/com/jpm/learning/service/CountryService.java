package com.jpm.learning.service;

import java.util.List;

import com.jpm.learning.beans.Country;
import com.jpm.learning.dao.CountryDAOImpl;
import com.jpm.learning.dao.ICountryDAO;

public class CountryService implements ICountryService {
	ICountryDAO dao;

	public CountryService() {
		dao = new CountryDAOImpl();
	}

	/**
	 * Fetching all details of countries
	 * 
	 * @return List<Country>
	 */
	public List<Country> getAllCountries() {
		return dao.getAllCountries();
	}

	/**
	 * Fetching single country details
	 * 
	 * @param id
	 * @return Country
	 */
	public Country getCountry(int id) {
		return dao.getCountry(id);
	}

	/**
	 * Creating a new Country
	 * 
	 * @param country
	 * @return Country
	 */
	public Country addCountry(Country country) {
		return dao.addCountry(country);
	}

	/**
	 * Deleting an existing country
	 * 
	 * @param id
	 * @return Country
	 */
	public Country deleteCountry(int id) {
		return dao.deleteCountry(id);
	}

}
