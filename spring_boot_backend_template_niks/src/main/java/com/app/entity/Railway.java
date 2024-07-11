package com.app.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

public class Railway {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	//@Column(nullable = false)
	String name;
	public Railway() {
	//	super();
		// TODO Auto-generated constructor stub
	}

	

	public Railway(Long id, String name, String start, String end, String source, String destination, String distance,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.start = start;
		this.end = end;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.category = category;
	}



	@Override
	public String toString() {
		return "Railway [id=" + id + ", name=" + name + ", start=" + start + ", end=" + end + ", source=" + source
				+ ", destination=" + destination + ", distance=" + distance + "]";
	}



	public String getStart() {
		return start;
	}



	public void setStart(String start) {
		this.start = start;
	}



	public String getEnd() {
		return end;
	}



	public void setEnd(String end) {
		this.end = end;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	//@Column(nullable = false)
	String start;
	//@Column(nullable = false)
	String end;
	//@Column(nullable = false)
	String source;
	//@Column(nullable = false)
	String destination;
	//@Column(nullable = false)
	String distance;
	
	@Enumerated(EnumType.STRING)
	Category category;
	
//	•	ID (unique identifier for each Railway, auto generated, starts from 1)
//	•	Name
//	•	Category (Enum, example: Express,Shatabdi,AC,Metro)
//	•	Start_time 
//	•	End_time
//	•	Source
//	•	Destiation
//	•	station_code
//	•	Distance
//	•	Frequency

}
