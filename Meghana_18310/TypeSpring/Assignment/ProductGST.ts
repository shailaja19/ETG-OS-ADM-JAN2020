class ProductGST{
    pid:number;
    pname:string;
    price:number;

    constructor(pid:number,pname:string,price:number){
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }
   priceWithGst():number{
       return this.price+0.24;
   }
    display():void{
        console.log(this.pid+" "+this.pname+" "+this.priceWithGst());
    }
}
let p1=new ProductGST(100,"Laptop",124);
p1.display();
