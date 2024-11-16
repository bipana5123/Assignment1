package Assignment1;

public class One1 {
    //Write a program to find the sum of all elements in an integer array.
    public static void main(String[] args)
    {
        int a[]={5,10,15,20};
        int sum =0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum = sum+a[i];
        }
        System.out.println(sum);



    }
}
