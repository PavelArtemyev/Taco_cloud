package ru.app.tacocloud.converter;

import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.app.tacocloud.data.IngredientRepository;
import ru.app.tacocloud.dto.Ingredient;

@Component
@RequiredArgsConstructor
public class IngredientByConverter implements Converter<Integer, Ingredient> {

    private final IngredientRepository ingredientRepository;

    @Override
    public Ingredient convert(Integer id) {
        return ingredientRepository.findById(id).orElse(null);
    }
}
