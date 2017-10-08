package com.ascend.training.j4qa.basicsyntax.phone;

public class AltiHomePhone implements PhoneInterface {

    @Override
    public void dial(String destinationNumber) {
        System.out.println("AltiHomePhone calling to " + destinationNumber);
    }

    @Override
    public void receiveCall(String incomingNumber) {
        System.out.println("AltiHomePhone receiving call from " + incomingNumber);
    }

    @Override
    public String getModel() {
        return "Alti Wired phone RT-700";
    }

}
