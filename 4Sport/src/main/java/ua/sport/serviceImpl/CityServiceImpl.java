package ua.sport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.sport.dao.CityDao;
import ua.sport.entity.City;
import ua.sport.service.CityService;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityDao cityDao;

	public void save(City city) {
		city.getName().toUpperCase();
		cityDao.save(city);
	}

	public List<City> findAll() {
		return cityDao.findAll();
	}
	public City findOne(int id) {
		return cityDao.findOne(id);
	}

	public void delete(int id) {
		cityDao.delete(id);
	}

}
