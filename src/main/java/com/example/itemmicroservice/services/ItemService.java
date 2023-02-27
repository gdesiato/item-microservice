package com.example.itemmicroservice.services;

import com.example.itemmicroservice.models.Item;
import com.example.itemmicroservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Object getAllItems() {
        return null;
    }

    public Object getItemById(Long id) {
        Optional<Item> optional;
        if ((optional = itemRepository.findById(id)).isEmpty()) {
            return null;
        } else {
            return optional.get();
        }
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
