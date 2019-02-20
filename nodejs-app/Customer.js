class Customer{
    constructor(firstName,lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    get fullName(){
        return this.firstName+" "+this.lastName;
    }
}
// let c1=new Customer("Prachit","Khandagale");
// console.log(c1.fullName);
// console.log(c1);
// console.log(c1.__proto__ == Customer.prototype);
module.exports=Customer;