
package towerofhanoidemo;

class TowerOfHanoi
{
    public void TowerOfHanoi(int n, int a, int b, int c)
    {
        if(n>0)
        {
            TowerOfHanoi(n-1,a,c,b);
            System.out.print(a+","+c+"\t");
            TowerOfHanoi(n-1,b,a,c);
        }
    }
}

public class TowerOfHanoiDemo
{
    public static void main(String[] args)
    {
        TowerOfHanoi obj = new TowerOfHanoi();
        obj.TowerOfHanoi(4, 1, 2, 3);
    }
}
