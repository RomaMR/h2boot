'use strict';

angular.module('h2boot')
    .controller('Home', function (Storage, toaster) {
        var vm = this;

        vm.post = {};

        vm.save = function () {
            Storage.save({
                    model: 'typicode',
                    id: vm.post.id
                },
                vm.post.id,
                function () {
                    toaster.success('Saved', vm.post.id);
                },
                function (e) {
                    toaster.error('Error', e.data.message);
                });
        };
    });
