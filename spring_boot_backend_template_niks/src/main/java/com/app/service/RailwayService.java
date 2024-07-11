package com.app.service;

import java.util.List;

import com.app.entity.Railway;

public interface RailwayService {

	public Railway insert(Railway r);
	public String delete(Long id);
	public List<Railway> getAll();
	public String update(Railway r);
	public Railway getById(Long id);
}
