import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  name = 'Employee Information!!';
  fname = 'Rashmi';
  lname = 'Pawaskar';
  gender = 'Female';
  age = '30';

  ShowFaculty:boolean =true;
  Faculty:string = "rashmi Pawaskar";

  Subjects: string[]=["MS.Net","Java","Sharepoint"];

  Employees : any[] = [
                        {code:'emp101',Name:'Rashmi',gender:'Female',annualsalary:'5500',dob:'6/25/1985'},
                        {code:'emp102',Name:'Anushka',gender:'Female',annualsalary:'5700.95',dob:'9/6/1983'},
                        {code:'emp103',Name:'Parth',gender:'Male',annualsalary:'5600',dob:'11/20/1982'}
                      ];

  emp: Employee = new Employee(101,"Neha",10000);

  constructor() { }

  ngOnInit() {
  }

  hasEmp():boolean{
      return (this.Employees.length>0);
  }

  fullname():string {

    return (this.fname + ' ' + this.lname);
    
  }
}
