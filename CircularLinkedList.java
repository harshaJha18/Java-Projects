import java.util.*;
public class CircularLinkedList {
    private Node start;
    private int count;
    public void append(int x){
        count++;
        Node temp=new Node(x);
        if(start==null){
            start=temp;
        }else{
            Node tp=start;
            while(tp.link!=start){
                tp=tp.link;
            }
            tp.link=temp;
        }
        temp.link=start;
    }
    public void addBeg(int x){
        count++;
        Node temp=new Node(x);
        if(start==null){
            temp.link=temp;
        }else{
            Node tp=start;
            while(tp.link!=start){
                tp=tp.link;
            }
            tp.link=temp;
            temp.link=start;
        }
        start=temp;
    }
    public void addAt(int pos,int x){
        Node temp,tp;
        temp=new Node(x);
        tp=start;
        for(int i=0;i<pos;i++){
            if(tp.link==start)
                break;
            tp=tp.link;
        }
        temp.link=tp.link;
        tp.link=temp;
        count++;
    }
    public void displayList(){
        if(start==null)
            System.out.println("List is empty..");
        else{
        Node temp=start;
               while(temp.link!=start){
            System.out.println(" "+temp.data);
            temp=temp.link;
        }
        System.out.println(temp.data);
    }
}
    public void count()
    {
        int count=0;
        if(start==null)
            System.out.println("List is empty..");
        else{
        Node temp=start;
        System.out.print("->");
        while(temp.link!=start){
                        temp=temp.link;
                        ++count;
        }
        System.out.println("Numbers of nodes:- " +count);
    }
}
    public void deleteAt(int position){
        Node current=start;
        Node previous=start;
        for(int i=0;i<position;i++){
            if(current.link==start)
                break;
            previous=current;
            current=current.link;
        }
        System.out.print(current.data);
        if(position==0)
            deleteFirst();
        else
            previous.link=current.link;
        count--;
    }
    public void deleteFirst() {
        Node temp=start;
        while(temp.link!=start){
            temp=temp.link;
        }
        temp.link=start.link;
        start=start.link;
        count--;
    }
    public int getCount(){
        return count;
    }
    private static class Node{
    int data;
    Node link;
    public Node(int data){
        this.data=data;
    }
    @SuppressWarnings("unused")
    public Node(int data,Node link){
        this.data=data;
        this.link=link;
    }
    }
}

class main
{
public static void main(String args[]){
    CircularLinkedList ccl=new CircularLinkedList();
    int n, number ,after;
    Scanner in = new Scanner(System.in);
    do{
    System.out.println("1. Insert in beginning\n2. Insert at end\n3. Insert at b/w\n4. Delete the key\n5. Delete from first\n6. Display\n7.Count the Number of nodes\n8.Exit\nPress you choice...... ");
    n=in.nextInt();
switch(n)
{
case 1:
System.out.println("Enter the Number-: ");
number=in.nextInt();
  ccl.addBeg(number);
break;
case 2:
System.out.println("Enter the Number-: ");
number=in.nextInt();
ccl.append(number);
break;
case 3:
System.out.println("Enter the Number You want to insert-: ");
number=in.nextInt();
System.out.println("Enter the Number after that you want to insert-: ");
after=in.nextInt();
ccl.addAt(after, number);
case 4:
System.out.println("Enter the Number you want to delete:-");
number=in.nextInt();
ccl.deleteAt(number);
System.out.print("Element is deleted");
break;
case 5:
ccl.deleteFirst();
System.out.print("Element is deleted");
break;
case 6:
ccl.displayList();
break;
case 7:
ccl.count();
break;
case 8:
System.exit(0);
break;
}
}while(n<11);
  }
}
