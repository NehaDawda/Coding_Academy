import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'emp'
})
export class EmpPipe implements PipeTransform {

  transform(value: string, args?: any): string {
    if (value.toLowerCase()=="female")
      return "F";
    else
      return "M";
  }

}
