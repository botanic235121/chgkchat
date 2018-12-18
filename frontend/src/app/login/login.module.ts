import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {LoginRoutingModule} from './login-routing.module';
import {LoginComponent} from './login.component';
import { MatButtonModule,
  MatGridListModule,
  MatListModule,
  MatInputModule,
  MatCardModule,
  MatMenuModule,
  MatToolbarModule,
  MatIconModule } from '@angular/material';

@NgModule({
  declarations: [LoginComponent],
  imports: [
    CommonModule,
    LoginRoutingModule,
    FormsModule,
    MatButtonModule,
    MatGridListModule,
    MatListModule,
    MatInputModule,
    MatCardModule,
    MatMenuModule,
    MatToolbarModule,
    MatIconModule,
    RouterModule
  ]
})
export class LoginModule {
}
