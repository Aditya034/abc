package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Railway;
import com.app.repository.RailwayDao;

@Service
public class RailwayServiceImpl implements RailwayService {

	@Autowired
	RailwayDao railwayDao;
	@Override
	public Railway insert(Railway r) {
		railwayDao.save(r);
		return r;
	}

	

	@Override
	public List<Railway> getAll() {
		
		return railwayDao.findAll();
	}

	@Override
	public String update(Railway r) {
		railwayDao.save(r);
		return "updated";
	}

	@Override
	public Railway getById(Long id) {
		Optional<Railway> r=railwayDao.findById(id);

		return r.get();
	}



	@Override
	public String delete(Long id) {
		Optional<Railway> r=railwayDao.findById(id);
		railwayDao.delete(r.get());
		return "Deleted";
	}

}
