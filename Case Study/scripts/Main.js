function validateUser(){
    
    var user=document.getElementById("username").value;
    var pwd=document.getElementById("pwd").value;

    user = user.trim();
    user= user.toLowerCase();
    
    if(user=="rashmi"){
        if(pwd=="Rashmi"){
                alert("Login Successful!!!");
                var reset=document.getElementById("reset");
                reset.click();
        }else{
            alert("Incorrect Password!!!");
        }
    }else{
        alert("Incorrect User Name!!!")
    }

}

function checkEmpty(key,value,method){
    if(value.length == 0){
        alert("Please " + method.toLowerCase() + " value for " + key);
        return false;
    }else
    return true;
}

function verifyPassword(pwd,verifyPwd){
    if(pwd === verifyPwd){
        return true
    }else{
        alert("Password and Verification Password should be exact same!!!");
        return false;
    }
}

function addUser(){
    
    var name = document.getElementById("name").value.trim();
    if(!checkEmpty("Name",name,"enter")){
        exit;
    }

    var zipCode = document.getElementById("zipCode").value.trim();
    if(!checkEmpty("Zip Code",zipCode,"enter")){
        exit;
    }

    var gender = document.getElementById("gender").value;
    if(!checkEmpty("Gender",gender,"select")){
        exit;
    }

    var preference = document.getElementById("preference").value;
    if(!checkEmpty("Preferences",preference,"select")){
        exit;
    }

    var phone = document.getElementById("phone").value;
    if(!checkEmpty("Phone Number",phone,"enter")){
        exit;
    }

    var email = document.getElementById("email").value;
    if(!checkEmpty("Email Address",email,"enter")){
        exit;
    }

    var pwd = document.getElementById("pwd").value;
    if(!checkEmpty("Password",pwd,"enter")){
        exit;
    }

    var verifyPwd = document.getElementById("verifyPwd").value;
    if(!checkEmpty("Verification Password",verifyPwd,"enter")){
        exit;
    }

    if(!verifyPassword(pwd,verifyPwd)){
        exit;
    }

    alert("Successfully Added User!!!");
}