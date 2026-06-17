public class EvenOdd{
    public static void main(String[] args){
        int a[]={3,2,6,5,9};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]+"is Even");
            }
            else{
                System.out.println(a[i]+"is Odd");
            }
        }
    }
}