import {Student1} from './Student1';
import{Observable} from 'rxjs';


export class StudentService{
    students:Student1[]=[
        {id:1,
        name:'sonu',
        college:'SPMVV'
    },
    {
        id:2,
        name:'hampi',
        college:'SPMVV'
    },
    {
        id:3,
        name:'bhagya',
        college:'SPMVV'
    

}];

public getStudents(): any{
    const studentsObservable=new Observable(observer=>{
        setTimeout(()=>{
            observer.next(this.students);
        },10000);
    });
    return studentsObservable;
}
}
