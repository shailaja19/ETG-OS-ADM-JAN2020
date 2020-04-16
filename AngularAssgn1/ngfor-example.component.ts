import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { Hero } from '../hero';

@Component({
  selector: 'app-ngfor-example',
  templateUrl: './ngfor-example.component.html',
  styleUrls: ['./ngfor-example.component.css']
})
export class NGForExampleComponent implements OnInit {

  //heros=['Rajkumar','Amitab','Ranjanikant', 'Chiranjivi'];
    resource=[
        new Product(1,'cylinder',500,"assets/images/download.jpg"),
        new Product(2,'regulator',400,"assets/images/regulator.jpg"),
        new Product(3,'stove', 100,"assets/images/stove.jpg"),
        new Product(4,'lighter', 200,"assets/images/lighter.jpg")
        
    ]

    resource1=[
      new Hero(1,'Rajkumar'),
      new Hero(2,'Amitab')
      
      
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
