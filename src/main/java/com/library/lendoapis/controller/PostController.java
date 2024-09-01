package com.library.lendoapis.controller;

import com.library.lendoapis.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public ResponseEntity<String> getPosts() {
        return ResponseEntity.ok(postService.getPost());
    }

    @GetMapping("/{postId}/comments")
    public ResponseEntity<String> getPostComments(@PathVariable Long postId) {
        String comments = postService.getPostComments(postId);
        return ResponseEntity.ok(comments);
    }

}
