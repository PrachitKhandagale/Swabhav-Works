angular.module('modC', []).controller('controllerC', function ($scope, $rootScope) {
    console.log("inside Controller C");
    $scope.controllerC = {
        message: "Controller C says hello"
    }
    console.log($rootScope.company);
});