package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Railway;

public interface RailwayDao extends JpaRepository<Railway, Long> {

	
}
