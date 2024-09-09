import { Component } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrl: './user-form.component.css'
})
export class UserFormComponent {
  user = { name: '', email: '' };

  constructor(private userService: UserService) { }

  addUser(userForm: NgForm) {
    if (userForm.valid) {
      this.userService.addUser(this.user);
      this.user = { name: '', email: '', };
      userForm.resetForm();
    }
  }
}
