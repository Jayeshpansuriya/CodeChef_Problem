public class breck_and_continue {
    private static Object sout;

    public static void main(String[] args) {
        System.out.println("this is breck and continue program ");
        // for(int i=0;i< 5;i++){
        //     System.out.println(i);
        //     System.out.println("java is great");
            
        //     if(i==2){
              
        //         System.out.println("java is not great");
        //         break;
        //     }
        // }
        // System.out.println("loops ends heare");


        //continue condition
        // 
        
        for(int i=0;i< 10;i++){
            if(i==2){
              System.out.println(i);
                System.out.println("java is not great");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
            
           
        }
        System.out.println("loops ends heare");
    }
}
