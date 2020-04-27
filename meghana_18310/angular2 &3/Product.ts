import {Component} from '@angular/core';
import {ServiceExample} from './ServiceExample';

@Component({
    selector:'product-list',
    template:`
            <div>
               <h1>Products</h1>
               <ul>
            <li *ngFor="let pro of products">
              {{ pro }}
           </li>
            </ul>
            {{message}}  
            </div>        
             `
})
export class Product{
    message:string;
    constructor(service:ServiceExample){
        this.message = service.getString();
    }
    products = ["Mobile","Laptop","Chargers","phones"];
   

}