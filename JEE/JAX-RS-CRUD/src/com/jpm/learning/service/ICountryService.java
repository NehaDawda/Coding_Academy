package com.jpm.learning.service;

import java.util.List;

import com.jpm.learning.beans.Country;

public interface ICountryService {
	public List<Country> getAllCountries();
	public Country getCountry(int id);
	public Country addCountry(Country country);
	public Country deleteCountry(int id);
}
