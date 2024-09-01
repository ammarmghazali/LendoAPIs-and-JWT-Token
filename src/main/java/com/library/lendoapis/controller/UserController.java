package com.library.lendoapis.controller;

import com.library.lendoapis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }


    @GetMapping("/{userId}/posts")
    public ResponseEntity<String> getUserPosts(@PathVariable Long userId) {
        String posts = userService.getUserPosts(userId);
        return ResponseEntity.ok(posts);
    }
}
