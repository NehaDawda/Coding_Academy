function emptyCheck(key,value){
    if(key=="domain" && value=="Select Domain"){
        alert("Please select domain!!!");
        return false;
    }
    else if(key=="module" && value=="Select Module"){
        alert("Please select Module!!!");
        return false;
    }
    else if((value.trim()).length == 0){
        alert(key+" can't be empty");
        return false;
    }
    return true;
}

function valEmpId(){
    var id=document.getElementById("empId").value;

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

function valEmpName(){
    var name=document.getElementById("ename").value;
    
    name = name.trim();
    
    if(name.length>30){
        alert("Name should not be more than 30 characters!!");
        return false;
    }
    return true;
}

function valMarks(key,value){
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
    
    var id=document.getElementById("empId").value;
    var name=document.getElementById("ename").value;
    var domain=document.getElementById("domain").value;
    var modules=document.getElementById("modules").value;
    var mptmarks=document.getElementById("mptMarks").value;
    var mttmarks=document.getElementById("mttMarks").value;
    var assmarks=document.getElementById("assMarks").value;

    if(!emptyCheck("ID",id)){
        exit;
    }
 
    if(!emptyCheck("Name",name)){
        exit;
    }
    
    if(!emptyCheck("domain",domain)){
        return false;
    }

    if(!emptyCheck("module",modules)){
        exit;
    }

    if(!emptyCheck("MPT Marks",mptmarks)){
        exit;
    }

    if(!emptyCheck("MTT Marks",mttmarks)){
        exit;
    }

    if(!emptyCheck("Assignment Marks",assmarks)){
        exit;
    }

    if(!valEmpId()){
        exit;
    }

    if(!valEmpName()){
        exit;
    }

    if(!valMarks("MPT",mttmarks)){
        exit;
    }
    
    if(!valMarks("MTT",mptmarks)){
        exit;
    }

    if(!valMarks("Assignment",assmarks)){
        exit;
    }

    calculateScore();
}

function calculateScore(){
    var mptmarks=Number(document.getElementById("mptMarks").value);
    var mttmarks=Number(document.getElementById("mttMarks").value);
    var assmarks=Number(document.getElementById("assMarks").value);
    
    var score = (mptmarks + mttmarks + assmarks)/3;

    alert("Score : " + score +"%");
}
function populateModule(){
    var domain=document.getElementById("domain").value;
    
    var optionlist1 = ["Core Java","Servlet-JSP","Spring"];
    var optionlist2 = ["C#","ADO.Net","ASP.Net"];
    
    var m = document.getElementById("modules");

    // while(m.length>0){
    //     i=m.length;
    //     m.remove(i);
    // }

    for(i=1;i<m.length;){
        m.remove(i);
    }

    // var defaultoption = document.createElement("option");
    // defaultoption.text = "Select Module";
    // m.appendChild(defaultoption);

    if(domain== "JEE"){ 
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