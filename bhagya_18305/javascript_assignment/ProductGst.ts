class ProductGst {
    ProId: number;
    proName: string;
    proPrice: number;
    constructor(ProId: number, proName: string, proPrice:number){
        this.ProId=ProId;
        this.proName=proName;
        this.proPrice=proPrice;
    }
    
    getGst(): number {

return this.proPrice+(this.proPrice*0.18);
        
    }

    display(){
        console.log("Product ID = "+this.ProId+ " , Product name = " + this.proName + "  , Product Cost = " +this.getGst());
    }
}
let product = new ProductGst(101,"Book", 50);
product.display();
