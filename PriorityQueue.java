public class PriorityQueue {
  
    private PriorityCustomer [] heap;
    private int size = 0;
    
    int totalCustomers = 0;
    int currentCustomers = 0;
    
    public PriorityQueue()
    {
    heap = new PriorityCustomer[60];
    size = 0;
    }
    
    public PriorityQueue(int s)
    {
     heap = new PriorityCustomer[s];  
     size = 0;
    }
    
    public int getSize()
    {
        return size;
    }
   
    public void add(PriorityCustomer c)
    {
        if (size + 2 > heap.length) 
        {    
        System.out.println ("The heap is full");         
        return;
        }
                size++;
                totalCustomers++;
            
                 currentCustomers++;
                 
                 heap [size] = c;
                 
                 int index = size;
                 
                 while (index > 1) 
                 {
                     int parentIndex = index / 2;
                     if (heap[index].getPriority () > heap[parentIndex].getPriority())
                     {
                         PriorityCustomer temporary = heap[index];  
                         heap[index] = heap[parentIndex];         
                         heap[parentIndex] = temporary;
                         index = parentIndex;
                     }
                     else 
                     { 
                         break;        
                     }
                 }
    }
    
    public PriorityCustomer remove()
    {
        if (size == 0)
        {
            System.out.println ("The heap is already empty");      
            return null;
        }
        currentCustomers--;
        PriorityCustomer temporary = heap [1];
        heap [1] = heap [size];      
        heap [size] = null;      
        size--;
        int index = 1;
        
        while (index <= size / 2)
        {
            int leftChildIndex = index * 2;         
            int rightChildIndex = leftChildIndex + 1;
            int leftChildValue = heap [leftChildIndex].getPriority ();         
            int rightChildValue = Integer.MIN_VALUE;
        if (rightChildIndex <= size) 
        {  
            rightChildValue = heap [rightChildIndex].getPriority ();         
        }
        int largerValue;         
        int largerIndex;
        
        if (rightChildValue > leftChildValue)
        {
            largerValue = rightChildValue;            
            largerIndex = rightChildIndex;
        }
        else
        {
            largerValue = leftChildValue;            
            largerIndex = leftChildIndex;
        }
        if (heap[index].getPriority () < largerValue)
        {
            PriorityCustomer swap = heap [index];           
            heap [index] = heap [largerIndex];            
            heap [largerIndex] = swap;
            index = largerIndex;
        }
        else
        {
            break;
        }
        }
        return temporary;
        }
    
    public PriorityCustomer frontofLine()
        {
           return heap[1];
        }
        
        public int gettotalCustomers()
        {
            return totalCustomers;
        }
        
        public int getcurrentCustomers()
        {
            return currentCustomers;
        }
        
      }
        
        
        

