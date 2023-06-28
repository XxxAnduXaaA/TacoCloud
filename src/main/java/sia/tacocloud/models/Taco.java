package sia.tacocloud.models;

import lombok.Data;
import sia.tacocloud.models.Ingredient;

import java.util.List;

@Data
public class Taco {

    private String name;
    private List<Ingredient> ingredients;

}
