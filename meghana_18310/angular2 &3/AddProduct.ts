import {Component} from '@angular/core';

@Component({
    selector:'add-item',
    templateUrl:'add-item.html'
})

export class AddProduct {
    task: string;
    tasks = [];
   
    onClick(){
      this.tasks.push({name: this.task});
      this.task = '';
    }
}