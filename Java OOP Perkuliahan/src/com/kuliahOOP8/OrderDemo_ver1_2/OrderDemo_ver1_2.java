package com.kuliahOOP8.OrderDemo_ver1_2;

import java.util.Scanner;

// Versi Composite

class ProductionOrder {
    private Customer customer;s
    private Shirt shirt;
    private String customerData;
    private String orderDetails;

    public ProductionOrder(){
      customer = new Customer();
      shirt = new Shirt();
    }

    public void setCustomerData(String nama){
        customer.setName(nama);
    }

    public void setShirtSize(String size){
        shirt.setSize(size);
    }

    public void setShirtColour(String colour) {
        shirt.setColour(colour);
    }
    
    public String getCustomerData(){
        this.customerData = "Customer name : " + customer.getName();
        return this.customerData;
    }

    public String getOrderDetails(){
        this.orderDetails = "Shirt ordered :" + "\n" +
                                   "    Colour: " + shirt.getColour() + "\n" +
                                   "    Size  : " + shirt.getSize();
        return this.orderDetails;
    }
}


class Customer {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}


class Shirt {
    private String size;
    private String colour;

    public void setSize(String size) {
        this.size = size;
    }
    
    public String getSize() {
        return this.size;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return this.colour;
    }
}

public class OrderDemo_ver1_2 {
    public static void main(String[] args) {
        System.out.println("****************" + "\n" +
                           "Production Order \nv 1.0" + "\n" +
                           "****************\n");

        Scanner inputUser = new Scanner(System.in);
        ProductionOrder productionOrder = new ProductionOrder();
        
        System.out.println("Please fill in the order details: ");
        System.out.print(" Customer name: ");
        productionOrder.setCustomerData(inputUser.nextLine());
        
        System.out.println(" Shirt ordered: ");

        System.out.print("  Colour: ");
        productionOrder.setShirtColour(inputUser.nextLine());
        
        System.out.print("  Size: ");
        productionOrder.setShirtSize(inputUser.nextLine());

        System.out.println();

        System.out.println("Order Details:" + "\n" 
                         + "--------------" + "\n"
                         + productionOrder.getCustomerData() + "\n"
                         + productionOrder.getOrderDetails());

        inputUser.close();
    }
}