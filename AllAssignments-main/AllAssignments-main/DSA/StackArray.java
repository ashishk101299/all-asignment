import java.util.*;
public class StackArray
{
	int stack[],tos1,tos2,MaxSize;
	
	void createStack(int size)
	{
		MaxSize=size;
		tos1 = -1;
		tos2 = MaxSize;
		stack=new int[MaxSize];	
	}
	
	void push1(int num)
	{
		tos1++;
		stack[tos1]=num;
	}
	void push2(int num)
	{
		tos2--;
		stack[tos2]=num;
	}
	
	
	boolean isFull1()
	{
		if (tos1==MaxSize/2-1)
			return true;
		else
			return false;
	}
	boolean isFull2()
	{
		if (tos2==MaxSize/2)
			return true;
		else
			return false;
	}
	
	int pop1()
	{
		int temp =stack[tos1];
		tos1--;
		return (temp);
	}
	
	int pop2()
	{
		int temp =stack[tos2];
		tos2++;
		return (temp);
	}
	
	boolean isEmpty1()
	{
		if (tos1==-1)
			return true;
		else
			return false;
	}
	
	boolean isEmpty2()
	{
		if (tos2==MaxSize)
			return true;
		else
			return false;
	}
	
	int peek1()
	{
		return stack[tos1];
	}
	
	int peek2()
	{
		return stack[tos2];
	}
	
	void print1()
	{
		for(int i=tos1 ; i>-1 ; i--)
			System.out.println(stack[i]);
	}

	void print2()
	{
		for(int j=tos2 ; j<MaxSize ; j++)
			System.out.println(stack[j]);
	}


public static void main(String args[])
{
    int ch,e;
    Demo obj=new Demo();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter size of stack:");
    int s=in.nextInt();
    obj.createStack(s);
    do
    {
         System.out.println("1.push1\n2.push2\n3.pop1\n4.pop2\n5.peek1\n6.peek2\n7.print1\n8.print2\n0.exit");
         ch=in.nextInt();
         switch(ch)
         {
             case 1:
                 if(!obj.isFull1())//is not full
                 {
                      System.out.println("Enter Data:");
                      e=in.nextInt();
                      obj.push1(e);
                      System.out.println("Pushed");
                 }
                 else
                      System.out.println("Stack Full");
                 break;
                 
             case 2:
                 if(!obj.isFull2())//is not full
                 {
                      System.out.println("Enter Data:");
                      e=in.nextInt();
                      obj.push2(e);
                      System.out.println("Pushed");
                 }
                 else
                      System.out.println("Stack Full");
                 break;
                 
              case 3:
                 if(!obj.isEmpty1())//is not empty
                 {
                      e=obj.pop1();
                      System.out.println("Poped:"+e);
                 }
                 else
                      System.out.println("Stack Empty");
                 break;
                 
              case 4:
                  if(!obj.isEmpty2())//is not empty
                  {
                       e=obj.pop2();
                       System.out.println("Poped:"+e);
                  }
                  else
                       System.out.println("Stack Empty");
                  break;
                  
              case 5:
                  if(!obj.isEmpty1())//is not empty
                  {
                       e=obj.peek1();
                       System.out.println("@ peek1:"+e);
                  }
                  else
                       System.out.println("Stack Empty");
                  break;  
              case 6:
                  if(!obj.isEmpty2())//is not empty
                  {
                       e=obj.peek2();
                       System.out.println("@ peek2:"+e);
                  }
                  else
                       System.out.println("Stack Empty");
                  break;  
               
                case 7:
                  if(!obj.isEmpty1())//is not empty
                  {
                       System.out.println("Stack has:");
                       obj.print1();
                  }
                  else
                       System.out.println("Stack Empty");
                  break;  
                  

                case 8:
                  if(!obj.isEmpty2())//is not empty
                  {
                       System.out.println("Stack has:");
                       obj.print2();
                  }
                  else
                       System.out.println("Stack Empty");
                  break;  
              
               case 0:
                      System.out.println("Exiting ");
                      break;
               default:
                      System.out.println("Wrong option selected");
                      break;
         }
    }while(ch!=0);
    }
    
}       



        
        
