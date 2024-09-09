import { Injectable } from '@angular/core';
import { LoggerService } from './logger.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  users: Array<{ name: string, email: string }> = [];

  constructor(private logger: LoggerService) { }

  addUser(user: { name: string, email: string }) {
    this.users.push(user);
    this.logger.log('User added: ' + JSON.stringify(user));
  }
}
