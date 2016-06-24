package com.h2boot.service.post;

import com.h2boot.domain.post.Post;
import com.h2boot.persistence.post.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("defaultPostService")
public class DefaultPostService implements PostService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultPostService.class);

    @Autowired
    @Qualifier("postRepository")
    private PostRepository postRepository;

    @Override
    public Page<Post> findAll(final Pageable pageable) {
        LOGGER.info("DefaultPostService.findAll()");
        final Page<Post> posts = postRepository.findAll(pageable);
        LOGGER.info("DefaultPostService.findAll() finished");
        return posts;
    }

    @Override
    public Post save(final Post post) {
        LOGGER.info("DefaultPostService.save()");
        final Post persistentPost = postRepository.save(post);
        LOGGER.info("DefaultPostService.save() finished");
        return persistentPost;
    }
}
