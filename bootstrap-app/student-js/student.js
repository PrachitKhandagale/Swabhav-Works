function displayButtonClicked() {
    $("#printData").html(`<div style="text-align:center"><img src="35.gif" alt="show1"></img></div>`);
    console.log("inside display");
    $.ajax({
        url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/',
        type: 'get',
        success: function (data) {
            getdata(data);

        }, error: function () {
            // $('#loading-image').hide();
            $("#printData").html("Data Can't be fetched")
        }
    });
}

function getdata(objArray) {
    console.log(objArray);

    var data = `<table class="table table-striped">`;
    data += "<tr><th>Roll No</th><th>Name</th><th>Email</th><th>Age</th><th>Date</th><th>Gender</th></tr>";
    for (var i = 0; i < objArray.length; i++) {
        var obj = objArray[i];
        var gender;
        if (obj.isMale)
            gender = "Male";
        else
            gender = "Female";
        var tr = `<tr>
        <td>${obj.rollNo}</td>
        <td>${obj.name}</td>
        <td>${obj.email}</td>
        <td>${obj.age}</td>
        <td>${obj.date}</td>
        <td>${gender}</td>
        </tr>`;
        data += tr;
    }
    data += "</table>";
    $("#printData").html(data);
}


function addButtonClicked() {
    $("#printData").html(`<div style="text-align:center"><img src="35.gif" alt="show1"></img></div>`);
    console.log("Add button clicked");
    
    var obj = {
        "rollNo": $("#inputRollNO").val(),
        "name": $("#inputName").val(),
        "age": $("#inputAge").val(),
        "email": $("#inputEmail").val(),
        "date": $("#inputDate").val(),
        "isMale": $("#genderMale").prop("checked")
    };

    if (
        obj.rollNo == undefined || obj.rollNo == "" ||
        obj.name == undefined || obj.name == "" ||
        obj.age == undefined || obj.age == "" ||
        obj.email == undefined || obj.email == "" ||
        obj.date == undefined || obj.date == ""
    ) {
        $("#printData").html("");
        alert("All fields are mandatory");
    }
    else {
        $.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/", obj,
            function (data, status) {
                $("#printData").html(`<div style="text-align:center">Data Added Successfully</div>`);
                setTimeout(function()
                            { 
                                $("#printData").html(""); 
                            }, 2000);
                //alert("Data Added Successfully");
            });
        console.log(obj);
    }
}

