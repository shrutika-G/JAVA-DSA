public class SmallestElement{
    public static void main(String[] args){
        int a[]={3,8,2,8,10};
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        System.out.println("Smallest Number:"+smallest);
    }
}