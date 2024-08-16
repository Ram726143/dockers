package com.Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	@GetMapping("getdevval")
	public String getdov() {
		return "Onesoft mass hero jeeva";
	}

}
