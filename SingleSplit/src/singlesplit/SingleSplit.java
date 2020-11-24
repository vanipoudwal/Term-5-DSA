
package singlesplit;

public class SingleSplit 
{
    public static void main(String[] args) 
    {
        String data = "ram,21,32000";
        String arr[] = data.split(",");
        
            System.out.println("Name : "+arr[0]);
            System.out.println("Age : "+arr[1]);
            System.out.println("Sal : "+arr[2]);
    }
}
