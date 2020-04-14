"use strict";
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
exports.__esModule = true;
var Car_1 = require("./Car");
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck(sp, rp, c, weight) {
        var _this = _super.call(this, sp, rp, c) || this;
        _this.sp = sp;
        _this.weight = weight;
        return _this;
    }
    Truck.prototype.getSalePrice = function () {
        _super.prototype.getSalePrice.call(this);
        if (this.weight > 2000) {
            return this.regularPrice - this.regularPrice * 0.10;
        }
        else {
            return this.regularPrice - this.regularPrice * 0.20;
        }
    };
    return Truck;
}(Car_1.Car));
var tr = new Truck(1000, 2000, "red", 3000);
console.log(tr.getSalePrice());
var tr1 = new Truck(1000, 2000, "red", 300);
console.log(tr1.getSalePrice());
