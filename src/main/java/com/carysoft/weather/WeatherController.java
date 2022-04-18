package com.carysoft.weather;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class WeatherController {


    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String getWeather(Model model){

        //model.addAttribute("currentWeather", weatherService.getCurrentWeather(reqZipForm));
        return "index";

    }

    @PostMapping("/")
    public String postHomeView(Model model, @RequestParam String reqZipForm){
        model.addAttribute("currentWeather", weatherService.getCurrentWeather(reqZipForm));
        return "index";
    }

}
