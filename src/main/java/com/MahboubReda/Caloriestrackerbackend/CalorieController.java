package com.MahboubReda.Caloriestrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api/v1/calories")
public class CalorieController {
    @Autowired
    private CalorieService calorieService;
    @GetMapping
    public ResponseEntity<List<Calorie>> getAllCalories(){
        return new ResponseEntity<List<Calorie>>(calorieService.allCalories(), HttpStatus.OK);
    }
}
