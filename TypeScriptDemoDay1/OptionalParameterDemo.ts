function disp_details(id:number,name:string,mail_id?:string){
    console.log("ID is :", id);
    console.log("name is :", name);

    if(mail_id!=undefined)
        console.log("emailId : ", mail_id);
}
disp_details(123,"neha");
console.log("**********************");
disp_details(111,"swati","abc@xyz.com");
