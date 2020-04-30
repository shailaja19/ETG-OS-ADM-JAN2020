import { Pipe, PipeTransform } from '@angular/core';
import { strict } from 'assert';

@Pipe({name: 'reverseChar'})
export class ReverseChar implements PipeTransform {
  transform(value: string): string {
    let newString: string = "";
    for (var i = value.length - 1; i >= 0; i--) {
     let   newStr: string="";
      newStr+= value.charAt(i);
    }
    return newString;
  }
}
