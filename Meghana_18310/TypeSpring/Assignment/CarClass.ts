class Car{
    speed:number;
    regularPrice:number;
    color:string;

    constructor(speed:number,price:number,color:string){
        this.speed=speed;
        this.regularPrice=price;
        this.color=color;
    }
    getSalePrice():number{
        return this.regularPrice-(this.regularPrice*0.5);
    }
}

class Truck extends Car{
 weight:number;
    constructor(weight:number,speed:number,regularPrice:number,color:string)
    {
        super(speed,regularPrice,color);
        this.weight=weight;
        }

        getSalePrice():number{
            if(this.weight>2000)
            {
                return this.regularPrice-(this.regularPrice*0.1);
            }
            else{
                return this.regularPrice-(this.regularPrice*0.2);
            }
            return 0;
        }

    }
    let t1=new Truck(4000,120,12000,"black");
    console.log(t1.getSalePrice());
 


