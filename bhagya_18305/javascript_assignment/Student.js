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
    function Student(name) {
        this.name = name;
    }
    return Student;
}());
var Student12 = /** @class */ (function (_super) {
    __extends(Student12, _super);
    function Student12(stdId, name, stdClass) {
        var _this = _super.call(this, name) || this;
        _this.stdId = stdId;
        _this.stdClass = stdClass;
        return _this;
    }
    Student12.prototype.display = function () {
        console.log("Stdudent ID = " + this.stdId + ", Student Name = " + this.name + ", Student Class = " + this.stdClass);
    };
    return Student12;
}(Student));
var std1 = new Student12(100, "Bill", 8);
var std2 = new Student12(101, "mill", 6);
std1.display();
std2.display();
