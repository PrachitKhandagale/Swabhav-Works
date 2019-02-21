angular.module("SwabhavTechLab")
.controller("displayController", function ($scope, employeeService) {
    $scope.data = [];
    $scope.display = function () {

        console.log("inside display");
        if($scope.data.length==0){
        employeeService.httpPromise.then(function (response) {
            var storeData = employeeService.parse(response);
            $scope.data = $scope.data.concat(storeData);
        });
    }
    }
    $scope.display();
    $scope.delete = function (employeeId) {
        employeeService.remove(employeeId, $scope.data);
    }

})
.controller("formController", function ($scope, employeeService) {
    $scope.add = function () {

        var empId = Math.floor(Math.random() * 9000) + 1000;
        empId = ((new Date()).getTime()) % 10000;

        let newobj = {

            EmpId: empId,
            Name: $scope.Name,
            Designation: $scope.Designation,
            ManagerId: $scope.ManagerId,
            Date: $scope.Date,
            Salary: $scope.Salary,
            Commission: $scope.Commission,
            DepartmentNumber: $scope.DepartmentNumber
        }
        if (newobj.Name == null || newobj.Designation==null || newobj.ManagerId==null
        || newobj.Date==null || newobj.Salary==null || newobj.Commission==null
        || newobj.DepartmentNumber==null) {
            alert("All fields are mandatory");
        } else {
            console.log(newobj);
            $scope.data.push(newobj);
            console.log($scope.data.length);
           // window.location="#/display";
        }

    };
    $scope.departmentList = [];
    $scope.designationList = [];
    var date = new Date();
    $scope.data = [];
    employeeService.httpPromise.then(function (response) {
        var storeData = employeeService.parse(response);
        for (var i = 0; i < storeData.length; i++) {
            $scope.designationList.push(storeData[i].Designation);
            $scope.departmentList.push(storeData[i].DepartmentNumber);

        }
        $scope.designationList = $scope.designationList.filter(function (value, index, self) {
            return self.indexOf(value) === index;
        });
        $scope.departmentList = $scope.departmentList.filter(function (value, index, self) {
            return self.indexOf(value) === index;
        });
        // $scope.data=$scope.data.concat(storeData);
    });
});