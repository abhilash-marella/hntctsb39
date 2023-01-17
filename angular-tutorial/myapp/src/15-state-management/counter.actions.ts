import { createAction, props } from '@ngrx/store'

export const increment = createAction(
    'increment',
    props<{
        payload: { incrementNumber: number; }
    }>());

export const decrement = createAction('decrement');

// export const reset = createAction('reset');
export const reset = createAction('reset', props<{ payload: { num: number } }>());