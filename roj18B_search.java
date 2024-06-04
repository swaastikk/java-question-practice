public class roj18B_search {
    public static void main(String[] args) {
        
        int [] a = {2,4,6,8,9,13,15,16,17,28,35,46,50};

        int srch = 156;
        int li = 0;
        int hi = a.length - 1;
        int mi = (li+hi)/2;

        while(li<=hi){
            if(a[mi]== srch){
                System.out.println("element is at "+mi+" index position");
                break;
            }
            else if(a[mi]<srch){
                li=mi+1;
            }
            else{
                hi = mi-1;
            }
            mi = (li+hi)/2;
        }
        if(li>hi){
            System.out.println("element not found ");
        }
    }
}
