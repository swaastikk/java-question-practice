public class roj20delete_array {
    public static void main(String[] args) {
        
        int [] a = { 10, 20, 30, 40, 50, 70, 90};

        int del_element = 40;

        for(int i=0; i<=a.length; i++){
            if(del_element == a[i]){
                for(int j=i; j<a.length; j++){
                    a[j] = a[j+1];
                }
                break;
            }
        }
        for(int i=0; i<a.length-1; i++){
            System.out.print(a[i]+" ");
        }
    }
}
