package ua.sport.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.sport.entity.MeasuringSystem;
import ua.sport.dao.MeasuringSystemDao;
import ua.sport.service.MeasuringSystemService;
@Service
public class MeasuringSystemServiceImpl implements MeasuringSystemService{

	@Autowired
	private MeasuringSystemDao measuringSystemRepository;

	@Override
	public MeasuringSystem findOne(Long id) {
		return measuringSystemRepository.findOne(id);
	}

	@Override
	public List<MeasuringSystem> findAll() {
		return measuringSystemRepository.findAll();
	}

	@Override
	public void save(MeasuringSystem entity) {
		measuringSystemRepository.save(entity);
	}

	@Override
	public void delete(Long id) {
		measuringSystemRepository.delete(id);
	}
}