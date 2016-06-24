package com.h2boot.service.post;

import com.h2boot.domain.post.Post;

public interface PostService {
    Iterable<Post> findAll();

    Post save(Post post);
}
