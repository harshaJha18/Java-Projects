import java.util.*;
class double_ended_list
{
	long dData;
	long Link next;

double_ended_list(long d)
{
	dData=d;
}

void displayLink()
{
	System.out.println(dData + " ");
}

}

class FirstLastList
{
	private Link first;
	private Link last;

FirstLastList()
{
	first = null;
	last=null;
}

boolean isEmpty()
{
	return first== null;
}

void insertFirst(long dd)
{
	Link newLink = new Link(dd);
	if (isEmpty())
	{
		last= newLink;
		newLINK.next=first;
		first=newLink;
	}
}

void insertLast(log dd)
{
	Link newLink = newLink(dd);
	if(isEmpty())
	{
		first=newLink;
		last=newLink;
	}
}

long deleteFirst()
{
	long temp= first.dData;
	if(first.next==null)
	{
		last=null;
		first=first .next;
		return temp;
	}
}

void displayList()
{
	System.out.println("List (first--> last): ");
	Link current= first;
	while(current !=null)
	{
		current.displayLink();
		current=current.next;
	}
	System.out.println(" " );
}
}
class main
{
	public static void main(String[] args)
	{
FirstLastList l=new FirstLastList();
Scanner in = new Scanner(System.in);
int c;
do
{
	System.out.println("\n\t1.Insert at First\n\t2.Insert at Last\n\t3.Delete\n\t4.display\n\t5.Exit\n\tPress your choice.....")
        c=in.nextInt();
       switch(c)
       {
	case 1:
       System.out.println("\n\tInsert Number-:\t");
       int insertno=in.nextInt();
       l.insertFirst(insertno);
       break;
	case 2:
       System.out.println("\n\tInsert Number-:\t");
       int insertno1=in.nextInt();
       l.insertLast(insertno1);
       break;
       case 3:
       l.deleteFirst();
       System.out.println("\n\tElement Delete\t");
       break;
       case 4:
       System.out.println("\n\tLinklist  is-:\t");
       l.displayList();
       case 5:
       System.exit(0);
       break;
       default :
       System.out.println("\n\tYou press wrong key ...... try again....\t");
       }
        }while(c<6);
}
}
 
