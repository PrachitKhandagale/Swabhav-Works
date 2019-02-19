angular.module("swabhavtechlab", ['ngRoute'])
    .config(function ($routeProvider) {
        $routeProvider.when('/', {
            templateUrl: 'Student/Form.html',
            controller: 'formController'
        })
            .when('/form', {
                templateUrl: 'Student/Form.html',
                controller: 'formController'
            })
            .when('/display', {
                templateUrl: 'Student/display.html',
                controller: 'displayController'
            })
            .when('/edit/:UID', {
                templateUrl: 'Student/edit.html',
                controller: 'editController'
            })
            .when('/loginform',{
                templateUrl: 'Student/Loginform.html',
                controller: 'loginController'
            })
    })
    .factory("studentService", function ($http) {
        var returnData = {};

        returnData.add = function (obj) {
            console.log("inside add");
            console.log(obj);
            if (
                obj.rollNo == undefined || obj.rollNo == "" ||
                obj.name == undefined || obj.name == "" ||
                obj.age == undefined || obj.age == "" ||
                obj.email == undefined || obj.email == "" ||
                obj.date == undefined || obj.date == ""
            ) {

                alert("All fields are mandatory");
            } else {
                console.log("inside else");
                return $http.post('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/', obj);

            }
        }

        returnData.getStudentById = function (studentId) {
            console.log(studentId);

            return $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + studentId);
                

        }

        returnData.updateStudentData = function (Studentobj) {
            //Studentobj = $scope.Studentobj;

           return $http.put('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + Studentobj.id, Studentobj)
                .then(function (response) {
                    //alert("Data of " + Studentobj.name + " Added");
                    window.location = "#/display";
                })

        }

        returnData.displayData = function () {
            return $http.get('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/');

        }
        returnData.deleteData = function (sid) {
            return $http.delete(`http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/${sid}`);
        }
        return returnData;

    })
    .controller("formController", function ($scope, studentService) {
        
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

        

    })
    .controller("displayController", function ($scope, studentService) {
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
    })

    .controller("editController", ['$scope', '$routeParams', 'studentService', function ($scope, $routeParams, studentService) {

        $scope.edit = function () {       
            var httpPromise = studentService.getStudentById($routeParams.UID);
            httpPromise.then(function(response){
                var obj = response.data[0];
                obj.date = new Date(obj.date);
                obj.isMale = obj.isMale + "";
                $scope.s=obj;
                console.log($scope.s);
            });
        };

        $scope.editStudentData = function () {
            studentService.updateStudentData($scope.s);
        }

        $scope.edit();
    }])

    .controller("loginController", function ($scope, studentService) {
        $scope.loginForm=function(){
            //$scope.username="prachit";
           // $scope.password="prachit@123"
           console.log($scope.username);
           console.log($scope.password);

            if($scope.username=="prachit" && $scope.password=="prachit@123"){
                console.log("inside login");
                window.location="#/edit/";
               //$scope.editStudentData();
            }else{
                alert("Login Failed");
            }
        }
    })






