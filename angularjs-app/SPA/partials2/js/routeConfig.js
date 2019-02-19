studentModule.config(function ($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: 'Student/Form.html',
        controller: 'formController'
    })
        .when('/form', {
            templateUrl: 'Student/Form.html',
            controller: 'formController'
        })
        .when('/display', {
            templateUrl: 'Student/display.html',
            controller: 'displayController'
        })
        .when('/edit/:UID', {
            templateUrl: 'Student/edit.html',
            controller: 'editController'
        })
        .when('/loginform',{
            templateUrl: 'Student/Loginform.html',
            controller: 'loginController'
        })
})