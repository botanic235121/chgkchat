import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {HomeComponent} from './home.component';
import {HomeRoutingModule} from './home-routing.module';
import {FormsModule} from '@angular/forms';
import { MatButtonModule,
  MatGridListModule,
  MatListModule,
  MatInputModule,
  MatCardModule,
  MatMenuModule,
  MatToolbarModule,
  MatIconModule } from '@angular/material';

@NgModule({
  declarations: [HomeComponent],
  imports: [
    CommonModule,
    HomeRoutingModule,
    FormsModule,
    MatGridListModule,
    MatListModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    MatMenuModule,
    MatToolbarModule,
    MatIconModule,
  ]
})
export class HomeModule {
}
