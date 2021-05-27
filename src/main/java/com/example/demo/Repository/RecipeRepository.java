package com.example.demo.Repository;
import com.example.demo.Model.Recipe;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
public interface RecipeRepository extends Neo4jRepository<Recipe, Long> {
}
