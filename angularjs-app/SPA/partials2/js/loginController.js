studentModule.controller("loginController", function ($scope, studentService) {
    $scope.loginForm=function(){
        //$scope.username="prachit";
       // $scope.password="prachit@123"
       console.log($scope.username);
       console.log($scope.password);

        if($scope.username=="prachit" && $scope.password=="prachit@123"){
            console.log("inside login");
            window.location=`#/edit/:UID`;
           //$scope.editStudentData();
        }else{
            alert("Login Failed");
        }
    }
});