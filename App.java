import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String output="";
        int l = word.length();
        int lastin = l-1;
        int middle = (l/2);

        int i = middle;
        boolean breakflag = true;

        while(i<= lastin)
        {
            output = output + word.charAt(i);
            System.out.println("" + output);
            if(i  == lastin && breakflag ){
                i = 0;
                lastin = middle-1;
                 breakflag = false;

            }else{
                i++;
            }
        }

    }
}
