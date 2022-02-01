package com.chompfooddeliveryapp.service.serviceImpl;

import com.chompfooddeliveryapp.exception.MenuNotFoundException;
import com.chompfooddeliveryapp.model.meals.MenuItem;
import com.chompfooddeliveryapp.repository.MenuItemRepository;
import com.chompfooddeliveryapp.service.serviceInterfaces.MenuItemService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImplementation implements MenuItemService {
    private MenuItemRepository menuItemRepository;

    public MenuServiceImplementation(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }


    @Override
    public MenuItem addMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    @Override
    public MenuItem updateMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);

    }

    @Override
    public MenuItem getMenuItemById(Long id) {
        return menuItemRepository.findMenuItemById(id).orElseThrow(()->new MenuNotFoundException("item by" +  id + "was not found"));
    }

    @Override
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    @Override
    public void deleteMenuItemById(Long id) {
        menuItemRepository.deleteEmployeeById(id);
    }
}
