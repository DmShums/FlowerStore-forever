package ua.edu.ucu.apps.flowerstore.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    public final PaymentService service;

    @Autowired
    public PaymentController(PaymentService service) {
        this.service = new PaymentService();
    }

    @GetMapping("/")
    public String get_payment() {
        return service.get_payment();
    }
}
