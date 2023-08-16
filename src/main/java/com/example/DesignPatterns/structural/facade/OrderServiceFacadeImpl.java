package com.example.DesignPatterns.structural.facade;

/**
 * In the facade we implemented the placeOrder() method that consolidates all subsystem interactions.
 * In this method, we called methods on the services to perform the operations of fulfilling an order.
 */
public class OrderServiceFacadeImpl implements OrderServiceFacade{
    @Override
    public boolean placeOrder(int productId) {
        boolean orderFulfilled=false;
        Product product=new Product();
        product.productId=productId;
        if(InventoryService.isAvailable(product))
        {
            System.out.println("Product with ID: "+ product.productId+" is available.");
            boolean paymentConfirmed= PaymentService.makePayment();
            if(paymentConfirmed){
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled=true;
            }
        }
        return orderFulfilled;
    }
}
