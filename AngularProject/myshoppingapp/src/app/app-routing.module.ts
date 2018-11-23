import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmplistsercomComponent } from './emplistsercom/emplistsercom.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { HttpServiceCallComponent } from './http-service-call/http-service-call.component';

const routes: Routes = [
  {path: 'home', component:HomeComponent},
  {path: 'employeelist', component:EmployeeInfoComponent},
  {path: 'employees', component:EmployeeComponent},
  {path: 'employees from services', component:EmplistsercomComponent},
  {path: 'Create Employees', component:CreateEmployeeComponent},
  {path: 'Items from Services', component:HttpServiceCallComponent},
  {path: '', redirectTo:'/home', pathMatch: 'full'},
  {path:'**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
