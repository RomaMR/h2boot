'use strict';

angular.module('h2boot')
    .controller('Posts', function (Storage, toaster) {
        var vm = this;

        vm.content = [];

        vm.activate = function () {
            Storage.get({
                    model: 'posts'
                },
                function (data) {
                    vm.content = data.content;
                },
                function (e) {
                    toaster.error('Error', e.data.message);
                });
        };

        vm.activate();
    });
