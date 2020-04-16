import{Component, Input} from "@angular/core";
@Component({
    selector:"student",
    template: `
    <h1>The Student Details</h1>
    <div>
    <ul *ngFor="let j of names">
    <li>{{j}}</li>
    </ul>
    </div>
    `
})
export class Student{
    
    names=["sonu","bhagya","hampi"];
}
