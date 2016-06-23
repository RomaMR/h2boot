'use strict';

angular
  .module('h2boot', [
    // 'ngAnimate',
    // 'ngCookies',
    'ngResource',
    // 'ngSanitize',
    // 'ngTouch',
    'ui.router',
    'ui.bootstrap',
    'ui.utils',
    // 'ui.jq',
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
      .state('history', {
        url: '/history',
        templateUrl: 'views/history.html',
        controller: 'History',
        controllerAs: 'history'
      });

    $urlRouterProvider.otherwise('/');
  });
