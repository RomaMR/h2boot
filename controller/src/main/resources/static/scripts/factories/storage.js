'use strict';

angular.module('h2boot')
  .factory('Storage', function ($resource) {
    return $resource('/api/:model/:id/:action', {}, {
      'replace': {method: 'PUT'},
      'update': {method: 'PATCH'}
    });
  });
