package dev.bhargav.wipro.Controller;


import dev.bhargav.wipro.Dtos.OrderRequestdto;
import dev.bhargav.wipro.Service.OrderService;
import dev.bhargav.wipro.models.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/api/addorder")
    private Order addOrder(@RequestBody OrderRequestdto orderRequestdto)
    {
        return orderService.addorder(orderRequestdto.getOrder_id(),
                orderRequestdto.getLine_item().getItem_id(),
                orderRequestdto.getLine_item().getProduct_id(),
                orderRequestdto.getLine_item().getProduct_name(),
                orderRequestdto.getLine_item().getPrice(),
                orderRequestdto.getLine_item().getQuantity());
    }

    @GetMapping("/api/serachorder/{id}")
    private Order searchOrder(@PathVariable("id") int id)
    {
        return orderService.getorder(id);
    }

    @DeleteMapping("/api/deleteOrder/{id}")
    private Order deleteOrder(@PathVariable("id") int id)
    {
        return orderService.deleteorder(id);
    }

    @PutMapping("/api/updateorder/{id}")
    private Order updateOrder(@PathVariable int id, @RequestBody OrderRequestdto orderRequestdto)
    {
        return orderService.updateOrder(id,
        orderRequestdto.getOrder_id(),
        orderRequestdto.getLine_item().getItem_id(),
        orderRequestdto.getLine_item().getProduct_id(),
        orderRequestdto.getLine_item().getProduct_name(),
        orderRequestdto.getLine_item().getPrice(),
        orderRequestdto.getLine_item().getQuantity());

    }
}
