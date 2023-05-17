package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.*;

public class MessageController {
    String ogmessage = "Everything operates as expected";
    String message = ogmessage;
    @RequestMapping("/api/message")
    public String showMessage(){
        return message;
    }
    @RequestMapping("/api/message/set")
    public String setMessage(@RequestParam String custommessage){
        message = custommessage;
        return "ok";
    }
    @RequestMapping("/api/message/reset")
    public String resetMessage(){
        message = ogmessage;
        return "ok";
    }

}
