
package com.example.apirouting;

 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;
 import com.example.apirouting.MyService;
 @RestController
 public class MyController{
    
    MyService myService = new MyService();
    @GetMapping("/")
    public String getHomePage(){
      return myService.homePage();
    }

    @GetMapping("/about")
    public String getAboutPage(){
      return myService.aboutPage();
    }
 }