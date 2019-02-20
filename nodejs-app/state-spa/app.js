angular.module("swabhavtechlab",['ui.router'])
.config(function($stateProvider,$urlRouterProvider){
    $stateProvider.state('home',{
        url:'partials/Home.html',
        controller:'HomeController',
        template:'<h1>Hello home</h1>'
    })
    
    .state('about',{
        url:'partials/AboutUs.html',
        controller:'AboutController',
        template:'<h1>Hello About</h1>'
    })
    .state('contact',{
        url:'partials/ContactUs.html',
        controller:'ContactController',
        template:'<h1>Hello Contact</h1>'
    })
    $urlRouterProvider.otherwise('/home');
    console.log($stateProvider);
})