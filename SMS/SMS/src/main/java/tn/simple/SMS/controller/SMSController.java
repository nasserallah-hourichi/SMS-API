package tn.simple.SMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.simple.SMS.service.SMSService;
import tn.simple.SMS.entities.SMSRequest;

@RestController
@RequestMapping("/api/sms")
public class SMSController {

    @Autowired
    private SMSService smsService;

    @PostMapping("/send")
    public void sendSMS(@RequestBody SMSRequest smsRequest) {
        smsService.sendSMS(smsRequest.getTo(), smsRequest.getMessageBody());
    }
}
