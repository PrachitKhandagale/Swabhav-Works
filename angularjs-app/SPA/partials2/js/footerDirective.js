studentModule.directive("footerDirective",function($rootScope){
    // $rootScope.footer = {
    //     currentYear : 2005,
    //     companyName : "Aurionpro Inc."
    // };
    return {
        templateUrl:"Student/footer.html",
        // template:"<div> {{company}}</div>"+
        // "@CopyWrite <input type='text' ng-model='company' />"
    }
});