import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { NgModule } from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './ChildComponent';
import { IfElseExampleComponent} from './if-else-Example/ngIfElse.component';
import {FormsModule} from '@angular/forms';

import {CustomDirectiveComponent} from './custom-directive/custom-directive.component';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import {SortPipe} from './pipe-example/CustomSortPipe';
import {ShowMyComponent} from './ShowMyComponent.component';
import {SimpleOneService} from './simple-one.service';
import {Hero} from './HeroService/hero.service';
import {CallService} from './HeroService/callService.component';
import { Work } from "./Work";
import { ForExampleComponent } from './for-example.component';

import { AssignmentProduct } from './assignment.component';


import {StudentComponent} from './ObservableExample/StudentComponent';


import { EmployeeServiceService} from './employee-service.service';
import {EmployeeListComponent} from './employee-list.component';



import {PostExampleComponent} from './post-example/post-example.component'


import {ProductServiceService} from './product-service.service';
import {ProductListComponent} from './product-list.component';

import {OneComponent} from './one-component.component';
import {OneProduct} from './oneProduct.component';
import {ColorHighlightComponent} from './colorHighlight.component';
import {ForUsers} from './user-for.component';

import {FormExample} from './formExample';
import { from } from 'rxjs';

import {FormValidation} from './FormValidation';

import {SimpleModule} from './SimpleModule';
import {RegisterExample} from './registerExample';
@NgModule({
  declarations: [
    AppComponent ,ChildComponent,IfElseExampleComponent,Work,
    ForExampleComponent,AssignmentProduct,ForUsers,FormValidation,
    CustomDirectiveComponent,FormExample,RegisterExample,
    PipeExampleComponent,
    SortPipe,
    ShowMyComponent,CallService,StudentComponent,PostExampleComponent,EmployeeListComponent,
    ProductListComponent,OneComponent,OneProduct,ColorHighlightComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
   ReactiveFormsModule,
    SimpleModule
  ],
  providers: [SimpleOneService,Hero,EmployeeServiceService,ProductServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
