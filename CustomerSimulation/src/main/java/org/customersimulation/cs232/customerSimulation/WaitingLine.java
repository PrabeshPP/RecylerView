package org.customersimulation.cs232.customerSimulation;

import java.util.ArrayList;

public class WaitingLine {
    public ArrayList<Customer> waitingLine;
    public boolean isEmpty;

    public void add(Customer customer){
        int start=0;
        int end=waitingLine.size()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            Customer currentCustomer=waitingLine.get(mid);
            if(currentCustomer.getArrivalTime()<customer.getArrivalTime()){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        waitingLine.add(start,customer);
    }

    public Customer remove(){
        return waitingLine.remove(0);
    }

    public int length(){
        return waitingLine.size();
    }




}
