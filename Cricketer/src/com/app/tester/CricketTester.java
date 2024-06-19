package com.app.tester;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Cricketer;
import com.app.custom_ordering.CricketerComparator;
import com.app.utils.CricketUtils;



public class CricketTester {

	public static void main(String[] args) {
		
		try(Scanner sc= new Scanner(System.in)) {
			
			boolean exit = false;
			
			Map<String, Cricketer> map = new HashMap<>();
		//	String name,int age,String email_id,String Phone,int rating
			map.put("Adi@gmail.com",new Cricketer("Aditya",22,"Adi@gmail.com","4242525",9));
			map.put("ra@gmail.com",new Cricketer("Rahul",24,"ra@gmail.com","4242522345",8));
			map.put("pra@gmail.com",new Cricketer("Pranay",21,"pra@gmail.com","4245442525",7));
			map.put("ved@gmail.com",new Cricketer("Ved",23,"ved@gmail.com","42442525",10));
			
			while(!exit) {
				
				System.out.println("Choose option");
				System.out.println("1.Add Cricketer");
				System.out.println("2.Update Rating ");
				System.out.println("3.Search by Name");
				System.out.println("4.Display all cricketers");
				System.out.println("5.Sort by rating");
				System.out.println("6.Sort by Email");
				System.out.println("7.Display by age");
				System.out.println("8.delete cricketer");
				
				
				
				try {
					
					switch(sc.nextInt()) {
						
					case 1:
						System.out.println("Enter \r\n"
								+ "String name,int age,String email_id,String Phone,int rating");
					Cricketer cric=	CricketUtils.addCricketer(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),map);
						map.put(cric.getEmail(), cric);
						System.out.println("Cricketer added");
						break;
						
					case 2:
						System.out.println("Enter Email of cricketer rating");
						CricketUtils.updateCricketer(sc.next(),sc.nextInt(),map);
						System.out.println("Rating updated");
						break;
						
					case 3:
						System.out.println("Enter name of cricker");
						Cricketer c1=CricketUtils.searchByEmail(sc.next(),map);
						System.out.println(c1);
						break;
						
					case 4:
						System.out.println("All Cricketers");
						for(Cricketer c : map.values())
						System.out.println(c);
						break;
						
					case 5:
//					LinkedList< Cricketer>sortedCric = new LinkedList<Cricketer>(map.values());
//					Collections.sort(sortedCric, 
//							new CricketerComparator());
//					for(Cricketer c : sortedCric)
//						System.out.println(c);
				map.values().stream().sorted((v1,v2)->(int)(v1.getRating()-v2.getRating())).forEach((v)->System.out.println(v));	
						break;
					case 6:
						map.values().stream().sorted((v1,v2)->v1.getEmail().compareTo(v2.getEmail())).forEach((v)->System.out.println(v));
					break;
					
					case 7:
						 CricketUtils.displaybyAge(map);
						break;
						
					case 8:	
						System.out.println("Enter email");
						CricketUtils.deleteCricketer(sc.next(),map);
						System.out.println("Cricketer deleted");
						 break;
					
					case 0 :
						exit=true;
						break;
					}
					
				
					
						
						
					
				}
				catch(Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
				
				
				
			}
			
			
			
			
		}

	}

}
