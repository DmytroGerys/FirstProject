package ua.sport.service;

import java.util.List;

import ua.sport.entity.subCategory;

public interface subCategoryService {
	
	void save(subCategory subCategory);
	List<subCategory> findAll();
	subCategory findOne(int id);
	void delete(int id);

}
