package ua.sport.service;

import java.util.List;

import ua.sport.entity.Commodity;

public interface CommodityService {
	
	void save(Commodity commodity);
	List<Commodity> findAll();
	Commodity findOne(int id);
	void delete(int id);
	Commodity findByName(String name);

}
