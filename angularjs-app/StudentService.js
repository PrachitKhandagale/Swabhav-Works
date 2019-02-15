angular.module("swabhavtechlab", [])
    .factory("studentService", function ($http) {
        var returnData = {};

        returnData.add = function (obj) {
            console.log("inside add");
            // var obj = {
            //     rollno: $scope.s.rollno,
            //     name: $scope.s.name,
            //     age: $scope.s.age,
            //     email: $scope.s.email,
            //     date: $scope.s.date,
            //     isMale: $scope.s.isMale
            // }



            console.log(obj);
            if (
                obj.rollno == undefined || obj.rollno == "" ||
                obj.name == undefined || obj.name == "" ||
                obj.age == undefined || obj.age == "" ||
                obj.email == undefined || obj.email == "" ||
                obj.date == undefined || obj.date == ""
            ) {
                //$("#printData").html("");
                alert("All fields are mandatory");
            } else {
                return $http.post('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/', obj);

            };
        }

        returnData.displayData = function () {
            return $http.get('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/');

        }
        return returnData;

    })
    .controller("studentController", function ($scope, studentService) {
        $scope.s = {};
        $scope.add = function () {
            var httpPromise = studentService.add($scope.s);
            httpPromise.then(function (response) {
                console.log(response);
                $scope.s = {};
            });

        };
        $scope.displayData = function () {
            var httpPromise = studentService.displayData();
            httpPromise.then(function(response){
                $scope.data=response.data;
            })
        }




        // $scope.add = function () {
        //     console.log("inside add");
        //     // var obj = {
        //     //     rollno: $scope.s.rollno,
        //     //     name: $scope.s.name,
        //     //     age: $scope.s.age,
        //     //     email: $scope.s.email,
        //     //     date: $scope.s.date,
        //     //     isMale: $scope.s.isMale
        //     // }

        //     var obj = $scope.s;

        //     console.log(obj);
        //     if (
        //         obj.rollno == undefined || obj.rollno == "" ||
        //         obj.name == undefined || obj.name == "" ||
        //         obj.age == undefined || obj.age == "" ||
        //         obj.email == undefined || obj.email == "" ||
        //         obj.date == undefined || obj.date == ""
        //     ) {
        //         //$("#printData").html("");
        //         alert("All fields are mandatory");
        //     } else {
        //         $http.post('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/', obj)
        //             .then(function (response) {
        //                 console.log(response);
        //                 $scope.s = {};
        //             });

        //     };
        // }

        // $scope.displayData = function () {
        //     $http.get('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/')
        //         .then(function (response) {
        //             console.log(response);
        //             $scope.data = response.data;
        //         });
        // }
    });





