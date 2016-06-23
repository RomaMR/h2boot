package com.h2boot.web.config;

public interface API {

    String ROOT = "/api";
    String ID = "/{id}";

    interface Typicode {
        String ROOT = API.ROOT + "/typicodes";
    }

}
