import {Car} from './Car';
class Truck extends Car{
    weight:number;
    constructor(private sp:number,rp:number,c:string,weight:number){
        super(sp,rp,c);
        this.weight=weight;

    }
    getSalePrice():number{
        super.getSalePrice();
       if(this.weight>2000)
       {
           return this.regularPrice-this.regularPrice*0.10;
        }
        else{
            return this.regularPrice-this.regularPrice*0.20;

        }
        
        
    }
}
let tr = new Truck(1000,2000,"red",3000);
console.log(tr.getSalePrice());
let tr1 = new Truck(1000,2000,"red",300);
console.log(tr1.getSalePrice());