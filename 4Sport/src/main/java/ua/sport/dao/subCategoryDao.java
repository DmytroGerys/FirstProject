package ua.sport.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.sport.entity.subCategory;

public interface subCategoryDao extends JpaRepository<subCategory, Integer>{
	
}
