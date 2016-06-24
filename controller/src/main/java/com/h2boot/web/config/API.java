package com.h2boot.web.config;

public interface API {

    String ROOT = "/api";
    String ID = "/{id}";

    interface Post {
        String ROOT = API.ROOT + "/posts";
    }

}
