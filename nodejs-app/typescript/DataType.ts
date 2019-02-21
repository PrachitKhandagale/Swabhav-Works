const empName:String="Prachit";
const company:String="Swabhav-Techlabs";
const age:number=25;
const isMale:boolean=true;
const empLocation='Mumbai';
const details=`Emp name is ${empName}
               Company name is ${company}
               Emp age is ${age}
               Emp is Male ${isMale}
               Emp location ${empLocation}     
                `
display(details);

function display(data:String):void{
    console.log(data);
}