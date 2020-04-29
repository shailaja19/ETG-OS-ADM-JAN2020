import {Component} from '@angular/core';
import { Hero } from './hero.service';


@Component({
    selector:'call-hero',
    templateUrl:'heroes.html'
})
export class CallService{
    heroes=[];

    constructor(service:Hero){
        this.heroes=service.getMyHero();
    }
}