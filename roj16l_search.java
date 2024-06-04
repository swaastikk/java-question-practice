class roj16l_search{
    public static void main(String[] args) {
        
        int [] A ={5,3,8,7,1,9};

        int item = 7;
        int temp=0;

        for(int i=0; i<A.length; i++){
            if(A[i]==item){
                System.out.println("item is present at " +i+ " index position");
                temp=temp+i;
            }
        }
        if(temp==0){
            System.out.println("item is not present in the array list");
        }
    }
}
