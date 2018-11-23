import { Component, OnInit } from '@angular/core';
import { EmpdataService } from '../services/empdata.service';

@Component({
  selector: 'app-emplistsercom',
  templateUrl: './emplistsercom.component.html',
  styleUrls: ['./emplistsercom.component.css']
})
export class EmplistsercomComponent implements OnInit {
  employees: any[];

  constructor(private _empDataService: EmpdataService) { }

  ngOnInit() {
    this.employees = this._empDataService.getEmployees();
  }

  
}
