package com.h2boot.facade.post;

import com.h2boot.domain.post.Post;

public interface PostFacade {
    Iterable<Post> findAll();

    Post save(Long id);
}
