studentModule.directive("headerDirective", function ($rootScope) {
    if ($rootScope.loggedIn == undefined)
        $rootScope.loggedIn = false;
    return {
        templateUrl: "Student/header.html"
    }
});