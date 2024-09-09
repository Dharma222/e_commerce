package dev.bhargav.wipro.Controller;


import dev.bhargav.wipro.Dtos.CartRequestdto;
import dev.bhargav.wipro.Service.CartService;
import dev.bhargav.wipro.models.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add/cart")
    public Cart addCart(CartRequestdto cartRequestdto) {
        return cartService.addCart(
                cartRequestdto.getLineItem().getItem_id(),
                cartRequestdto.getLineItem().getProduct_name(),
                cartRequestdto.getLineItem().getProduct_id(),
                cartRequestdto.getLineItem().getPrice(),
                cartRequestdto.getLineItem().getQuantity());
    }

    @PutMapping("/api/updatecart/{id}")
    public Cart updateCart(@PathVariable("id") int id, @RequestBody CartRequestdto cartRequestdto) {
        return cartService.updateCart(id, cartRequestdto.getId(),
                cartRequestdto.getLineItem().getItem_id(),
                cartRequestdto.getLineItem().getProduct_id(),
                cartRequestdto.getLineItem().getProduct_name(),
                cartRequestdto.getLineItem().getPrice(),
                cartRequestdto.getLineItem().getQuantity());

    }

    @GetMapping("/api/getcart/{id}")
    public Cart getCartById(@PathVariable int id) {
        return cartService.getCart(id);
    }

    @DeleteMapping("/api/deletecart/{id}")
    public Cart DeleteCartById(@PathVariable int id) {
        return cartService.deleteCart(id);
    }


}
