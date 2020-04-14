var ProductGst = /** @class */ (function () {
    function ProductGst(ProId, proName, proPrice) {
        this.ProId = ProId;
        this.proName = proName;
        this.proPrice = proPrice;
    }
    ProductGst.prototype.getGst = function () {
        return this.proPrice + (this.proPrice * 0.18);
    };
    ProductGst.prototype.display = function () {
        console.log("Product ID = " + this.ProId + " , Product name = " + this.proName + "  , Product Cost = " + this.getGst());
    };
    return ProductGst;
}());
var product = new ProductGst(101, "Book", 50);
product.display();
