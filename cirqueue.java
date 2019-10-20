class cirqueue
{
int front;
int rear;
int arr[];
int maxsize;

cirqueue(int size, int a[])
{
front=-1;
rear=-1;
maxsize=size;
arr = new int[maxsize];
}

void insert(int item)
{
	if((rear+1)% maxsize==front)
	{
		System.out.println("Circular Queue is FULL....");
	}
	else
	if((front==rear)&&(rear==1))
	{
		rear=0;
		front=0;
		arr[rear]=item;
	}
	else
	{
		rear=(rear+1)%maxsize;
		arr[rear]=item;
	}
}

void delete()
{
 int ritem;
	if(front==-1)
	{
		System.out.print("Circular Queue is EMPTY.....");
		return (-1);	
	}
	else 
	if (front==rear)
	{
		ritem=arr[front];
		front++;
		rear=-1;
		return ritem;
	}
	else
	{
		ritem= arr[front];
		front++;
		return ritem;
	}
}

void display()
{
	for(int i=front; i<=rear; i++)
	{
		System.out.println(arr[i]);
	}
}
}

class main
{
public static void main (String args[])
{
int arr[]=new arr[5];
Scanner in = new Scanner(System.in);
cirqueue q = new cirqueue(5,arr);
int number;
do{
       System.out.println("\n\nMENU FOR QUEUE..........");
       System.out.println("\n1.\tInsert in Queue");
       System.out.println("\n2.\tDelete in Queue");
       System.out.println("\n3.\tDisplay in Queue");
       System.out.println("\n4.\tExit");
       System.out.println("\n\nEnter your Choice..........");
       number=in.nextInt();
       switch(c)
       {
       case 1:
       System.out.println("\n\tInsert Number-:\t");
       int insertno=in.nextInt();
       q.insert(insertno);
       break;
       case 2:
       int n=q.delete();
       if(n!=-1)
       System.out.println("\n\tElement from the queue is deleted\t");
       break;
       case 3:
       System.out.println("\n\tQueue is-:\t");
       q.display();
       case 4:
       System.exit(0);
       break;
       default :
       System.out.println("\n\tYou press wrong key ...... try again....\t");
       }
        }while(number<5);

}
}
