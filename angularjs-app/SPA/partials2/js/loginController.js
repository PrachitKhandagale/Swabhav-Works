studentModule.controller("loginController", function ($scope, $rootScope, $location, studentService) {
    //console.log($location.search().redirectUrl);
    $scope.loginForm = function () {
        console.log($scope.username);
        console.log($scope.password);
        console.log($location);

        if ($scope.username == "prachit" && $scope.password == "prachit@123") {
            $rootScope.loggedIn = true;
            $rootScope.person = $scope.username;
            //$rootScope.username="prachit";
            console.log("inside login");
            //console.log(`#/${$location.search().redirectUrl}`);
            sessionStorage.setItem("loggedIn", "yes");
            if ($location.search().redirectUrl != undefined) {
                window.location = `#/${$location.search().redirectUrl}`;
                //window.location = "#/display";
                //$rootScope.editStudentData();
            } else {
                
                
                $scope.username = "";
                $scope.password = "";
                
               // alert("You are now logged in !!");
            }

        } else {
            alert("Login Failed");
        }
    }
});