var Student = /** @class */ (function () {
    function Student(sid, sname, sclass) {
        this.sid = sid;
        this.sname = sname;
        this.sclass = sclass;
    }
    Student.prototype.display = function () {
        console.log(this.sid + " " + this.sname + " " + this.sclass);
    };
    return Student;
}());
var student1 = new Student(100, "Meghana", "5th");
student1.display();
var stud2 = new Student(200, "Jessica", "12th");
stud2.display();
