import { Component,OnInit} from '@angular/core';
import {ProductServiceService} from 'src/app/product-service.service';

@Component({
    selector:'app-product-list',
    templateUrl:'./product-list.component.html',
    
})
export class ProductListComponent implements OnInit{

    public products=[];
    public errorMsg;

    constructor(private productService:ProductServiceService){}
    ngOnInit(){
        this.productService.getEmployee().subscribe(data=>this.products=data,
            error=>this.errorMsg=error);
            
    }

}