import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'capitalize'
})
export class CapitalizePipe implements PipeTransform {

  transform(input: string, flag:boolean=true): string {
    if(flag){
      return input.charAt(0).toUpperCase()+input.substring(1).toLowerCase();
    } else {
      return input;
    }
  }

}
