package com.sb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloController {
	
	@RequestMapping("/greeting")
    String home() {
        
        return "hello - SB API";
    }

}
