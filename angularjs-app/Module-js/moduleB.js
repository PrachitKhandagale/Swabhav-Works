angular.module('modB', []).controller('controllerB', function ($scope, $rootScope) {
    console.log("inside Controller B");
    $scope.controllerB = {
        message: "Controller B says hello"
    }
    console.log($rootScope.company);
});