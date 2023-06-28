package sia.tacocloud.models;

import lombok.Data;
import sia.tacocloud.models.Taco;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryIndex;
    private String ccNumber;
    private String ccExpiration;
    private String ccCW;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }

}
