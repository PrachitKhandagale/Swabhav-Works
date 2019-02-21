"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(firstName, lastName, cgpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cgpa = cgpa;
    }
    Object.defineProperty(Student.prototype, "details", {
        get: function () {
            return "FirstName is " + this.firstName + "\n                LastName is " + this.lastName + "\n                CGPA is " + this.cgpa + " ";
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
// let s1=new Student("Prachit","Khandagale",7.6);
// console.log(s1.details);
