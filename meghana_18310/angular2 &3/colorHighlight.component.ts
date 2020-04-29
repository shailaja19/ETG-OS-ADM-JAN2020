import {Directive,ElementRef,Input,OnInit} from '@angular/core';

@Directive({
  selector: '[color]',
  
})
export class ColorHighlightComponent implements OnInit {
@Input() color:string;

  constructor(private e1:ElementRef) { }

  ngOnInit(): void {
    this.e1.nativeElement.style.backgroundColor=this.color;
  }

}