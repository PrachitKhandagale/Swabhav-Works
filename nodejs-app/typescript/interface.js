printDetails([{ firstName: "Prachit", lastName: "Khandagale", salary: 20000 },
    { firstName: "Swabhav", lastName: "Techlabs", salary: 50000 }]);
function printDetails(customer) {
    customer.forEach(function (customer) {
        console.log(customer.firstName + " " + customer.firstName + " " + customer.salary);
    });
    for (var i in customer) {
        console.log(customer[i]);
    }
}
