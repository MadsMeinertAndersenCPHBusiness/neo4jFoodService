package com.example.demo.Service;

import com.example.demo.Model.Ingredient;
import com.example.demo.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
    @Autowired
    IngredientRepository ingredientRepository;

    public Ingredient merge(String name){
        return ingredientRepository.merge(name);
    }
}
