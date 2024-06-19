package com.app.utils;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.CredentialException;

import com.app.core.Cricketer;
import com.app.exception.CricketException;

public class CricketUtils {
    
//		public static Map<Integer, Cricketer> populateCricket(){
//			
//		}
	
	
	
	
//	String name,int age,String email_id,String Phone,int rating
	 
	public static Cricketer addCricketer(String name, int age, String email, String phone, int rating,
			Map<String, Cricketer> map) {
		
		return new Cricketer(name,age,email,phone,rating);
			
	}

	public static int updateCricketer(String email,int rating ,Map<String, Cricketer> map)throws CricketException {
	
	
		Cricketer cric= map.get(email);
		if(cric ==null) {
			throw new CricketException("NO cricketer found");
		}
		cric.setRating(rating);
		return cric.getRating();
		
		
		
	}

	public static Cricketer searchByEmail(String email, Map<String, Cricketer> map) {
			Cricketer cric= map.get(email);
			
			return cric;
		
	}

	public static void displaybyAge(Map<String, Cricketer> map) {
		// TODO Auto-generated method stub
		map.values().stream().forEach((v1)->{if(v1.getAge()>22)
		{System.out.println(v1);} });
	}

	public static void deleteCricketer(String email,Map<String, Cricketer> map) {
	
		map.remove(email);
	}

	


		
	}

	

	


