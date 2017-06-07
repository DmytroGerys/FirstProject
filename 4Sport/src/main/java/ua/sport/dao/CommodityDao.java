package ua.sport.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.sport.entity.Commodity;

public interface CommodityDao extends JpaRepository<Commodity, Integer>{

	Commodity findByName(String name);

}
