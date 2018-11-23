import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmplistsercomComponent } from './emplistsercom.component';

describe('EmplistsercomComponent', () => {
  let component: EmplistsercomComponent;
  let fixture: ComponentFixture<EmplistsercomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmplistsercomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmplistsercomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
