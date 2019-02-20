studentModule.controller("displayController", function ($scope, studentService) {
    //   $scope.displayData = function () {

    $scope.display = function () {
        var httpPromise = studentService.displayData();
        httpPromise.then(function (response) {
            console.log(response.data);
            $scope.data = response.data;
        });
        httpPromise.catch(function(response){
            alert("Error:Something went wrong");
        })
    }

    $scope.delete = function (sid) {
        if (sessionStorage.getItem("loggedIn") == undefined || sessionStorage.getItem("loggedIn") == "no") {
            window.location=`#/loginform?redirectUrl=display/`;
        }
        else {
        var httpPromise = studentService.deleteData(sid);
        httpPromise.then(function (response) {
            //alert("Data Deleted");
            $scope.display();
        });
        httpPromise.catch(function(response){
            alert("Error:something went wrong");
        })
    }
    };

    $scope.display();

    //  }
});
