studentModule.controller("displayController", function ($scope, studentService) {
    //   $scope.displayData = function () {



    $scope.display = function () {
        var httpPromise = studentService.displayData();
        httpPromise.then(function (response) {
            console.log(response.data);
            $scope.data = response.data;
        });
    }


    $scope.delete = function (sid) {
        var httpPromise = studentService.deleteData(sid);
        httpPromise.then(function (response) {
            //alert("Data Deleted");
            $scope.display();

        });

    };

    $scope.display();

    //  }
});
