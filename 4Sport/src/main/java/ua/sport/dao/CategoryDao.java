package ua.sport.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.sport.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
