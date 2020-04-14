var ProductGST = /** @class */ (function () {
    function ProductGST(pid, pname, price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    ProductGST.prototype.priceWithGst = function () {
        return this.price + 0.24;
    };
    ProductGST.prototype.display = function () {
        console.log(this.pid + " " + this.pname + " " + this.priceWithGst());
    };
    return ProductGST;
}());
var p1 = new ProductGST(100, "Laptop", 124);
p1.display();
