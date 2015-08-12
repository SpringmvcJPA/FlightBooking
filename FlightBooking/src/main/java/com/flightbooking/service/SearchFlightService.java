package com.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flightbooking.modelVO.SearchFlightDetailsVO;
import com.flightbooking.repository.SearchFlightRepository;

@Service
public class SearchFlightService {

	@Autowired
	private SearchFlightRepository searchFlightRep;
	
	public List<String> findPlaceList(){
		List<String> list = searchFlightRep.findPlaceList();
		
		System.out.println("Service List items" + list.get(0));
		return list;
	}
	
	@Transactional
	public SearchFlightDetailsVO save(SearchFlightDetailsVO serflightdetails){
		
		 return searchFlightRep.save(serflightdetails);
	}

	public List<SearchFlightDetailsVO> getSearchDetails() {
		// TODO Auto-generated method stub
		return searchFlightRep.getSearchDetails();
	}
	
	
}
