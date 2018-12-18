import {Injectable} from '@angular/core';
import {User} from '../model/user';
import {settings} from '../util/settings';
import {HttpClient, HttpHeaders} from '@angular/common/http';

@Injectable({providedIn: 'root'})
export class UserService {

  constructor(private http: HttpClient) {
  }

  login(user: User): any {
    return this.http.post(settings.baseUrl + '/login', user, null);
  }

  logout(user: User): any {
    return this.http.post(settings.baseUrl + '/logout', user, null);
  }

  findUsers() {
    return this.http.get(settings.baseUrl + '/listUsers');
  }
}
