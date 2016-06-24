package com.h2boot.web.controller;

import com.h2boot.domain.post.Post;
import com.h2boot.facade.post.PostFacade;
import com.h2boot.web.config.API;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(API.Post.ROOT)
public class PostController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostController.class);

    @Autowired
    @Qualifier("defaultPostFacade")
    private PostFacade postFacade;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Post>> findAll() {
        LOGGER.info("PostController.findAll()");
        final Iterable<Post> posts =postFacade.findAll();
        LOGGER.info("PostController.findAll() finished");
        return new ResponseEntity(posts, HttpStatus.OK);
    }

    @RequestMapping(value = API.ID, method = RequestMethod.POST)
    public ResponseEntity<Post> save(@PathVariable Long id) {
        LOGGER.info("PostController.save()");
        final Post post = postFacade.save(id);
        LOGGER.info("PostController.save() finished");
        return new ResponseEntity(post, HttpStatus.CREATED);
    }
}
