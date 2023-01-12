import { ErrorHandler, NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { MyErrorHandler } from './error-handler/my-error-handler';

@NgModule({
  declarations: [AppComponent], // components, directive, pipes
  exports: [],
  imports: [BrowserModule, HttpClientModule],
  providers: [
    {useClass: MyErrorHandler, provide: ErrorHandler}
  ],
  bootstrap: [AppComponent]
})
export class AppModule{}
