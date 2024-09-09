package dev.bhargav.wipro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerAddress {
    @Id
    int customer_id;
    int doorNo;
    String streetName;
    String Layout ;
    String City;
    String pincode;
}
