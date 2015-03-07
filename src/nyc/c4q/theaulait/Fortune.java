package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/7/15.
 */
import java.util.Scanner;
public class Fortune {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String season;
        System.out.println("Which season were you born in?");
        season = input.nextLine();
        season = season.toLowerCase();

        if (season.equals("winter")) {
            System.out.println("Your future is filled with new money");
        } else if(season.equals("spring")){
            System.out.println("Your future is filled with love");
        } else if(season.equals("summer")){
        System.out.println("Your future is filled with adventure");
        }
         else if(season.equals("fall")){
        System.out.println("Your future is filled with happiness ");
        }
        else{
        System.out.println("Your fortune is unclear");
        }
        }

    }