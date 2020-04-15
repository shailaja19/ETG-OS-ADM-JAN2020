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
    function Car(Speed, RegularPrice, Color) {
        this.Color = Color;
        this.RegularPrice = RegularPrice;
        this.Speed = Speed;
    }
    Car.prototype.getSalPrice = function () {
        return;
    };
    return Car;
}());
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck(weight, Speed, RegularPrice, Color) {
        var _this = _super.call(this, Speed, RegularPrice, Color) || this;
        _this.weight = weight;
        return _this;
    }
    Truck.prototype.getSalPrice = function () {
        if (this.weight > 2000) {
            return this.RegularPrice - (this.RegularPrice * 0.10);
        }
        else {
            return this.RegularPrice - (this.RegularPrice * 0.20);
        }
    };
    Truck.prototype.displayName = function () {
        console.log("The car speed is  " + this.Speed + ", and color is  " + this.Color + ", and Regular Price of Truck " + this.getSalPrice() + " the price of car is " + this.RegularPrice);
    };
    return Truck;
}(Car));
var car1 = new Truck(2500, 100, 20000, "red");
car1.displayName();
