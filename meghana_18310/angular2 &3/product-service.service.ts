import { Injectable } from '@angular/core';
import  { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { IProduct} from './productInterface';
import { Observable} from 'rxjs';

@Injectable({

    providedIn:'root'
})
export class ProductServiceService{

    private url:string="/assets/data/products.json";
    constructor(private http:HttpClient){}
    getEmployee():Observable<IProduct[]>{
        return this.http.get<IProduct[]>(this.url);
    }
    errorHandler(error:HttpErrorResponse){
        return Observable.throw(error.message || "Server Error");
    }
}