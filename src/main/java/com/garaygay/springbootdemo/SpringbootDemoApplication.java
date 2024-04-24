package com.garaygay.springbootdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RestController
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@GetMapping("/colormodels")
	public List<String> getColorModels() {
                // Create a new ArrayList to hold the color models
                List<String> colorModels = new ArrayList<>();

                // Add the required color models to the list
                colorModels.add("RGB");
                colorModels.add("RYB");
                colorModels.add("CMYK");

                // Return the list of color models
                return colorModels;
	}

	@GetMapping("/scores")
	public HashMap<String, Integer> getScores() {

                HashMap<String, Integer> scores = new HashMap<>();
                scores.put("A", 2);
                scores.put("B", 5);
                scores.put("C", 17);

                return scores;
	}
}
