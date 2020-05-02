import java.util.ArrayList;
import java.util.Scanner;

public class funarray {
    public static void main(String[] args) {


        String color;
        String character= "Q";

        ArrayList<String>colors = new ArrayList<>();
              colors.add("white");
              colors.add("blue");
              colors.add("black");


              Scanner input = new Scanner(System.in);

        for(int x=0; x<colors.size(); x++){
            System.out.print(colors.get(x) + " ");
        }
        System.out.println();
        for (int x=0; x<colors.size(); x++)
        if(x==1){
            System.out.println("The value at index 1 is "+ " "+ "= " +colors.get(x));
        }



        for (int x = 0; x < colors.size(); x++) {
            System.out.print( "Enter a color " + " OR " + "Enter Q to quit = ");
            color = input.nextLine();
            if (color.equalsIgnoreCase(character)) {
                System.out.println("Thanks for playing");
                break;


            }else {
                colors.add(color);
            }

        }
        System.out.println();
       for ( int x=0; x<colors.size(); x++){
           System.out.print( colors.get(x) + " ");
       }



















    }
}
