$(document).on('click', '#displayButton', function () {
    $("#printData").html(`<div style="text-align:center"><img src="35.gif" alt="show1"></img></div>`);
    console.log("inside display");
    $.ajax({
        url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/',
        type: 'get',
        success: function (data) {
            //data.sort(function(a, b){return a.rollNo-b.rollNo});
            getdata(data);

        }, error: function () {
            // $('#loading-image').hide();
            $("#printData").html("Data Can't be fetched")
        }
    });
});

function getdata(objArray) {
    console.log(objArray);

    var data = `<table class="table table-striped">`;
    data += `<tr>
                <th>Roll No</th>
                <th>Name</th>
                <th>Email</th>
                <th>Age</th>
                <th>Date</th>
                <th>Gender</th>
                <th colspan=2>Actions</th>
            </tr>`;
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
        <td><input type="button" class="delete" id="delete" value="Delete"></td>
        <td><input type="button" class="edit" id="edit" value="Edit"><span id='ok' class='glyphicon glyphicon-ok btn disabled' aria-hidden='true'></span><span id='remove' class='glyphicon glyphicon-remove btn disabled' aria-hidden='true'></span></td>
        </tr>`;
        data += tr;
    }
    data += "</table>";
    $("#printData").html(data);
}

$(document).on('click', '#addButton', function () {
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
                clearForm();
                $("#printData").html(`<div style="text-align:center">Data Added Successfully</div>`);
                setTimeout(function () {
                    $("#printData").html("");
                }, 2000);
                //alert("Data Added Successfully");
            });
        console.log(obj);
    }
});
$(document).on('click', '#delete', function () {
    var answer = confirm("You want to delete data?");
    if (answer) {
        var number = $(this).parent().siblings(":first").text();
        console.log(number);
        var tableDataAppend = 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + number;
        $.ajax({
            url: tableDataAppend,
            type: 'DELETE',
            success: function (result) {
                alert(result + " Data removed from table");
                clearForm();
                $("#displayButton").click();
            }, error: function () {
                alert("Error")
            }
        });
        return;
    }
    else {
        return;
    }
});

function display() {
    $.ajax({
        url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/',
        type: 'get',
        success: function (data) {
            getData(data);
        }, error: function () {
            $('#error').html("Error occured ")
        }
    })
}



$(document).on('click', '#edit', function () {
    var $editBtn = $(this);
    var number = $(this).parent().siblings(":first").text();
    //console.log(number);

    var obj = {
        "rollNo": $("#inputRollNO").val(),
        "name": $("#inputName").val(),
        "age": $("#inputAge").val(),
        "email": $("#inputEmail").val(),
        "date": $("#inputDate").val(),
        "isMale": $("#genderMale").prop("checked")
    };
    var tableDataAppend = 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + number;
    $.ajax({
        url: tableDataAppend,
        type: 'get',
        success: function (result) {
            $('#inputRollNO').val(result.rollNo);
            $('#inputName').val(result.name);
            $('#inputAge').val(result.age);
            $('#inputEmail').val(result.email);
            $('#inputDate').val(result.date);

            if (result.isMale) {
                $('#genderMale').prop('checked', true);
            }
            else {
                $('#genderFemale').prop('checked', true);
            }

            $(".glyphicon").addClass("disabled");

            $editBtn.siblings().removeClass("disabled");

            
        }, error: function () {
            alert("Error in editing");
        }
    });
});

function clearForm(){
    $('#inputRollNO').val("");
    $('#inputName').val("");
    $('#inputAge').val("");
    $('#inputEmail').val("");
    $('#inputDate').val("");
    $('#genderMale').prop('checked', false);
    $('#genderFemale').prop('checked', false);
}

$(document).on('click', '#remove', function () {
    clearForm();
});

$(document).on('click','#ok',function(){
    var obj = {
        "rollNo": $("#inputRollNO").val(),
        "name": $("#inputName").val(),
        "age": $("#inputAge").val(),
        "email": $("#inputEmail").val(),
        "date": $("#inputDate").val(),
        "isMale": $("#genderMale").prop("checked")
    };
    
    $.ajax({
        url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+$('#inputRollNO').val(), 
        data : obj,
        type:'PUT',
        success: function (data, status) {
            //displayButtonClicked();
            clearForm();
            $("#displayButton").click();
        }});

});

