package com.example.demo.Repository;

import com.example.demo.Model.Ingredient;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;

public interface IngredientRepository extends Neo4jRepository<Ingredient, Long> {
    @Query("merge(n:Ingredient {name: {name}}) return n")
    Ingredient merge(@Param("name") String name);

    @Query("\t\t\tCREATE (BananaCake:Recipe {name:'BananaCake'}) \n" +
            "            CREATE (Burger:Recipe {name:'Burger'}) \n" +
            "            CREATE (Pizza:Recipe {name:'Pizza'}) \n" +
            "            CREATE (Smoothie:Recipe {name:'Smoothie'}) \n" +
            "            CREATE (Lasagne:Recipe {name:'Lasagne'}) \n" +
            "            CREATE (Chicken:Recipe {name:'Chicken'}) \n" +
            "            CREATE (Tortellini:Recipe {name:'Tortellini'}) \n" +
            "            CREATE (HotDog:Recipe {name:'Hot Dog'}) \n" +
            "            CREATE (MangoSalad:Recipe {name:'Mango Salad'}) \n" +
            "            CREATE (PorkChops:Recipe {name:'Pork Chops'}) \n" +
            "            CREATE (ChocolateChipCookies:Recipe {name:'Chocolate Chip Cookies'}) \n" +
            "            CREATE (BananaSplit:Recipe {name:'Banana Split'}) \n" +
            "            CREATE (Fajitas:Recipe {name:'Fajitas'}) \n" +
            "            CREATE (HoneyChicken:Recipe {name:'Honey Chicken'}) \n" +
            "            CREATE (Banana:Ingredient {name:'Banana'}) \n" +
            "            CREATE (Flour:Ingredient {name:'Flour'}) \n" +
            "            CREATE (Sugar:Ingredient {name:'Sugar'}) \n" +
            "            CREATE (Butter:Ingredient {name:'Butter'}) \n" +
            "            CREATE (Honey:Ingredient {name:'Honey'}) \n" +
            "            CREATE (Tomato:Ingredient {name:'Tomato'}) \n" +
            "            CREATE (Pasta:Ingredient {name:'Pasta'}) \n" +
            "            CREATE (Rice:Ingredient {name:'Rice'}) \n" +
            "            CREATE (ChickenBreast:Ingredient {name:'Chicken Breast'}) \n" +
            "            CREATE (Sausage:Ingredient {name:'Sausage'}) \n" +
            "            CREATE (Pork:Ingredient {name:'Pork'}) \n" +
            "            CREATE (Barbecue:Ingredient {name:'Barbecue'}) \n" +
            "            CREATE (Broccoli:Ingredient {name:'Broccoli'}) \n" +
            "            CREATE (BellPepper:Ingredient {name:'Bell pepper'}) \n" +
            "            CREATE (TomatoSauce:Ingredient {name:'Tomato Sauce'}) \n" +
            "            CREATE (Cheese:Ingredient {name:'Cheese'}) \n" +
            "            CREATE (Carrot:Ingredient {name:'Carrot'}) \n" +
            "            CREATE (Strawberry:Ingredient {name:'Strawberry'}) \n" +
            "            CREATE (Blueberry:Ingredient {name:'Blueberry'}) \n" +
            "            CREATE (Raspberry:Ingredient {name:'Raspberry'}) \n" +
            "            CREATE (Milk:Ingredient {name:'Milk'}) \n" +
            "            CREATE (Salt:Ingredient {name:'Salt'}) \n" +
            "            CREATE (Pepper:Ingredient {name:'Pepper'}) \n" +
            "            CREATE (OliveOil:Ingredient {name:'OliveOil'}) \n" +
            "            CREATE (Cream:Ingredient {name:'Cream'}) \n" +
            "            CREATE (Ketchup:Ingredient {name:'Ketchup'}) \n" +
            "            CREATE (Mustard:Ingredient {name:'Mustard'}) \n" +
            "            CREATE (Onions:Ingredient {name:'Onions'}) \n" +
            "            CREATE (Iceberg:Ingredient {name:'Iceberg'}) \n" +
            "            CREATE (Bread:Ingredient {name:'Bread'}) \n" +
            "            CREATE (Mango:Ingredient {name:'Mango'}) \n" +
            "            CREATE \n" +
            "            (Banana)-[:USED_IN {amount: 200}]->(BananaCake), \n" +
            "            (Flour)-[:USED_IN {amount: 100}]->(BananaCake), \n" +
            "            (Sugar)-[:USED_IN {amount: 500}]->(BananaCake), \n" +
            "            (Cheese)-[:USED_IN {amount: 100}]->(Burger), \n" +
            "            (Ketchup)-[:USED_IN {amount: 5}]->(Burger), \n" +
            "            (Mustard)-[:USED_IN {amount: 1}]->(Burger), \n" +
            "            (Onions)-[:USED_IN {amount: 50}]->(Burger), \n" +
            "            (Tomato)-[:USED_IN {amount: 100}]->(Burger), \n" +
            "            (Iceberg)-[:USED_IN {amount: 200}]->(Burger), \n" +
            "            (TomatoSauce)-[:USED_IN {amount: 200}]->(Pizza), \n" +
            "            (Cheese)-[:USED_IN {amount: 200}]->(Pizza), \n" +
            "            (Pork)-[:USED_IN {amount: 200}]->(Pizza), \n" +
            "            (Strawberry)-[:USED_IN {amount: 100}]->(Smoothie), \n" +
            "            (Milk)-[:USED_IN {amount: 400}]->(Smoothie), \n" +
            "            (Cream)-[:USED_IN {amount: 100}]->(Smoothie), \n" +
            "            (Blueberry)-[:USED_IN {amount: 100}]->(Smoothie), \n" +
            "            (Raspberry)-[:USED_IN {amount: 100}]->(Smoothie), \n" +
            "            (Pasta)-[:USED_IN {amount: 100}]->(Lasagne), \n" +
            "            (TomatoSauce)-[:USED_IN {amount: 500}]->(Lasagne), \n" +
            "            (Cream)-[:USED_IN {amount: 100}]->(Lasagne), \n" +
            "            (Cheese)-[:USED_IN {amount: 500}]->(Lasagne), \n" +
            "            (ChickenBreast)-[:USED_IN {amount: 100}]->(Chicken), \n" +
            "            (Salt)-[:USED_IN {amount: 500}]->(Chicken), \n" +
            "            (Pepper)-[:USED_IN {amount: 100}]->(Chicken), \n" +
            "            (Pasta)-[:USED_IN {amount: 500}]->(Tortellini), \n" +
            "            (Cream)-[:USED_IN {amount: 100}]->(Tortellini), \n" +
            "            (Bread)-[:USED_IN {amount: 500}]->(HotDog), \n" +
            "            (Sausage)-[:USED_IN {amount: 500}]->(HotDog), \n" +
            "            (Ketchup)-[:USED_IN {amount: 500}]->(HotDog), \n" +
            "            (Mustard)-[:USED_IN {amount: 100}]->(HotDog), \n" +
            "            (BellPepper)-[:USED_IN {amount: 200}]->(MangoSalad), \n" +
            "            (Mango)-[:USED_IN {amount: 400}]->(MangoSalad), \n" +
            "            (Iceberg)-[:USED_IN {amount: 500}]->(MangoSalad), \n" +
            "            (Mustard)-[:USED_IN {amount: 100}]->(MangoSalad), \n" +
            "            (Pork)-[:USED_IN {amount: 500}]->(PorkChops), \n" +
            "            (Barbecue)-[:USED_IN {amount: 100}]->(PorkChops), \n" +
            "            (Flour)-[:USED_IN {amount: 500}]->(ChocolateChipCookies), \n" +
            "            (Milk)-[:USED_IN {amount: 100}]->(ChocolateChipCookies), \n" +
            "            (Cream)-[:USED_IN {amount: 500}]->(ChocolateChipCookies), \n" +
            "            (Flour)-[:USED_IN {amount: 500}]->(BananaSplit), \n" +
            "            (Milk)-[:USED_IN {amount: 100}]->(BananaSplit), \n" +
            "            (Cream)-[:USED_IN {amount: 500}]->(BananaSplit), \n" +
            "            (Banana)-[:USED_IN {amount: 100}]->(BananaSplit), \n" +
            "            (ChickenBreast)-[:USED_IN {amount: 500}]->(Fajitas), \n" +
            "            (Ketchup)-[:USED_IN {amount: 100}]->(Fajitas), \n" +
            "            (ChickenBreast)-[:USED_IN {amount: 500}]->(HoneyChicken), \n" +
            "            (Honey)-[:USED_IN {amount: 100}]->(HoneyChicken), \n" +
            "            (Salt)-[:USED_IN {amount: 500}]->(HoneyChicken);")
     void addData();
}
