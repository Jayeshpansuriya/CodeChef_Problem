public class j{
          public static void printPerm(String str,String permutation){

            if(str.length()==0){
                System.out.println(permutation);
                return;
            }
            for( int i=0; i<str.length();i++){
                char currChar= str.charAt(i);
                String newStr =str.substring(0, 1) + str.substring(i+1);
                printPerm(newStr, permutation+currChar);

            }
          }
    public static void main(String[] args) {
        // System.out.println("Jayesh Dineshbhai Pansuriya");
        String str= "abc";
        printPerm(str, " ");
    }
}