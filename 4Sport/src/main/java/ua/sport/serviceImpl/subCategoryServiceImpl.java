package ua.sport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.sport.dao.subCategoryDao;
import ua.sport.entity.subCategory;
import ua.sport.service.subCategoryService;
@Service
public class subCategoryServiceImpl implements subCategoryService{
	
	@Autowired
	private subCategoryDao subCategoryDao;

	public void save(subCategory subCategory) {
		subCategory.getName().toUpperCase();
		subCategoryDao.save(subCategory);
	}

	public List<subCategory> findAll() {
		return subCategoryDao.findAll();
	}

	public subCategory findOne(int id) {
		return subCategoryDao.findOne(id);
	}

	public void delete(int id) {
		subCategoryDao.delete(id);
	}

}
