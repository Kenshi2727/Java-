public class palindrome {
    public static void main(String[] args) {
        int a[]={1,2,3,3,2,1};
        boolean flag=false; 
        for(int i=0;i<a.length/2;i++) //optimized approach
        {
         if(a[i]!=a[a.length-i-1])
         {
            flag=true;
            break;
         }
        }
        if(flag==false)
        System.out.println("Palindrome Array");
        else
        System.out.println("Not Palindrome Array");
    }
}
