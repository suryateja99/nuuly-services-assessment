package com.nully;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class PurchaseRequest {

    @Id
    private Long itemId;

    private int quantity;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
