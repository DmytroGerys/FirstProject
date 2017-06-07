package ua.sport.service;

import java.util.List;

import ua.sport.entity.Category;

public interface CategoryService {
	
	void save(Category category);
	List<Category> findAll();
	Category findOne(int id);
	void delete(int id);


}
