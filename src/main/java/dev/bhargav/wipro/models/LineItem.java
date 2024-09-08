package dev.bhargav.wipro.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LineItem {
    private int item_id;
    private int product_id;
    private String product_name;
    private int quantity;
    private double price;
}
