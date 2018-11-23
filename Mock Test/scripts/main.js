function emptyCheck(key,value){
    if(key=="domain" && value=="Select College"){
        alert("Please select College!!!");
        return false;
    }
    else if(key=="module" && value=="Select Dept"){
        alert("Please select Department!!!");
        return false;
    }
    else if((value.trim()).length == 0){
        alert(key+" can't be empty");
        return false;
    }
    return true;
}

function valStudId(){
    var id=document.getElementById("studId").value;

    id=id.trim();

    if(id.length!=6){
        alert("ID should be 6 digits long");
        return false;
    }
    else if(!(parseInt(id))){
        alert("ID should have digits only");
        return false;
    }
    return true;
}

function valStudName(){
    var name=document.getElementById("studName").value;
    
    name = name.trim();
    
    if(name.length>30){
        alert("Name should not be more than 30 characters!!");
        return false;
    }
    return true;
}

function valScore(key,value){
    if(!Number(value)){
        alert(key + " Marks should be number!!!");
        return false;
    }

    if(value<0){
        alert(key + " Marks should be positive!!!");
        return false;
    }

    if(value>100){
        alert(key + " MArks should be between 1 to 100");
        return false;
    }

    return true;
}

function validate(){
    
    var id=document.getElementById("studId").value;
    var name=document.getElementById("studName").value;
    var college=document.getElementById("college").value;
    var dept=document.getElementById("dept").value;
    var intScore=document.getElementById("intScore").value;
    var extScore=document.getElementById("extScore").value;

    if(!emptyCheck("ID",id)){
        exit;
    }
 
    if(!emptyCheck("Name",name)){
        exit;
    }
    
    if(!emptyCheck("College",college)){
        return false;
    }

    if(!emptyCheck("Department",dept)){
        exit;
    }

    if(!emptyCheck("Internal Score",intScore)){
        exit;
    }

    if(!emptyCheck("External Score",extScore)){
        exit;
    }


    if(!valStudId()){
        exit;
    }

    if(!valStudName()){
        exit;
    }

    if(!valMarks("Internal Score",intScore)){
        exit;
    }
    
    if(!valMarks("External Score",extScore)){
        exit;
    }

    calculateScore();
}

function calculateScore(){
    var intScore=Number(document.getElementById("intScore").value);
    var extScore=Number(document.getElementById("extScore").value);
    
    var score = (intScore*0.3 + extScore*0.7);

    alert("Score : " + score +"%");
}
function populateDept(){
    var college=document.getElementById("college").value;
    
    var optionlist1 = ["CSC","IT","Mech"];
    var optionlist2 = ["ECE","EEE","E&I"];
    
    var m = document.getElementById("dept");

    for(i=1;i<m.length;){
        m.remove(i);
    }

    // var defaultoption = document.createElement("option");
    // defaultoption.text = "Select Module";
    // m.appendChild(defaultoption);

    if(college== "IIT-B"){ 
        for(i=0;i<optionlist1.length;i++){
            var option = document.createElement("option");
            option.value = option.text= optionlist1[i];
            m.appendChild(option);
        }   
    }
    else{
        for(i=0;i<optionlist2.length;i++){
            var option = document.createElement("option");
            option.value = option.text = optionlist2[i];
            m.appendChild(option);
        } 
    }

}