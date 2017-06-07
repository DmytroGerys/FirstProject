package ua.sport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.sport.dao.CommodityDao;
import ua.sport.entity.Commodity;
import ua.sport.service.CommodityService;


@Service
public class CommodityServiceImpl implements CommodityService {

	@Autowired
	private CommodityDao commodityDao;
	
	public void save(Commodity commodity) {
		commodity.getName().toUpperCase();
		commodityDao.save(commodity);
	}

	public List<Commodity> findAll() {
		return commodityDao.findAll();
	}

	public Commodity findOne(int id) {
		return commodityDao.findOne(id);
	}

	public void delete(int id) {
		commodityDao.delete(id);
	}
	
	@Override
	public Commodity findByName(String name) {
		return commodityDao.findByName(name);
	}
	

}
