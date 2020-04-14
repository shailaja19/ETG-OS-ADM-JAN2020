class Student{
    sid:number;
    sname:string;
   sclass:String

    constructor(sid:number,sname:string,sclass:string){
        this.sid=sid;
        this.sname=sname;
        this.sclass=sclass;
        
    }
  
    display():void{
        console.log(this.sid+" "+this.sname+" "+this.sclass);
    }
}
let student1=new Student(100,"Meghana","5th");
student1.display();
let stud2=new Student(200,"Jessica","12th");
stud2.display();
