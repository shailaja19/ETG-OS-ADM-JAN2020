class Product2 {
    ProId: number;
    ProName: string;
    ProPrice:number;

    constructor(id: number, name: string, Pprice: number) {
        this.ProName = name;
        this.ProId = id;
        this.ProPrice = Pprice;
    }

    Price() : number{
        return this.ProPrice+(this.ProPrice*0.18);
    }

    display() {
        console.log("Product Id = "+this.ProId + " , Product Name = " + this.ProName + " , Product Price = " + this.Price())
    

    }
}

let pro = new Product2(101, "Mobile",1000);
pro.display();