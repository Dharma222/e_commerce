package dev.bhargav.wipro.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddress {
    int doorNo;
    String streetName;
    String Layout ;
    String City;
    String pincode;
}
