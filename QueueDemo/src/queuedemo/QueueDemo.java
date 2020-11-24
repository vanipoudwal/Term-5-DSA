
package queuedemo;

    class Node
    {
        private int data;
        private Node next;

        public Node()
        {
            data = 0;
            next = null;
        }

        public void setData(int data)
        {
            this.data = data;
        }
        public int getData()
        {
            return data;
        }
        public void setNext(Node n)
        {
            this.next = n;
        }
        public Node getNext()
        {
            return next;
        }
    }

    class LinkedList
    {
        private int size;
        private Node start;

        public LinkedList()
        {
            size = 0;
            start = null;
        }
        public int getSize()
        {
            return size;
        }
        public boolean isEmpty()
        {
            if(start == null)
                return true;
            else
                return false;
        }

        public void Insert(int value)
        {
            Node nn = new Node();
            nn.setData(value);

            if(isEmpty())
            {
                start = nn;
            }
            else
            {
                Node c;
                c = start;
                while(c.getNext() != null)
                {
                    c = c.getNext(); 
                }
                c.setNext(nn);
                size++;
            }
        }

        public void Delete()
        {
            if(isEmpty())
            {
                System.out.println("List is already empty..");
            }
            else
            {
                start = start.getNext();
                size--;
            }
        }

        public void ViewList()
        {
            if(isEmpty())
            {
                System.out.println("List is empty..");
            }
            else
            {
                Node c;
                c = start;
                while(c != null)
                {
                    System.out.print(c.getData()+"\t");
                    c = c.getNext();
                }
            }
        }
    }

public class QueueDemo
{
    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();
            myList.Insert(10);
            //10
            myList.Insert(20);
            //10 20
            myList.Insert(30);
            //10 20 30
            myList.Insert(40);
            //10 20 30 40
            myList.Delete();
            //20 30 40
            myList.ViewList();
    }
}