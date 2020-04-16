import { Component, OnInit } from '@angular/core';
import {Hero} from '../Hero';
import { Product } from './Product';

//import { from } from 'rxjs';
@Component({
  selector: 'app-ng-for-example',
  templateUrl: './ng-for-example.component.html',
  styleUrls: ['./ng-for-example.component.css']
})
export class NgForExampleComponent implements OnInit {

  heroes = ['Rajkumar','Amitab','Rajnikanth','Chiranjivi'];
  resource=[
    new Hero(1,'Rajkumar'),
    new Hero(2,'Amitab'),
    new Hero(3,'Rajnikanth'),
    new Hero(4,'Chiranjivi')
  ]
items=[
  new Product(1,'Book',80,"assets/images/book.jpg"),
  new Product(2,'Pen',20,"assets/images/pen.jpg"),
  new Product(3,'Pencil',10,"assets/images/pencil.jpg")

]

  constructor() { }

  ngOnInit(): void {
  }

}
