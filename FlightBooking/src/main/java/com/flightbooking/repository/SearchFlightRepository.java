package com.flightbooking.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.flightbooking.modelVO.SearchFlightDetailsVO;

@Repository
public class SearchFlightRepository {
	
	@PersistenceContext
	private EntityManager em;

	public List<String> findPlaceList(){
		
		List<String> placeList=new ArrayList<String>();
		
		placeList.add("New York");
		placeList.add("New Jersey");
		placeList.add("Paris");
		placeList.add("London");
		placeList.add("India");
		placeList.add("Charllote");

		return placeList;
		
	}

	

	public SearchFlightDetailsVO save(SearchFlightDetailsVO serflightdetails) {
		
		System.out.println("*****Inside Repository******");
		System.out.println("*****Entity manager status"+ em.isOpen());
		
	
		
		em.persist(serflightdetails);
		
		em.flush();
		
		return serflightdetails;
			
		
	}



	public List<SearchFlightDetailsVO> getSearchDetails() {
		
		Query query=em.createQuery("select s from SearchFlightDetailsVO s");
		
		List searchdetails =query.getResultList();
		
				
		return searchdetails;
	}
}
