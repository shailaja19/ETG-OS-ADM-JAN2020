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
var Student = /** @class */ (function () {
    function Student(StdName) {
        this.StdName = StdName;
    }
    return Student;
}());
var Student1 = /** @class */ (function (_super) {
    __extends(Student1, _super);
    function Student1(StdId, StdName, StdClass) {
        var _this = _super.call(this, StdName) || this;
        _this.StdId = StdId;
        _this.StdClass = StdClass;
        return _this;
    }
    Student1.prototype.displayName = function () {
        console.log(" Student Name = " + this.StdName + ", Student Id  = " + this.StdId + " , Student Class = " + this.StdClass);
    };
    return Student1;
}(Student));
var Std1 = new Student1(1572042, "Hampi", 10);
Std1.displayName();
var Std2 = new Student1(1572041, "Nandu", 10);
Std2.displayName();
