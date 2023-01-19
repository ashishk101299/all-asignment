
import java.util.*;
public class QueueArray 
{
	int front1,front2,rear1,rear2,MaxSize,q[];
	     
	     void createQueue(int size)
	     {
	    	 MaxSize=size;
	         front1=0;
	         rear1=-1;

	         front2=MaxSize-1;
	         rear2=MaxSize;
	         
	         q=new int[MaxSize];
	     }
	      void enqueue1(int e)
	      {
	          rear1++;
	          q[rear1]=e;
	          
	      }
	  
	      
	      void enqueue2(int e)
	      {
	          rear2--;
	          q[rear2]=e;
	          
	      }
	
	  boolean isFull1()
	  {
	      if(rear1==(MaxSize/2)-1)
	          return true;
	      else
	          return false;
	  }
	  
	  boolean isFull2()
	  {
	      if(rear2==MaxSize/2)
	          return true;
	      else
	          return false;
	  }
	  
	  
	  int dequeue1()
	  {
	      int temp=q[front1];
	      front1++;
	      return(temp);
	  }
	  

	  int dequeue2()
	  {
	      int temp=q[front2];
	      front2--;
	      return(temp);
	  }
	  
	  boolean isEmpty1()
	  {
	      if(front1>rear1)
	          return true;
	      else
	          return false;
	  }
	  
	  boolean isEmpty2()
	  {
	      if(front2<rear2)
	          return true;
	      else
	          return false;
	  }
	  
	  void print1()
	  {
	      for(int i=front1   ;i  <=rear1   ; i++)
	          System.out.println(q[i]);
	  }
	  
	  void print2()
	  {
	      for(int j=front2   ;j  >=rear2   ; j--)
	          System.out.println(q[j]);
	  }
	  
	  public static void main(String args[])
	  {
	      int ch,e;
	      QueueArray obj=new QueueArray();
	      Scanner in=new Scanner(System.in);
	      System.out.println("Enter size of queue:");
	      int s=in.nextInt();
	      obj.createQueue(s);
	      do
	      {
	           System.out.println("1.enqueue1\n2.enqueue2\n3.dequeue1\n4.dequeue2\n5.print1\n6.print2\n0.exit");
	           ch=in.nextInt();
	           switch(ch)
	           {
	               case 1:
	                   if(!obj.isFull1())//is not full
	                   {
	                        System.out.println("Enter Data:");
	                        e=in.nextInt();
	                        obj.enqueue1(e);
	                        System.out.println("Enqueued");
	                   }
	                   else
	                        System.out.println("Queue Full");
	                   break;
	               
	               case 2:
	                   if(!obj.isFull2())//is not full
	                   {
	                        System.out.println("Enter Data:");
	                        e=in.nextInt();
	                        obj.enqueue2(e);
	                        System.out.println("Enqueued");
	                   }
	                   else
	                        System.out.println("Queue Full");
	                   break;
	                   
	                case 3:
	                   if(!obj.isEmpty1())//is not empty
	                   {
	                        e=obj.dequeue1();
	                        System.out.println("Dequeued:"+e);
	                   }
	                   else
	                        System.out.println("Queue Empty");
	                   break;
	                
	                case 4:
		                   if(!obj.isEmpty2())//is not empty
		                   {
		                        e=obj.dequeue2();
		                        System.out.println("Dequeued:"+e);
		                   }
		                   else
		                        System.out.println("Queue Empty");
		                   break;
		                   
	                case 5:
	                    if(!obj.isEmpty1())//is not empty
	                    {
	                         System.out.println("Queue has:");
	                         obj.print1();
	                    }
	                    else
	                         System.out.println("Queue Empty");
	                    break;  
		            
	                case 6:
	                    if(!obj.isEmpty2())//is not empty
	                    {
	                         System.out.println("Queue has:");
	                         obj.print2();
	                    }
	                    else
	                         System.out.println("Queue Empty");
	                    break;  
	                
	             
	                 case 0:
	                        System.out.println("Exiting ");
	                        break;
	                 default:
	                        System.out.println("Wrong option selected");
	                        break;
	           }
	      }while(ch!=0);
	      in.close();
	      }
	      









}
