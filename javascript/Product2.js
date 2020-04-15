var Product2 = /** @class */ (function () {
    function Product2(id, name, Pprice) {
        this.ProName = name;
        this.ProId = id;
        this.ProPrice = Pprice;
    }
    Product2.prototype.Price = function () {
        return this.ProPrice + (this.ProPrice * 0.18);
    };
    Product2.prototype.display = function () {
        console.log("Product Id = " + this.ProId + " , Product Name = " + this.ProName + " , Product Price = " + this.Price());
    };
    return Product2;
}());
var pro = new Product2(101, "Mobile", 1000);
pro.display();
