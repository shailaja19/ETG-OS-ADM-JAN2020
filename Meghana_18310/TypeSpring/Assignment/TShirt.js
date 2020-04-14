var TShirt = /** @class */ (function () {
    function TShirt(c, m, d) {
        this.color = c;
        this.material = m;
        this.design = d;
    }
    TShirt.prototype.smallSize = function () {
        return "small";
    };
    TShirt.prototype.largeSize = function () {
        return "large";
    };
    TShirt.prototype.xlSize = function () {
        return "Xtra-large";
    };
    TShirt.prototype.display = function () {
        console.log(this.color + " " + this.material + " " + this.design);
    };
    return TShirt;
}());
var shirt1 = new TShirt("blue", "cotton", "round-neck");
console.log("Size: " + shirt1.smallSize());
shirt1.display();
var shirt2 = new TShirt("red", "silk", "collar-neck");
console.log("Size: " + shirt2.largeSize());
shirt2.display();
var shirt3 = new TShirt("white", "nylon", "v-shape");
console.log("Size: " + shirt3.xlSize());
shirt3.display();
