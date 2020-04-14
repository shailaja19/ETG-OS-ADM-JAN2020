var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Car = /** @class */ (function () {
    function Car(speed, price, color) {
        this.speed = speed;
        this.regularPrice = price;
        this.color = color;
    }
    Car.prototype.getSalePrice = function () {
        return this.regularPrice - (this.regularPrice * 0.5);
    };
    return Car;
}());
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck(weight, speed, regularPrice, color) {
        var _this = _super.call(this, speed, regularPrice, color) || this;
        _this.weight = weight;
        return _this;
    }
    Truck.prototype.getSalePrice = function () {
        if (this.weight > 2000) {
            return this.regularPrice - (this.regularPrice * 0.1);
        }
        else {
            return this.regularPrice - (this.regularPrice * 0.2);
        }
        return 0;
    };
    return Truck;
}(Car));
var t1 = new Truck(4000, 120, 12000, "black");
console.log(t1.getSalePrice());
