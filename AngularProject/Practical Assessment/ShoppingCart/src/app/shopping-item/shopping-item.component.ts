import { Component, OnInit } from '@angular/core';
import { Item } from '../model/item';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-shopping-item',
  templateUrl: './shopping-item.component.html',
  styleUrls: ['./shopping-item.component.css']
})
export class ShoppingItemComponent implements OnInit {
  items: Item[];
  constructor() { }

  ngOnInit() {
    this.items=[];
  }

  additem(form:NgForm){
    let item:Item ={name:form.value.itemname,
    quantity:Number(form.value.qty)};

    console.log(item);

    this.items.push(item);

  }

}
