import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { CalculatorService } from './services/cal.service';

@NgModule({
  declarations: [AppComponent], // components, directive, pipes
  exports: [],
  imports: [BrowserModule],
  providers: [CalculatorService],
  bootstrap: [AppComponent]
})
export class AppModule{}
