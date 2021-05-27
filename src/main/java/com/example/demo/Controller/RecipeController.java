package com.example.demo.Controller;

import com.example.demo.Model.Recipe;
import com.example.demo.Service.RecipeService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    @Autowired
    RecipeService recipeService;

    @GetMapping
    public Iterable<Recipe> findAll(){
        return recipeService.getAll();
    }

    @PostMapping
    public void addRecipe(@RequestBody String recipe) throws JSONException {
        recipeService.addRecipe(recipe);
    }
}
