package com.MahboubReda.Caloriestrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalorieService {
    @Autowired
    private CalorieRepository calorieRepository;

    public List<Calorie> allCalories(){
        return calorieRepository.findAll();
    }
}
