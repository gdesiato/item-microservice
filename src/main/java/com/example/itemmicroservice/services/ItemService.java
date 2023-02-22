package com.example.itemmicroservice.services;

import com.example.itemmicroservice.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public class ItemService {

    public Object getAllItems() {
        return null;
    }

    public Object getItemById(Long id) {
        return null;
    }

    public Item insertNewItem(Item item) {
        return item;
    }

    public Object updateItem(Item item) {
        return null;
    }

    public void deleteItemById(Long id) {
    }
}
