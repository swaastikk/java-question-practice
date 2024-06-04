public class roj17l_seach {
    public static void main(String[] args) {

        String[] a = { "aman", "swastik", "shikhar", "om", "adarsh" };
        String item = "om";
        int temp = 0;

        for(int i=0; i<a.length; i++){
            if(a[i].equals(item)){
                System.out.println("item is present at " +i+ " index position");
                temp = temp+ i;
            }
        }
        if(temp==0){
            System.out.println("item is not in the array list");
        }
    }
}
