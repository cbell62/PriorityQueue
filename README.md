# ITSC 2214 (Data Structures and Algorithms) Programming Assignment 2 (Priority Queue)
- modify your first programming assignment to store your Customer objects in a priority queue instead of a regular queue. 
- An updated PriorityCustomer class is provided for you. You must use that class, without alternations, for the creation of your PriorityCustomer objects. 
-  You must analyze the class and use the provided methods to achieve the desired functionality of the program. 
-   You will also need to create two additional classes.  
    The first will be a PriorityQueue class that will represent the data structure for holding your Customer objects.  
     - In your PriorityQueue class, you will create the actual heap that will act as the priority queue.  
     - You must use an array representation of a heap.
     - No ArrayLists or linked structures! 
    The second class you will need to create is a driver where your store simulation will take place.
     - The program (driver) should simulate 60 minutes of activity at the store.
     - Each iteration of your program should represent one minute. 
     - At each iteration (minute), your program should do the following:
       1. Check to see if new customers are added to the queue.  
       2. There is a 25% chance that new customers show up (need to be added to the queue) every minute.  
       3. This does not mean you should add a customer every four iterations, but rather each iteration should have its own 25% chance.
       4. Update the customer object currently being serviced (if one exists).  This will be the customer object at the front of the queue.  
       5. If the customer has been completely serviced, remove them from the queue.
 - During execution, your program should output the following information:
   1. When a new customer is added to the queue, output, “New customer added!  Queue length is now X” where X is the size of the queue after the new customer has been added.
   2. When a customer has been completely serviced, output, “Customer serviced and removed from the queue.  Quest length is now X” where X is the size of the queue after the customer has been removed.
   3. At the end of each iteration (minute), output, “---------------------------------------------------“  to visually identify the passing of time.

 - When your simulation ends, your program should also output the following information:
  1. Total number of customers serviced
  2. Maximum line length during the simulation



     
