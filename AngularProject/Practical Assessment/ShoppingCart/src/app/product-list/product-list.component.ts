import { Component, OnInit } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  productlist: Product[];
  
  constructor() { }

  ngOnInit() {
    this.productlist = [
      {name:"Apple iPhone7",price:70000,currency:"INR",imageName:"Apple iPhone 7.jpg"},
      {name:"Micromax Q409",price:12000,currency:"INR",imageName:"Micromax Q409.jpg"},
      {name:"MTR MT312",price:7000,currency:"INR",imageName:"MTR MT312.jpg"},
      {name:"Samsung Galaxy C7",price:50000,currency:"INR",imageName:"Samsung Galaxy C7.jpg"},
      {name:"Vivo V9",price:20000,currency:"INR",imageName:"Vivo V9.jpg"},
      {name:"Vivo Y53",price:15000,currency:"INR",imageName:"Vivo Y53.jpg"}
    ];
  }

}
