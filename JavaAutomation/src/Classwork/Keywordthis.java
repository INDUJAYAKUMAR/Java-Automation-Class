package Classwork;

public class Keywordthis
{
    // Instance methods
    public void instance1()
    {
        System.out.println("First instance");
    }

    public void instancepara()
    {
        int a = 5;
        System.out.println(a);
    }

    public static void main(String args[])
    {
        // Create an instance of Keywordthis
        Keywordthis var = new Keywordthis();
        
        // Call instance methods on the instance
        var.instance1();
        var.instancepara();
    }
}
