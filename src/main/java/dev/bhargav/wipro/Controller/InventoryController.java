package dev.bhargav.wipro.Controller;

import dev.bhargav.wipro.Dtos.CustomerRequestdto;
import dev.bhargav.wipro.Dtos.InventoryRequestdto;
import dev.bhargav.wipro.Service.InventoryService;
import dev.bhargav.wipro.models.Customer;
import dev.bhargav.wipro.models.Inventory;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryController {
    public InventoryService inventoryService;
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("/api/inventory")
    public Inventory updateInventory(@RequestBody InventoryRequestdto inventoryRequestdto) {
        return inventoryService.addinventory(
                inventoryRequestdto.getId(),
                inventoryRequestdto.getProduct_id(),
                inventoryRequestdto.getQuantity());


    }

    @DeleteMapping("/api/inventory/{id}")
    public Inventory deleteinventory(@PathVariable("id") int Id)
    {
        return inventoryService.deleteinventory(Id);
    }

    @PutMapping("/api/updateinventory/{id}")
    public Inventory updateinventory(@PathVariable("id") int Id,@RequestBody InventoryRequestdto inventoryRequestdto)
    {
        return inventoryService.updateinventory(Id,
                inventoryRequestdto.getId(),
                inventoryRequestdto.getProduct_id(),
        inventoryRequestdto.getQuantity());
    }

    @GetMapping("/api/searchinventory/{id}")
    public Inventory searchcustomer(@PathVariable("id") int Id)
    {
        return inventoryService.getinventory(Id);
    }
}
