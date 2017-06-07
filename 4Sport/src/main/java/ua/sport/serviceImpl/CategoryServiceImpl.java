package ua.sport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.sport.dao.CategoryDao;
import ua.sport.entity.Category;
import ua.sport.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao categoryDao;

	public void save(Category category) {
		category.getName().toUpperCase();
		categoryDao.save(category);
		
	}

	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	public Category findOne(int id) {
		return categoryDao.findOne(id);
	}

	public void delete(int id) {
		categoryDao.delete(id);
	}

}
