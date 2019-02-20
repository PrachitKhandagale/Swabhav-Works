studentModule.directive("footerDirective",function($rootScope){
    $rootScope.footer = {
        currentYear : 2005,
        companyName : "Aurionpro Inc."
    };
    return {
        templateUrl:"Student/footer.html"
    }
});