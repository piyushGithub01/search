package org.search.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchApiController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SearchApiController.class);
	
	@RequestMapping(value = "/search-api/v1.0/hello/{name}", method = RequestMethod.GET)
	public @ResponseBody String getHelloName(@PathVariable("name") String name) {
		return "Hello " + name; 
	}

}
