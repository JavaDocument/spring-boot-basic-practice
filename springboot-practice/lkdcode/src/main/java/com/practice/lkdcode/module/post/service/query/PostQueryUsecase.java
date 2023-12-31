package com.practice.lkdcode.module.post.service.query;

import com.practice.lkdcode.module.post.controller.dto.response.PostResponseDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostQueryUsecase {
    PostResponseDTO.Get retrieveFindById(final Long id);

    List<PostResponseDTO.Get> retrieveFindAll(final Pageable pageable);

    List<PostResponseDTO.Get> retrieveFindByTitleContaining(final String keyword, final Pageable pageable);
}
