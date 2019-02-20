studentModule.factory("studentService", function ($http,studentUrl) {
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
            return $http.post(studentUrl.url, obj);

        }
    }

    returnData.getStudentById = function (studentId) {
        console.log(studentId);

        return $http.get(studentUrl.url + studentId);
            

    }

    returnData.updateStudentData = function (Studentobj) {
        

       return $http.put(studentUrl.url + Studentobj.id, Studentobj)
            .then(function (response) {
                
                window.location = "#/display";
            })

    }

    returnData.displayData = function () {
        return $http.get(studentUrl.url);

    }
    returnData.deleteData = function (sid) {
        return $http.delete(studentUrl.url + sid);
    }
    return returnData;

});