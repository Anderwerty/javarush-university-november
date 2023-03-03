package com.javarush.module3.lesson16.facade;

public class Facade {
    private final StorageService storageService;
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public Facade(StorageService storageService, PaymentService paymentService, DeliveryService deliveryService) {
        this.storageService = storageService;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
    }

    public void execute(String name) {
        storageService.getFromStorage(name);
        paymentService.providePayment();
        deliveryService.deliver();
    }
}

class StorageService {
    void getFromStorage(String name) {
        System.out.println("Take from storage: " + name);
    }
}

class PaymentService{
    void providePayment(){
        System.out.println("Payment");
    }
}
class DeliveryService{
    void deliver(){
        System.out.println("deliver");
    }
}
