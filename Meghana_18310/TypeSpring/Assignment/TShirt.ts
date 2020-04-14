class TShirt{
    color:string;
    material:string;
    design:string;
   
    constructor(c:string,m:string,d:string ){
        this.color=c;
        this.material=m;
        this.design=d;
    }


   smallSize():string{
       return "small";
   }

   largeSize():string{
    return "large";
    }

    xlSize():string{
        return "Xtra-large";
    }
    display():void{
        console.log(this.color+" "+this.material+" "+this.design);
    }
}
let shirt1=new TShirt("blue","cotton","round-neck");
 console.log("Size: "+shirt1.smallSize());
 shirt1.display();

let shirt2=new TShirt("red","silk","collar-neck");
console.log("Size: "+shirt2.largeSize());
shirt2.display();
let shirt3=new TShirt("white","nylon","v-shape");
console.log("Size: "+shirt3.xlSize());
shirt3.display();
