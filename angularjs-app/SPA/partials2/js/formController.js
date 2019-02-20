studentModule.controller("formController", function ($scope,$rootScope, studentService) {
    
    $scope.add = function () {
        $scope.Studentobj = $scope.s;
        var httpPromise = studentService.add($scope.Studentobj);
        console.log(httpPromise);
        httpPromise.then(function (response) {

            console.log(response);
            $scope.Studentobj = {};
            window.location = "#/display";

            //alert("Data Added.");

            // studentService.displayData();
        });
        httpPromise.catch(function(response){
            alert("Error:something went wrong");
        })
        //$scope.displayData();
    }
});