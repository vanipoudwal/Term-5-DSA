
package insertdeletetraversenodedemo;

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
            public void InsertBeg(int value)
            {
                Node nn = new Node();
                nn.setData(value);
                nn.setNext(start);
                start = nn;
                size++;
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
            public void InsertLast(int value)
            {
                Node n = new Node();
                n.setData(value);

                if(isEmpty())
                {
                    start = n;
                }
                else
                {
                    Node c;
                    c = start;
                    while(c.getNext() != null)
                    {
                        c = c.getNext(); 
                    }
                    c.setNext(n);
                    size++;
                }
            }
            public void DeleteBeg()
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
    }

public class InsertDeleteTraverseNodeDemo
{
    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();
            myList.InsertBeg(3);
            //3
            myList.InsertBeg(8);
            //8 3
            myList.InsertBeg(87);
            //87 8 3
            myList.InsertLast(9);
            //87 8 3 9
            myList.DeleteBeg();
            //8 3 9
            myList.ViewList();
    }
}
