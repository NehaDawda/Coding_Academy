import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { EmployeeComponent } from './employee/employee.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { EmpPipe } from './pipes/emp.pipe';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { Routes, RouterModule } from '@angular/router';
import { EmplistsercomComponent } from './emplistsercom/emplistsercom.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { FormsModule } from '@angular/forms';
import { HttpServiceCallComponent } from './http-service-call/http-service-call.component'

const appRoutes: Routes=[
  {path: 'home', component:HomeComponent},
  {path: 'employeelist', component:EmployeeInfoComponent},
  {path: 'employees', component:EmployeeComponent},
  {path: '', redirectTo:'/home', pathMatch: 'full'},
  {path:'**', component: PageNotFoundComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EmployeeComponent,
    ContactUsComponent,
    EmpPipe,
    EmployeeInfoComponent,
    PageNotFoundComponent,
    EmplistsercomComponent,
    CreateEmployeeComponent,
    HttpServiceCallComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
