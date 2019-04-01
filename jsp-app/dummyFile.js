function convertToINR() {
var cursel ="";
var san="";
var sancAmount =document.getElemntById( requiredSecCov).value;
for(var i=0;i<sancAmount.length;i++){
if(sancAmount[i]!=="m" && sancAmount[i]!=="M" && sancAmount[i]!=="b" && sancAmount[i]!=="B"){
    san=san+sancAmount.charAt(i);
}
if(sancAmount[i]=='m' || sancAmount[i]=='M'){
    sancAmount=sancAmount.toLowercase().replace('M'," ");
    sancAmount=san*1000000;
    //document.getElementById('requiredSecCov')
}
if(sancAmount[i]=='b' || sancAmount[i]=='B'){
    sancAmount=sancAmount.toLowercase().replace('B'," ");
    sancAmount=san*1000000000;
    //document.getElementById('requiredSecCov')
}

}
}