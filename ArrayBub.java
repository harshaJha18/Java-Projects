import java.util.*;
class ArrayBub
{
private long[] a; // ref to array a
private int nElems; // number of data items
//--------------------------------------------------------------
public ArrayBub(int max) // constructor
{
a = new long[max]; // create the array
nElems = 0; // no items yet
}
//--------------------------------------------------------------
public void insert(long value) // put element into array
{
a[nElems] = value; // insert it
nElems++; // increment size
}
//--------------------------------------------------------------
public void display() // displays array contents
{
for(int j=0; j<nElems; j++) // for each element,
System.out.print(a[j] + " "); // display it
System.out.println("");
}
//--------------------------------------------------------------
public void bubbleSort()

{
int out, in;
for(out=nElems-1; out>1; out--) // outer loop (backward)
for(in=0; in<out; in++) // inner loop (forward)
if( a[in] > a[in+1] ) // out of order?
swap(in, in+1); // swap them
} // end bubbleSort()
//--------------------------------------------------------------
private void swap(int one, int two)
{
long temp = a[one];
a[one] = a[two];
a[two] = temp;
}
//--------------------------------------------------------------
} // end class ArrayBub
////////////////////////////////////////////////////////////////
class main

{
public static void main(String[] args)
{
int maxSize = 100;
Scanner in = new Scanner(System.in);
int number,n; // array size
ArrayBub arr; // reference to array
arr = new ArrayBub(maxSize); 
System.out.println("Enter the total numbers of element you want to insert :-  ");
n=in.nextInt();
System.out.println("Enter the Numbers :-  ");// create the array
for (int i=0;i<n;i++)
{
number=in.nextInt();
arr.insert(number);
}
System.out.print("Before sorting:-");
arr.display(); // display items
arr.bubbleSort(); 
System.out.print("After sorting:-");// bubble sort them
arr.display(); // display them again
} // end main()
} // end class BubbleSortApp
