studentModule.factory("studentService", function ($http) {
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

});