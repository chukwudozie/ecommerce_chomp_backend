package com.chompfooddeliveryapp.controller;

import com.chompfooddeliveryapp.model.carts.CartDTO;
import com.chompfooddeliveryapp.service.serviceInterfaces.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add/{userId}/{menuId}")
    public ResponseEntity<?> addToCart(@RequestBody CartDTO cartDTO,
             @PathVariable Long userId, @PathVariable Long menuId){
       return cartService.addToCart(cartDTO,userId,menuId);
    }

    @PostMapping("/decrement/{userId}/{menuId}")
    public ResponseEntity<?> decrementCartItem(@PathVariable Long userId, @PathVariable Long menuId){
        return cartService.reduceCartItemQty(userId,menuId);
    }

    @DeleteMapping("/delete/{userId}/{menuId}")
        public ResponseEntity<?> deleteProductFromCart(@PathVariable Long userId, @PathVariable Long menuId){
            return cartService.deleteCartItem(userId,menuId);
        }

        @GetMapping("/viewCart/{cartId}")
    public ResponseEntity<?> viewCartItems(@PathVariable Long cartId){
        return cartService.findAllProductsByUser(cartId);
        }
    }

