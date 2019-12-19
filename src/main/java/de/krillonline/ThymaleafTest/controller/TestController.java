package de.krillonline.ThymaleafTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/myPage")
	public String mainController(Model model,
			@RequestParam(value = "instrument", required = false, defaultValue = "Schlagzeug") String pInstrument) {

		
		model.addAttribute("instrument", pInstrument);
		return "myPage";
	}

}
