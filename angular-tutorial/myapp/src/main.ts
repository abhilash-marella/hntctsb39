import { platformBrowserDynamic } from "@angular/platform-browser-dynamic";
// import { AppModule } from "./app/app.module";
// import { AppModule } from "./01-components/app.module";
// import { AppModule } from "./02-childComp/app.module";
// import { AppModule } from "./03-databinding/app.module";
// import { AppModule } from "./04-directives-attribute/app.module";
// import { AppModule } from "./05-directives-structral/app.module";
// import { AppModule } from "./06-di/app.module";
// import { AppModule } from "./07-http/app.module";
// import { AppModule } from "./08-pipes/app.module";
// import { AppModule } from "./09-routing/app.module";
// import { AppModule } from "./10-nestModules/app.module";
// import { AppModule } from "./11-route-params/app.module";
import { AppModule } from "./12-form/app.module";

platformBrowserDynamic()
  .bootstrapModule(AppModule)