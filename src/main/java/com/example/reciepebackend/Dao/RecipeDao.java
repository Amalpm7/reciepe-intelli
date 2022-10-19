package com.example.reciepebackend.Dao;

import com.example.reciepebackend.Model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {
}
