//time complexity:O(n^2)
public class duplicateVERY_BAD_APPROACH {
    public static void main(String[] args) {
        int a[]={2,4,4,7,10};
        int duplicate=0;
         int c=0;
        for(int i=0;i<a.length;i++)
        {
            c=0;
            for(int j=0;j<a.length;j++)
            {
             if(a[i]==a[j])
             {
             c++;
             }
            }
             if(c>1)
             {
                duplicate=a[i];
                break;            //break statment terminates innermost loop
             }
        }
        if(c>1)
        System.out.println("Duplicate No. is "+duplicate);
        else
        System.out.println("no duplicate number found");
    }
}
