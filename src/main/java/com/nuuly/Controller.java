package com.nuuly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.*;

/**
 * This is our base API server to run HTTP requests against. Currently, these are set up to just return HTTP responses
 * and not actually do anything. Your goal is to make changes here using the rest of the example code to complete the
 * objectives.
 */
@RestController
public class Controller {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    private final ProducerService producer;

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    public Controller(ProducerService producer) {
        this.producer = producer;
    }

    /**
     * When garments are ready to be sold, a purchase order is issued to a seller that a certain
     * agreed upon quantity of a product is wanted. These products get allocated into our inventory.
     *
     * @param sku: The stock keeping unit as alphanumeric digits assigned to a product
     * @param receiptAmount: The number of SKUs that are received by this purchase order
     * @return That the purchase order was created
     */
    @PostMapping("/create")
    public ResponseEntity<?> createPurchaseOrder(
            @RequestParam("sku") String sku,
            @RequestParam("receiptAmount") int receiptAmount
    ) {
        return new ResponseEntity<>(CREATED);
    }

    /**
     * When a garment is actually purchased by us, we want to decrement the inventory to represent that the item was
     * purchased.
     *
     * @param sku: The item that was purchased
     * @param amount: How many of that item that was purchased
     * @return That the purchase was successful
     */
    @PostMapping("/purchase")
    public ResponseEntity<?> purchase(
            @RequestParam("sku") String sku,
            @RequestParam("amount") int amount
    ) {
        return new ResponseEntity<>(OK);
    }

    /**
     * From a business perspective, we want to understand what our customers like and don't like. We want to get a list
     * of favorite items ranked by how many were purchased.
     *
     * @return A list of favorite items
     */
    @GetMapping("/favorites")
    public ResponseEntity<?> favorites() {
        return new ResponseEntity<>(OK);
    }
}
