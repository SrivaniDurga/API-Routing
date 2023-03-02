package com.example.apirouting;
import com.example.apirouting.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController{
    MyService my = new MyService();
    @GetMapping("/")
    public String homepage(){
       return my.Home("Home Page");
    }
    
    @GetMapping("/about")
    public String aboutpage(){
        return my.About("About Page");
    }
}