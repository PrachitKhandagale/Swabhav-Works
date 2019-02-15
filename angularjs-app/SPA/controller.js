angular.module("swabhavtechlab")
.controller("HomeController",function($scope){
    console.log("Home Controller");
    $scope.data="Hello Its SwabhavTechlabs.";
})
.controller("AboutController",function($scope){
    console.log("AboutUs Controller");
    $scope.data="Hello Abouts Us is here.";
})
.controller("ContactController",function($scope){
    console.log("Contact Controller");
    $scope.data="Hello Contact me Here.";
})