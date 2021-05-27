package com.example.demo.Service;

import com.example.demo.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private IngredientRepository ingredientRepository;

    public void getData(){
        ingredientRepository.addData();
    }
}
