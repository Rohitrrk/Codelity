package com.capgemini;
//store node
class Node 
{ 
    int data; 			//data part
    Node address; 		//address
    Node(int d)  { data = d;  address = null; } 
}

//linked list, create list, count number of nodes
class LinkedList 
{   
	Node head;
	//add node in list
    public void add(int new_data) 
    {
        Node new_node = new Node(new_data); //creating node
        new_node.address = head; 		//linking nodes
        head = new_node; 
    } 
    
    public int getCount() 
    { 
        Node temp = head; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.address; 
        } 
        return count; 
    }
}

public class Problem2{
	public static void main(String[] args) 
    { 
		LinkedList list = new LinkedList(); 
        list.add(1); 
        list.add(3); 
        list.add(1); 
        list.add(2); 
        list.add(1); 
        int cnt = list.getCount();
        System.out.println(cnt); 
    } 
	//dadaram.jadhav@capgemini.com
	
	
}
