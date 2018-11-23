var fname:string = "Neha";
var score1:number = 50;
var score2:number = 42.50;
var sum = score1 + score2;
console.log("name is " + fname);
console.log("first score: " + score1);
console.log("second score: " + score2);
console.log("sum of the scores: " +sum);

var vname:string = "neha";
console.log("value vname is " + vname);

var bname:string;
console.log("value bname is " +bname);

var cname="neha1";
console.log("value cname is " + cname);

var lname;
console.log("value lname is " + lname);

var global_num = 12;

class Employee{
    num_val = 13;
    static sval = 10;

    soreNum():void{
        var local_num = 14;
    }
}

console.log("Global num: "+global_num);
console.log(Employee.sval);
var obj = new Employee();
console.log("Global num: "+obj.num_val);