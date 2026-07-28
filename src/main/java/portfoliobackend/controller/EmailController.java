package portfoliobackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import portfoliobackend.model.EmailRequest;
import portfoliobackend.service.EmailService;

@CrossOrigin(origins = {
        "http://localhost:4200",
        "https://thembeka1.github.io"
})
@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public Map<String, String> sendEmail(@RequestBody EmailRequest request) {

        emailService.sendEmail(request);

        return Map.of("message", "Email sent successfully!");
    }
}