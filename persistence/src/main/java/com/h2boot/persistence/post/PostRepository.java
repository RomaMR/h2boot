package com.h2boot.persistence.post;

import com.h2boot.domain.post.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
