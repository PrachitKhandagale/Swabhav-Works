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
                
                alert("All fields are mandatory");
            } else {
                return $http.post('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/', obj);

            };
        }

        returnData.displayData = function () {
            return $http.get('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/');

        }
        // returnData.deleteData=function(obj){
        //     return $http.delete('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/',obj);
        // }
        return returnData;

    })
    .controller("studentController", function ($scope, studentService) {
        $scope.s = {};
        $scope.add = function () {
            var httpPromise = studentService.add($scope.s);
            httpPromise.then(function (response) {
                console.log(response);
                $scope.s = {};
                alert("Data Added.");
            });
            //$scope.displayData();

        };
        $scope.displayData = function () {
            var httpPromise = studentService.displayData();
            httpPromise.then(function(response){

                console.log(response.data);
                for(var i=0;i<response.data.length;i++){
                    console.log(response.data[i].id.substring(0,4));
                    response.data[i].id=response.data[i].id.substring(0,4);
                }
                $scope.data=response.data;
            })
        }

        // $scope.delete=function(){
        //     var httpPromise=studentService.deleteData($scope.s);
        //     httpPromise.then(function(response){
        //         alert("Data Deleted");
        //     });
            
        // }
    });





