import { Component } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
  selector: 'sw-student',
  templateUrl:'./student.component.html'
//   styleUrls: ['./student.component.css']
})
export class StudentComponent {
//   message = 'Swabhav techlabs with Prachit ';
private student:IStudent;
private messages:String='Hello Swabhav';
private width=300;
private height=150;
private imgUrl="../../assets/goku.jpeg";

private get cgpaToColor(){
 if(this.student.cgpa>7){
     return "red";
 }
 else{
     return "green";
 }
 return 0;
}

public courseList=[];

public  buttonEvent(){
    //alert("Hello Event");
    // this.courseList.push("Java");
    // this.courseList.push("PHP");
    // this.courseList.push("Python");
    // this.courseList.push(".Net");
    this.courseList=["Java","Python","C#","PHP"];
}

constructor(){
    this.student={
        cgpa:7.5,
        name:'Prachit',
        job:'developer',
        company:'Swabhav techlabs'
    }
}
}
