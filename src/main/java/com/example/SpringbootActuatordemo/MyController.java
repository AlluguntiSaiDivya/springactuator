package com.example.SpringbootActuatordemo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/getData")
	public Map<String,String> getData(){
		return Map.of("Sai","Divvya");
	}

}
