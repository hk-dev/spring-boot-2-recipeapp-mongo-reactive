package com.github.recipeapp.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})
public class Category {

    private String id;
    private String description;
    private Set<Recipe> recipes = new HashSet<>();

}
