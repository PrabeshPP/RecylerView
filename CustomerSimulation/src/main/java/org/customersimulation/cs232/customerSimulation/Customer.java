package org.customersimulation.cs232.customerSimulation;

public class Customer {
    private String customerName;
    private int arrivalTime;

    @Override
    public String toString() {
        return "Customers{" +
                "customerName='" + customerName + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", customerIssue='" + customerIssue + '\'' +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerIssue() {
        return customerIssue;
    }

    public void setCustomerIssue(String customerIssue) {
        this.customerIssue = customerIssue;
    }

    private int age;
    private String email;
    private String address;

    private String customerIssue;


}
