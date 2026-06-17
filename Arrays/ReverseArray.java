public class ReverseArray{
    public static void main(String[] args){
        int a[]={3,4,5,2,7};
        System.out.print("Original array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nReversed array:");
        for(int i=a.length-1;i>=0;i--){//i=4,4>=0,4-- i=3,3>=0,3-- i=2,2>=0,2-- i=1,1>=0,1-- i=0,0>=0,0-- i=-1,-1>=0 false
            System.out.print(a[i]+" ");
        }
    }
}