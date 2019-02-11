angular.module('modA', ['modB', 'modC']).controller('controllerA', function ($scope, $rootScope) {
    console.log("inside Controller A");
    $scope.controllerA = {
        message: "Controller A says hello"
    }
    console.log($rootScope);
    $rootScope.company = 'SwabhavTechlabs';
});