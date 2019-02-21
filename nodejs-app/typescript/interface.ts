interface ICustomer{
    firstName:String,
    lastName:String,
    salary:number
}


printDetails([{firstName:"Prachit",lastName:"Khandagale",salary:20000},
{firstName:"Swabhav",lastName:"Techlabs",salary:50000}]);


function printDetails(customer:ICustomer[] ){
    
    customer.forEach(function (customer){
        console.log(customer.firstName+" "+customer.firstName+" "+customer.salary);
    })
    for(let i in customer){
        console.log(customer[i]);
    }
}