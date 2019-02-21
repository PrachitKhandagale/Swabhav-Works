angular.module("swabhavtechlab",['ui.router'])
.config(function($stateProvider,$urlRouterProvider){
    $stateProvider.state('home',{
        url:'partials/Home',
        controller:'HomeController',
        template:'<h1>Hello home</h1>'
    })
    
    .state('about',{
        url:'partials/AboutUs',
        controller:'AboutController',
        template:'<h1>Hello About</h1>'
    })
    .state('contact',{
        url:'partials/contact',
        controller:'ContactController',
        templateUrl:'partials/contact.html'
    })
    .state('contact.list',{
        url:'/contact/list',
        controller:'ContactController',
        templateUrl:'partials/list.html'
    })
    .state('contact.summary',{
        url:'/contact/summary',
        controller:'ContactController',
        templateUrl:'partials/summary.html'
    })
    $urlRouterProvider.otherwise('/home');
    console.log($stateProvider);
})