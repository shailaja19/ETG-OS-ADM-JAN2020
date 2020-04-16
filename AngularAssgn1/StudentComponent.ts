import{Component, OnInit} from '@angular/core';
import{Student} from './Student';
import {StudentService} from './StudentService';
@Component({
    selector:'student-obserber',
    templateUrl:'student-display.html',
    providers:[StudentService]

})
export class StudentComponent implements OnInit{
    students:Student[]=[];
    constructor(private studentservice:StudentService){}
    ngOnInit(){
        const studentsObservable=this.studentservice.getStudents();
        studentsObservable.subscribe((studentsData: Student[])=>{
            this.students=studentsData;
        });
    }

}
