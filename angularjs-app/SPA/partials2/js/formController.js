studentModule.controller("formController", function ($scope, studentService) {
        
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
        })
        //$scope.displayData();
    }

    

});