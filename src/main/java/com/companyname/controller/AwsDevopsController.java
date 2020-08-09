package com.companyname.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsDevopsController {
	/*/getalldevopstools
	/getallawsservices*/
	
	@GetMapping("/getalldevopstools")
	public List<String> getAllDevopsTools(){
		return Arrays.asList("git","java","maven","jenkins","docker","k8s");
	}
}
