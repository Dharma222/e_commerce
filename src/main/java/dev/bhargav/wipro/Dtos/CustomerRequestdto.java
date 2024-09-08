package dev.bhargav.wipro.Dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestdto {
    int id;
    String customername;
    String customermail;
    String customerbillingaddress;
    String customershippngaddress;
}
