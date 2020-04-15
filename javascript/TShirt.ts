class TShirt{
    Color : string;
    Material : string;
    Design : string
    constructor(Color: string, Material:string,  Design: string){
        this.Color = Color;
        this.Material = Material;
        this.Design = Design;
    }
    displayName():void {
        console.log(" The Color of the Shirt is  "+this.Color + ", Material is " +this.Material+ " , Design is  "+this.Design);
    }
} 

let small = new TShirt("Violet","Silk","Full Sleev");
small.displayName();
let Large = new TShirt("White","Cotton","Full Neck");
Large.displayName();
let ExLarge = new TShirt("Red","Semi Cotton","Neck");
ExLarge.displayName();
