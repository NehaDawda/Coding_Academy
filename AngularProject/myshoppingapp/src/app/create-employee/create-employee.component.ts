import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  varbind="default";
  constructor() { }

  ngOnInit() {
  }

  UserFunction(frm:NgForm): void{
    //var emp:Iemployee;
    //emp=empRefForm.value;
    //this.emplist.push(emp);
    console.log(frm.value);
  }
}
