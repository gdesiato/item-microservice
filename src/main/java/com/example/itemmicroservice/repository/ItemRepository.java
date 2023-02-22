package com.example.itemmicroservice.repository;

import com.example.itemmicroservice.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <Item, Long> {
}
