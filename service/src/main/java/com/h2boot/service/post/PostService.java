package com.h2boot.service.post;

import com.h2boot.domain.post.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {
    Page<Post> findAll(final Pageable pageable);

    Post save(Post post);
}
