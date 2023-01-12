import { Component } from '@angular/core';
import { NGXLogger } from 'ngx-logger';

@Component({
  selector: "app-root",
  templateUrl: `app.component.html`,
  styleUrls: [`app.component.scss`]
})
export class AppComponent {

  constructor(private logger: NGXLogger) {
    this.logger.info("This is info message");
    this.logger.log("This is log message");
    this.logger.warn("This is warn message");
    this.logger.error("This is error message");
  }
}
