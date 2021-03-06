angular.module("swabhavtechlab",['ngRoute'])
.config(function($routeProvider){
    $routeProvider.when('/',{
        templateUrl:'partials/Home.html',
        controller:'HomeController'
    })
    .when('/home',{
        templateUrl:'partials/Home.html',
        controller:'HomeController'
    })
    .when('/about',{
        templateUrl:'partials/AboutUs.html',
        controller:'AboutController'
    })
    .when('/contact',{
        templateUrl:'partials/ContactUs.html',
        controller:'ContactController'
    })
})