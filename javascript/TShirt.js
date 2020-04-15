var TShirt = /** @class */ (function () {
    function TShirt(Color, Material, Design) {
        this.Color = Color;
        this.Material = Material;
        this.Design = Design;
    }
    TShirt.prototype.displayName = function () {
        console.log(" The Color of the Shirt is  " + this.Color + ", Material is " + this.Material + " , Design is  " + this.Design);
    };
    return TShirt;
}());
var small = new TShirt("Violet", "Silk", "Full Sleev");
small.displayName();
var Large = new TShirt("White", "Cotton", "Full Neck");
Large.displayName();
var ExLarge = new TShirt("Red", "Semi Cotton", "Neck");
ExLarge.displayName();
