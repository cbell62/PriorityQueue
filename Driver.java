/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Calista
 */
import java.util.*;
public class Driver {
   

    public static void main(String[] args) {
   
    PriorityQueue customerLine = new PriorityQueue();
    
    PriorityCustomer theCustomer = null;
    
    Random randNumber = new Random();
    
    //int waitTime;
    
    int maxNum = 0;
    
    
    for(int i = 0; i < 60; i++)
    {
        int number = randNumber.nextInt(4)+1;
    if (number == 1)
    {
        customerLine.add(new PriorityCustomer());
        System.out.println("New Customer Added! Queue length is now " 
                + customerLine.getcurrentCustomers());
    } else {
        System.out.println("No New Customers Added! Queue length is now " 
        + customerLine.getcurrentCustomers());
    }
        
     
    if (maxNum < customerLine.getcurrentCustomers())
    {
        maxNum = customerLine.getcurrentCustomers();
                }
    if(theCustomer == null)
    {
        theCustomer = customerLine.frontofLine();
    }
    
    
    if(theCustomer != null)
    {
        theCustomer.decServiceTime();
    
     if(theCustomer.getServiceTime()==0)
             {
                customerLine.remove();
                System.out.println("“Customer serviced and removed from the queue. "
                        + "Queue length is now " + customerLine.getcurrentCustomers());
                theCustomer = null;
             
             if(customerLine.gettotalCustomers()>0)
             {
                theCustomer = customerLine.frontofLine();
                 
             }
        
        }
    }
    
    System.out.println("---------------------------------------------------");
    }
    
        System.out.println("Total Customers is " + customerLine.gettotalCustomers());
    
            System.out.println("Maximum Line Length in PriorityQueue is " + maxNum);
    
    }

}


    


