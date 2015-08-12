package com.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flightbooking.model.SearchFlightDetails;
import com.flightbooking.modelVO.SearchFlightDetailsVO;
import com.flightbooking.service.SearchFlightService;

@Controller
public class SearchFlightController {
	@Autowired
	private SearchFlightService searchflightSer;
	
	@RequestMapping(value="/searchflight", method=RequestMethod.GET)
	public String searchFlight(Model model){
		
		List<String> list= searchflightSer.findPlaceList();
		System.out.println("List size" + list.size() +"List Item" + list.get(0));
		
		model.addAttribute("searchflight",new SearchFlightDetails());
		model.addAttribute("fromPlaceList", list );
		
		return"searchflight";
	}
	
	@RequestMapping(value="/searchflight", method=RequestMethod.POST)
	public String SubmitsearchFlight(Model model,@ModelAttribute("searchflight") SearchFlightDetailsVO flightdetails){
		
		
		System.out.println("This is searchflight controller get from place"+ flightdetails.getFromPlace());
		
		searchflightSer.save(flightdetails);
		
		//Model model=new Model();
		
		List<String> list= searchflightSer.findPlaceList();
		model.addAttribute("fromPlaceList", list );
		
		model.addAttribute("searchflight",flightdetails);
		
		return"searchflight";
	}
	
	
	@RequestMapping(value="/getSearchDetails", method=RequestMethod.GET)
	public String getSearchFlightDetails(Model model){
		
		List<SearchFlightDetailsVO> searchFlightDetails= searchflightSer.getSearchDetails();
		
		model.addAttribute("searchflightdetails",searchFlightDetails);
		
		
		return"getSearchDetails";
	}
}
