import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NGForExampleComponent } from './ngfor-example.component';

describe('NGForExampleComponent', () => {
  let component: NGForExampleComponent;
  let fixture: ComponentFixture<NGForExampleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NGForExampleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NGForExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
