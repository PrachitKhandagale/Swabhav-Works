studentModule.controller("logoutController", function ($scope,$rootScope) {
    //console.log($location.search().redirectUrl);
 
        console.log("inside Logout")

        if (sessionStorage.getItem("loggedIn") == "yes") {
            sessionStorage.setItem("loggedIn","no");
            $rootScope.loggedIn=false;
            //alert("You Successfully Logout !!");
            window.location=`#/display`;
        }
});