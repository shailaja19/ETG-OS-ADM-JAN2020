class Car {

    Speed: number;
    RegularPrice: number;
    Color : string;
    constructor(Speed: number, RegularPrice:number, Color: string){
        this.Color = Color;
        this.RegularPrice = RegularPrice;
        this.Speed = Speed;
    }
        getSalPrice():number {
            return ;
        }
}

class Truck extends Car {
    weight : number;
    constructor(weight: number, Speed:number, RegularPrice:number, Color:string){
        super(Speed,RegularPrice,Color);
        this.weight = weight;
    }
    getSalPrice():number {
        if(this.weight >2000){
          return this.RegularPrice-(this.RegularPrice*0.10);
        }
          else 
          {
              return this.RegularPrice-(this.RegularPrice*0.20);
          }
        
    }

    displayName():void {
        console.log("The car speed is  "+this.Speed + ", and color is  "+this.Color + ", and Regular Price of Truck "+this.getSalPrice()+" the price of car is "+this.RegularPrice);
    }
} 

let car1 = new Truck(2500,100,20000,"red");
car1.displayName();