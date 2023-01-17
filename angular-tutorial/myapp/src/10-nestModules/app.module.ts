import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { RouterModule, Routes } from '@angular/router';

const routes:Routes = [
  {path: "home", component: HomeComponent},
  {path: "about", component: AboutComponent},
  // lazy loading
  {path: "user", loadChildren: () => import('./modules/user/user.module').then(m => m.UserModule)},

  {path: "**", redirectTo: "home" }
];

@NgModule({
  declarations: [AppComponent, HeaderComponent, FooterComponent, HomeComponent, AboutComponent], // components, directive, pipes
  exports: [],
  imports: [BrowserModule, RouterModule.forRoot(routes)],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule{}
