studentModule.controller("loginController", function ($scope,$location, studentService) {
    //console.log($location.search().redirectUrl);
    $scope.loginForm=function(){
       console.log($scope.username);
       console.log($scope.password);
       console.log($location);

        if($scope.username=="prachit" && $scope.password=="prachit@123"){

            console.log("inside login");
            //console.log(`#/${$location.search().redirectUrl}`);
            sessionStorage.setItem("loggedIn","yes");
            // if($location.search().redirectUrl != undefined){
                window.location = `#/${$location.search().redirectUrl}`;
            //window.location = "#/display";
           //$scope.editStudentData();
            // }else{
            //     $scope.username="";
            //     $scope.password="";
            //     alert("You are now logged in !!");
            // }
            
        }else{
            alert("Login Failed");
        }
    }
});