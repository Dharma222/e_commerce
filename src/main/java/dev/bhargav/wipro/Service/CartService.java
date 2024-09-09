package dev.bhargav.wipro.Service;


import dev.bhargav.wipro.Dtos.CartRequestdto;
import dev.bhargav.wipro.Repository.CartRepository;
import dev.bhargav.wipro.models.Cart;
import dev.bhargav.wipro.models.LineItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart addCart(int item_id,String product_name, int product_id, int price, int quantity) {
        CartRequestdto cartRequestdto = new CartRequestdto();
        cartRequestdto.setId(item_id);
        LineItem lineItem = new LineItem();
        lineItem.setItem_id(item_id);
        lineItem.setProduct_id(product_id);
        lineItem.setQuantity(quantity);
        lineItem.setProduct_name(product_name);
        lineItem.setPrice(price);

        cartRequestdto.setLineItem(lineItem);
        Cart cart = new Cart();
        cart.setId(item_id);
        cart.getItems().add(lineItem);
        return cartRepository.save(cart);

    }

    public Cart getCart(int id) {
        return cartRepository.findById(id);
    }

    public Cart updateCart(int id, int cart_id, int item_id, int product_id, String product_name, int price, int quantity) {
        Cart cart = getCart(id);
        cart.setId(cart_id);
        LineItem lineItem = new LineItem();
        lineItem.setItem_id(item_id);
        lineItem.setProduct_id(product_id);
        lineItem.setQuantity(quantity);
        lineItem.setProduct_name(product_name);
        lineItem.setPrice(price);
        cart.getItems().add(lineItem);
        return cartRepository.save(cart);
    }

    public Cart deleteCart(int id) {
        Cart cart = getCart(id);
        cartRepository.deleteById(id);
        return cart;
    }


}
