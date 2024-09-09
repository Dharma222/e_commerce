package dev.bhargav.wipro.Service;


import dev.bhargav.wipro.Dtos.OrderRequestdto;
import dev.bhargav.wipro.Repository.OrderRepository;
import dev.bhargav.wipro.Repository.ProductRepository;
import dev.bhargav.wipro.models.LineItem;
import dev.bhargav.wipro.models.Order;
import dev.bhargav.wipro.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addorder(int id, int item_id, int product_id, String product_name,
                          int price,int quantity) {
        OrderRequestdto order = new OrderRequestdto();
        order.setOrder_id(id);
        LineItem lineItem = new LineItem();
        lineItem.setItem_id(item_id);
        lineItem.setProduct_id(product_id);
        lineItem.setPrice(price);
        lineItem.setQuantity(quantity);
        lineItem.setProduct_name(product_name);
        order.setLine_item(lineItem);

        Order savedorder = new Order();
        savedorder.setOrder_id(id);
        savedorder.getLineItems().add(lineItem);


        return orderRepository.save(savedorder);
    }
    public Order getorder(int id) {
        return orderRepository.findById(id);
    }
    public Order deleteorder(int id) {
        return orderRepository.deleteById(id);
    }

    public Order updateOrder(int id ,int order_id,int item_id, int product_id, String product_name
    ,int price,int quantity) {
        Order order = orderRepository.findById(order_id);
        order.setOrder_id(id);
        LineItem lineItem = new LineItem();
        lineItem.setItem_id(item_id);
        lineItem.setProduct_id(product_id);
        lineItem.setPrice(price);
        lineItem.setQuantity(quantity);
        lineItem.setProduct_name(product_name);
        order.getLineItems().add(lineItem);

        return orderRepository.save(order);

    }
}
