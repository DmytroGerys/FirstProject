package ua.sport.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.sport.entity.City;

public interface CityDao extends JpaRepository<City, Integer>{
	
}
