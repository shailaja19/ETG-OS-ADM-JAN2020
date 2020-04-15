class Student {
    StdName: string;
    constructor(StdName: string){
        this.StdName =StdName;
    }
}

class Student1 extends Student {
    StdId : number;
    StdClass : number;
    constructor(StdId: number, StdName:string, StdClass : number){
        super(StdName);
        this.StdId =StdId;
        this.StdClass=StdClass;
    }
    displayName():void {
        console.log(" Student Name = "+this.StdName + ", Student Id  = "+this.StdId+ " , Student Class = "+this.StdClass);
    }
} 

let Std1 = new Student1(1572042,"Hampi",10);
Std1.displayName();
let Std2 = new Student1(1572041,"Nandu",10);
Std2.displayName();