class missing
{
    public static void main(String[] args) {
        int a[]={1,2,4,7,6,5};
        int n=a.length+1;
        int sum=0;
        for(int i=0;i<a.length;i++) //time complexity O(n)
        sum+=a[i];
        System.out.println("Missing number is "+(((n*(n+1))/2)-sum));
    }
}