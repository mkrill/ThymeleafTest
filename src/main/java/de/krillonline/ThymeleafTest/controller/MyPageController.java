package de.krillonline.ThymeleafTest.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import de.krillonline.ThymeleafTest.Instrument;

@Controller
public class MyPageController {

	@GetMapping("/myPage")
	public String myPageController(Model model,
			@RequestParam(value = "instrument", required = false, defaultValue = "Schlagzeug") String pInstrument) {

		model.addAttribute("passedInstrument", pInstrument);
		return "myPage";
	}

	@GetMapping("/bandsearch")
	public String searchController(Model model) {

		Instrument guitar = new Instrument(1L, "guitar");
		Instrument drum = new Instrument(2L, "drum");
		Instrument trumpet = new Instrument(3L, "trumpet");
		
		model.addAttribute("instruments", Arrays.asList(guitar, drum, trumpet));
		
		return "bandsearch";
	}
	
//	@GetMapping("/searchresult")
//	public String resultController(@ModelAttribute("search") Search search) {
//
//		Instrument guitar = new Instrument(1L, "guitar");
//		Instrument drum = new Instrument(2L, "drum");
//		Instrument trumpet = new Instrument(3L, "trumpet");
//		
//		model.addAttribute("instruments", Arrays.asList(guitar, drum, trumpet));
//		
//		return "bandsearch";
//	}
	
}
