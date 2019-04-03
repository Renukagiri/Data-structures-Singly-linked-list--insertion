
package data.structure;

import java.io.*;
public class singlylinkedlist 
{
    
    Node head; //head of list
    
    static class Node       //defines as static so that main() can access it
    {
        int data;      //like structure in c
        Node next;
        
        
    Node(int d)     //constructor
    {
        data = d;
        next = null;
    }
    }
    static int c=0;
    public static Node insert(singlylinkedlist list,int data)
    {
        c++;
        Node new_node = new Node(data); //new node with data
        new_node.next = null;
        Node last = null;
        if(list.head == null) //if the list is empty
            list.head = new_node; // insert list with new node
        else
        {
            last = list.head;  //if not empty create new node called last and traverse until lastnode and insert node at last.
        while(last.next != null)   //check if there is value in nextnode // traverse until last node 
        {
            last = last.next;    // head moves to nextnode if there is value until last.next becomes empty
            
           
            
        }
        
        last.next = new_node; // insert as last node
        
        }
        System.out.println("i"+c);
    return last;
      
    }
   
    public static void print(singlylinkedlist list)
    {
        int c = 0;
        Node curnode = list.head; // create node called curnode which contains list's head
        while(curnode != null)//check if curnode is empty
        {
            c++;
            System.out.println(curnode.data); // print the value
            curnode = curnode.next; // moves further
              //System.out.println("c"+c);
        }
        System.out.println("number of nodes:"+c);
        
    }
    
    
    public static void main(String[] args) 
    {
        singlylinkedlist list = new  singlylinkedlist();
       list.insert(list,1);
        
       list.insert(list,2);
         
        list.insert(list,3);
         
        list.insert(list,4);
      
        print(list);
        
    }
    
}
