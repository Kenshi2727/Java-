public class duplicateOptimized
 {
    public static void main(String[] args) {
        int a[]={2,4,4,7,10};  //No need to sort as previous element already compared
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
             if(a[i]==a[j])
             System.out.println(a[i]);
            }
           
        }
    }
}
   

