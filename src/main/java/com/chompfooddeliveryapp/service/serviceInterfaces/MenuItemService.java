package com.chompfooddeliveryapp.service.serviceInterfaces;

import java.io.IOException;
import java.util.List;
//import java.util.Optional;
import com.chompfooddeliveryapp.dto.MenuItemDto;
import com.chompfooddeliveryapp.model.enums.MenuCategory;
import com.chompfooddeliveryapp.model.meals.MenuItem;
import com.chompfooddeliveryapp.payload.MenuResponse;
import com.chompfooddeliveryapp.payload.UserFetchAllMealsResponse;


public interface MenuItemService {

    MenuResponse updateMenuItem(Long id, MenuItemDto menuItemDto) throws IOException;
    MenuItem getMenuItemById(Long id);
    List<MenuItem> getAllMenuItems();
    void deleteMenuItemById(Long id);
    UserFetchAllMealsResponse fetchAllMeals(Integer pageNo, Integer pageSize, String sortBy);
    UserFetchAllMealsResponse fetchMealsByKeyWord(String keyword, int pageNo, int pageSize);
    UserFetchAllMealsResponse fetchMealsByCategory(MenuCategory category, int pageNo, int pageSize);
    MenuResponse addMenuItem(MenuItemDto menuItemDto) throws IOException;






}
