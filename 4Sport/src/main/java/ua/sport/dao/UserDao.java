package ua.sport.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.sport.entity.User;

public interface UserDao extends JpaRepository<User, Long>{

	User findByEmail(String username);

}