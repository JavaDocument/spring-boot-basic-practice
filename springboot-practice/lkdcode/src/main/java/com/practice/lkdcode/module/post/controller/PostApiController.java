package com.practice.lkdcode.module.post.controller;

import com.practice.lkdcode.global.response.PostResponse;
import com.practice.lkdcode.module.post.controller.dto.request.PostRequestDTO;
import com.practice.lkdcode.module.post.controller.dto.response.PostResponseDTO;
import com.practice.lkdcode.module.post.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostApiController {
    private final PostService postService;

    @GetMapping("{id}")
    public PostResponse<PostResponseDTO.Get> getPostById(
            @PathVariable(name = "id") final Long id
    ) {
        PostResponseDTO.Get response = postService.loadFindById(id);
        return PostResponse.ok(response);
    }

    @GetMapping
    public PostResponse<List<PostResponseDTO.Get>> getAllPosts(
            @PageableDefault(size = 3, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable
    ) {
        List<PostResponseDTO.Get> responseList = postService.loadFindAll(pageable);
        return PostResponse.ok(responseList);
    }

    @GetMapping("/search/{keyword}")
    public PostResponse<List<PostResponseDTO.Get>> retrievePostsByKeyword(
            @PathVariable(name = "keyword") String keyword,
            @PageableDefault(size = 3, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable
    ) {
        List<PostResponseDTO.Get> responseList = postService.loadFindByTitleContaining(keyword, pageable);
        return PostResponse.ok(responseList);
    }

    @PostMapping
    public PostResponse<PostResponseDTO.Create> createPost(
            @RequestBody @Valid final PostRequestDTO.Create request
    ) {
        PostResponseDTO.Create response = postService.loadSave(request);
        return PostResponse.ok(response);
    }

    @DeleteMapping("/{id}")
    public PostResponse<PostResponseDTO.Delete> deletePost(
            @PathVariable(name = "id") final Long id
    ) {
        PostResponseDTO.Delete response = postService.loadDelete(id);
        return PostResponse.ok(response);
    }

    @PatchMapping("{id}")
    public PostResponse<PostResponseDTO.Update> updatePost(
            @PathVariable(name = "id") final Long id,
            @RequestBody @Valid final PostRequestDTO.Update request
    ) {
        PostResponseDTO.Update response = postService.loadUpdate(id, request);
        return PostResponse.ok(response);
    }

}
