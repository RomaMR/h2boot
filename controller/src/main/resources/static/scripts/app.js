'use strict';

angular
  .module('h2boot', [
    'ngResource',
    'ui.router',
    'ui.bootstrap',
    'ui.utils',
    'toaster'
  ])
  .config(function ($stateProvider, $urlRouterProvider) {
    $stateProvider
      .state('home', {
        url: '/',
        templateUrl: 'views/home.html',
        controller: 'Home',
        controllerAs: 'home'
      })
      .state('posts', {
        url: '/posts',
        templateUrl: 'views/posts.html',
        controller: 'Posts',
        controllerAs: 'posts'
      });

    $urlRouterProvider.otherwise('/');
  });
