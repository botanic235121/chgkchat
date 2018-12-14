import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  message: string;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  connect(username:string) {
    this.clearData();
    sessionStorage.setItem("user", username);
    this.router.navigate(['home']);
  }

  clearData() {
    sessionStorage.removeItem("user");
    this.message = null;
  }

}
