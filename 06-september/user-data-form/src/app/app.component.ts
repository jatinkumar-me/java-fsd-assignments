import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>Welcome to {{title}}!</h1>
    <app-user-form></app-user-form>

  `,
  styles: []
})
export class AppComponent {
  title = 'user-data-form';
}
