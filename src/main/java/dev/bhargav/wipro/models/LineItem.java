package dev.bhargav.wipro.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LineItem {
    @Id
    private int item_id;
    private int product_id;
    private String product_name;
    private int quantity;
    private int price;
}
