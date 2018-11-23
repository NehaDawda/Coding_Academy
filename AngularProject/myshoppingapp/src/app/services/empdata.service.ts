import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpdataService {

  getEmployees():any[]{
    return [
      {code:'emp101',Name:'Rashmi',gender:'Female',annualsalary:'5500',dob:'6/25/1985'},
      {code:'emp102',Name:'Anushka',gender:'Female',annualsalary:'5700.95',dob:'9/6/1983'},
      {code:'emp103',Name:'Parth',gender:'Male',annualsalary:'5600',dob:'11/20/1982'}
    ];
  }
  constructor() { }
}
