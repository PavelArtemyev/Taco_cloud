package ru.app.tacocloud.data;

import ru.app.tacocloud.dto.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository {

    List<Ingredient> findAll();

    Optional<Ingredient> findById(Integer id);

    Ingredient save(Ingredient ingredient);
}
