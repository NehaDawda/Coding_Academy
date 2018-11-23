import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { LogOutComponent } from './log-out/log-out.component';
import { ShoppingItemComponent } from './shopping-item/shopping-item.component';
import { ProductListComponent } from './product-list/product-list.component';
import { Routes, RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { FormsModule } from '@angular/forms';

const appRoutes: Routes=[
  {path: 'home', component:HomeComponent},
  {path: 'login', component:LoginComponent},
  {path: 'logout', component:LogOutComponent},
  {path: 'about', component:AboutComponent},
  {path: 'register', component:RegisterComponent},
  {path: 'shoppingitem', component:ShoppingItemComponent},
  {path: 'productlist', component:ProductListComponent},
  {path: '', redirectTo:'/home', pathMatch: 'full'},
  {path:'**', component: PageNotFoundComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RegisterComponent,
    LoginComponent,
    AboutComponent,
    LogOutComponent,
    ShoppingItemComponent,
    ProductListComponent,
    PageNotFoundComponent
  ],
  imports: [    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
