package com.example.reciepebackend.Controller;


import com.example.reciepebackend.Dao.RecipeDao;
import com.example.reciepebackend.Model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private RecipeDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addReciepe(@RequestBody RecipeModel recipe){
        dao.save(recipe);
        return "{'status':'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<RecipeModel> viewReciepe(){
        return (List<RecipeModel>) dao.findAll();
    }

}
