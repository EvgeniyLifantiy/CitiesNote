package com.SberStart.CityNote.Controllers;


import com.SberStart.CityNote.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    public Controller(Main main) {
        this.main = main;
    }

    Main main;

    @GetMapping("/{fileName}")
    public String addCities(@PathVariable String fileName){
        return main.main(fileName);
    }

    @GetMapping("/Name")
    public String sortByName(){
        return main.sortCitiesByName();
    }

    @GetMapping("/District")
    public String sortByDistrict(){
        return main.sortCitiesByDistrict();
    }
}
