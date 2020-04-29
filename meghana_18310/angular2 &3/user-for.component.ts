import { Component,OnInit } from '@angular/core';
import {Users } from "./Users";

@Component({

  selector:'user',
  templateUrl:'./for-example.html'
  
})
export class ForUsers implements OnInit{
users=['Laptop',
        'Mobile',
        'Calculator',
        'Notepad'];
  resource=[
    new Users('Laptop',120),
    new Users('Mobile',100),
    new Users('Calculator',88),
    new Users('Notepad',99),

  ]
  myHero=this.resource[0];
  
  ngOnInit(){

  }
}