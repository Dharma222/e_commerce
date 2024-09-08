package dev.bhargav.wipro.Dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestdto {
    private int product_id;
    private String product_name;
    private String product_description;
    private int product_price;
}
