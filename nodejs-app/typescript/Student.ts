export class Student{
    constructor(private firstName,private lastName,private cgpa){

    }
    get details(){
        return `FirstName is ${this.firstName}
                LastName is ${this.lastName}
                CGPA is ${this.cgpa} `
    }
}
// let s1=new Student("Prachit","Khandagale",7.6);
// console.log(s1.details);