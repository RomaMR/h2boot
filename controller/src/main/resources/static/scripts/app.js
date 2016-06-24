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
      .state('history', {
        url: '/history',
        templateUrl: 'views/history.html',
        controller: 'History',
        controllerAs: 'history'
      });

    $urlRouterProvider.otherwise('/');
  });
