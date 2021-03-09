package vvi_example;

public class Solution1 {
	class CNode{
		int value;
		CNode next;
		CNode()
		{
			next = this;
		}
		CNode(int data){
			this.value= data;
			this.next=this;
		}
	}
static Solution1 s=new Solution1();
	public static void printList(CNode cList) {
		CNode temp = cList;
		do {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		while(temp!=cList);
	}
		public static void insertSortedCircularList(CNode cList,int val) {
			
			CNode new_node = s.new CNode(val);
			CNode current = cList;
			
			if(current==null) {
				new_node.next = new_node;
				cList = new_node;
			}
			else {
				while(current.next != cList && current.next.value <= new_node.value) {
					current = current.next;
				}
				new_node.next=current;
				current.next=new_node;
			}
			printList(cList);
		}
	}


