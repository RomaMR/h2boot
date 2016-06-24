package com.h2boot.facade.post;

import com.h2boot.domain.post.Post;
import com.h2boot.exception.ContentNotFoundException;
import com.h2boot.service.post.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component("defaultPostFacade")
public class DefaultPostFacade implements PostFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultPostFacade.class);

    @Autowired
    @Qualifier("defaultPostService")
    private PostService postService;

    @Autowired
    @Qualifier("defaultRestTemplate")
    private RestTemplate restTemplate;

    @Value("${jsonplaceholder.typicode}")
    private String postHost;

    @Override
    public Page<Post> findAll(final Pageable pageable) {
        LOGGER.info("DefaultPostFacade.findAll()");
        final Page<Post> posts = postService.findAll(pageable);
        LOGGER.info("DefaultPostFacade.findAll() finished");
        return posts;
    }

    @Override
    public Post save(final Long id) {
        LOGGER.info("DefaultPostFacade.save()");
        try {
            final ResponseEntity<Post> responseEntity = restTemplate.getForEntity(postHost + id, Post.class);
            final Post post = responseEntity.getBody();
            final Post persistentPost = postService.save(post);
            LOGGER.info("DefaultPostFacade.save() finished, id={}", id);
            return persistentPost;
        } catch (HttpClientErrorException e) {
            final String message = "Post not found";
            LOGGER.error("DefaultPostFacade.save(), id={}, message={}", id, message);
            throw new ContentNotFoundException(message);
        }
    }
}
