package ua.sport.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.sport.entity.MeasuringSystem;

public interface MeasuringSystemDao extends JpaRepository<MeasuringSystem, Long>{

}