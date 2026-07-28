package portfoliobackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import portfoliobackend.model.EmailRequest;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(EmailRequest request) {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setFrom("ttheh98@gmail.com");
        mail.setTo("ttheh98@gmail.com");

        mail.setSubject(request.getSubject());

        mail.setText(
                "Name: " + request.getName() +
                        "\nEmail: " + request.getEmail() +
                        "\n\nMessage:\n" +
                        request.getMessage()
        );

        mailSender.send(mail);
    }
}