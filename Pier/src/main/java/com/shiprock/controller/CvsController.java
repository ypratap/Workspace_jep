package com.shiprock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shiprock.service.CvsService;

@Controller
public class CvsController {

	
	
	@Autowired
	private CvsService service;
	
	
	
}
