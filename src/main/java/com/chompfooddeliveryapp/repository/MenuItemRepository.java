package com.chompfooddeliveryapp.repository;

import com.chompfooddeliveryapp.model.meals.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long>{

    Optional<MenuItem> findMenuItemById(Long id);
    void deleteById(Long id);

}
