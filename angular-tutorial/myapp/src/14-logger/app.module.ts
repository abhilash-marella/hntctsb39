import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { LoggerModule } from 'ngx-logger';
import { NgxLoggerLevel } from 'ngx-logger';
import { AppComponent } from './app.component';
import { environment } from 'src/environments/environment';

@NgModule({
  declarations: [AppComponent], // components, directive, pipes
  exports: [],
  imports: [
    BrowserModule,
    HttpClientModule,
    LoggerModule.forRoot({
      serverLoggingUrl: '/api/error-logs',
      serverLogLevel: NgxLoggerLevel.ERROR,
      level: environment.level,
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule{}
