package com.example.demo.Service;

import com.example.demo.Model.Amount;
import com.example.demo.Model.Ingredient;
import com.example.demo.Model.Recipe;
import com.example.demo.Repository.IngredientRepository;
import com.example.demo.Repository.RecipeRepository;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;
    @Autowired
    IngredientRepository ingredientRepository;

    public Iterable<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public void addRecipe(String recipe) throws JSONException {
        List<Amount> amounts = new ArrayList<>();

        JSONObject jsonObject = new JSONObject(recipe);
        var name = jsonObject.getString("name");
        var amountArray = jsonObject.getJSONArray("amount");
        for (int o = 0; o < amountArray.length(); o++){
            JSONObject amountObject = (JSONObject) amountArray.get(o);
            var amount = amountObject.getLong("amount");
            var ingredient = amountObject.getJSONObject("ingredient");
            Gson gson = new Gson();
            Ingredient ingredient1 = gson.fromJson(String.valueOf(ingredient), Ingredient.class);

            amounts.add(new Amount(amount, ingredient1));
        }

        Recipe recipe1 = new Recipe(name, amounts);
        List<Amount> amounts2 = new ArrayList<>();
        for (Amount i : recipe1.getAmount()) {
            var ingredient = ingredientRepository.merge(i.getIngredient().getName());
            i.setIngredient(ingredient);
            i.setRecipe(recipe1);
            amounts2.add(i);
        }
        recipe1.setAmount(amounts2);
        recipeRepository.save(recipe1);
    }
}
