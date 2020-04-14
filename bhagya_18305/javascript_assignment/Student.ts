class Student {
    name: string;
    constructor(name: string){
        this.name = name;
    }
}

class Student12 extends Student {
    stdId: number;
	stdClass: number
    constructor(stdId: number, name:string, stdClass:number) {
         super(name);
         this.stdId=stdId;
        
		 this.stdClass=stdClass;
    }
    display(): void {
        console.log("Stdudent ID = " + this.stdId + ", Student Name = " + this.name +", Student Class = " + this.stdClass);
    }
}
let std1 = new Student12(100, "Bill",8);
let std2 = new Student12(101, "mill",6);
std1.display();
std2.display();