package Project1;
class LinkNode
{
    public int data;
    public LinkNode next;
    public LinkNode(int data, LinkNode first)
    {
        this.data = data;
        this.next = first;
    }
}
public class CircularLinkedList {
	public LinkNode head;
    // Class constructor
    CircularLinkedList()
    {
        this.head = null;
    }
    // Insert node in sorted order
    public void insert(int value)
    {
        // Create a new node
        LinkNode node = new LinkNode(value, this.head);
        if (this.head == null)
        {
            // First node of linked list
            this.head = node;
            node.next = this.head;
        }
        else
        {
            LinkNode temp = this.head;
            LinkNode hold = null;
            if (temp.data >= value)
            {
                // Insert node at beginning
                // Find the last node
                while (temp.next != this.head)
                {
                // Visit to next node
                    temp = temp.next;
                }
                // Connect last node to new node
                temp.next = node;
                node.next = this.head;
                this.head = node;
            }
            else
            {
                hold = temp;
                // Get inserted location
                while (temp.next != this.head && value > temp.data)
                {
                    hold = temp;
                    temp = temp.next;
                }
                if (temp.data >= value)
                {
                    // When add element of between two nodes
                    node.next = hold.next;
                    hold.next = node;
                }
                else
                {
                    // When add element at last position
                    node.next = temp.next;
                    temp.next = node;
                }
            }
        }
    }
    // Display node element of circular linked list
    public void display()
    {
        if (this.head == null)
        {
            System.out.println("Empty Linked List");
        }
        else
        {
            LinkNode temp = this.head;
            // iterate linked list
            while (temp != null)
            {
                // Display node
                System.out.print("  " + temp.data);
                // Visit to next node
                temp = temp.next;
                if (temp == head)
                {
                    // Stop iteration
                    return;
                }
            }
        }
    }

	public static void main(String[] args) {
		 CircularLinkedList task = new CircularLinkedList();
	        // Insert following linked list nodes
	        task.insert(3);
	        task.insert(5);
	        task.insert(7);
	        task.insert(4);
	        task.insert(9);
	        task.insert(10);
	        task.insert(1);
	        task.insert(2);
	        // Display node value
	        task.display();
		 
	}

}
