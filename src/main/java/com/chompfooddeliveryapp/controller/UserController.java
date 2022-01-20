package com.chompfooddeliveryapp.controller;

import com.chompfooddeliveryapp.dto.ChangePasswordDto;
import com.chompfooddeliveryapp.dto.EditUserDetailsDto;
import com.chompfooddeliveryapp.service.serviceImpl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;
    
    @GetMapping("/test")
    public String test(){
        return "Test passed.";
    }


@PostMapping("/profile/edit")
    public void updateUserDetails(@RequestBody EditUserDetailsDto userDetailsDto){
        userService.updateUser(userDetailsDto);
    }

    @PostMapping("/profile/edit/change_password")
    public void updatePassword(@RequestBody ChangePasswordDto changePasswordDto){
        userService.changePassword(changePasswordDto);
    }
}