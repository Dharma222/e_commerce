package dev.bhargav.wipro.Service;


import dev.bhargav.wipro.Repository.InventoryRepository;
import dev.bhargav.wipro.models.Customer;
import dev.bhargav.wipro.models.Inventory;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public InventoryRepository inventoryRepository;
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }
    public Inventory addinventory(int id, int productid , int qunatity )
    {
        Inventory inventory = new Inventory();
        inventory.setInventory_id(id);
        inventory.setProduct_id(productid);
        inventory.setQuantity(qunatity);
        return inventoryRepository.save(inventory);
    }

    public Inventory deleteinventory(int id) {
        return inventoryRepository.deleteById(id);
    }

    public Inventory getinventory(int id) {
        return inventoryRepository.findById(id);
    }

    public Inventory updateinventory(int id,int inventoryid, int productid, int qunatity) {
        Inventory inventory = getinventory(id);
        inventory.setInventory_id(inventoryid);
        inventory.setProduct_id(productid);
        inventory.setQuantity(qunatity);
        return inventoryRepository.save(inventory);
    }
}
