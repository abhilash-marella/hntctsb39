import { Component } from '@angular/core';
import { select, Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { increment, decrement, reset } from "../../counter.actions"

@Component({
  selector: 'app-counter',
  templateUrl: './counter.component.html',
  styleUrls: ['./counter.component.scss']
})
export class CounterComponent {
  count$: Observable<number>;

  constructor(private store: Store<{ count: number }>) {
    this.count$ = store.pipe(select('count'));
  }
  increase() { this.store.dispatch(increment({ payload: { incrementNumber: 1 } })) }
  decrease() { this.store.dispatch(decrement()) }
  // reset(){this.store.dispatch(reset())}
  reset(n = 0) {
    this.store.dispatch(reset({
      payload: { num: n }
    }))
  }
}