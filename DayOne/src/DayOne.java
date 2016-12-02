
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jamie
 */
public class DayOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String turn, move;
        BunnyHqFinder elf = new BunnyHqFinder("north");

        // -define .csv file in app
        String fileNameDefined = "imput.txt";
        // -File class needed to turn stringName to actual file
        File file = new File(fileNameDefined);

        try {
            // -read from filePooped with Scanner class
            Scanner inputStream = new Scanner(file);
            // hashNext() loops line-by-line
            while (inputStream.hasNext()) {
                //read single line, put in string
                String data = inputStream.next();
                turn = data.substring(0, 1);
                move = data.substring(1);
                System.out.println(turn);
                if (turn == "L") {
                    elf.turnLeft();
                } else if (turn == "R"){
                    elf.turnRight();
                } else {
                    break;
                }
                
                elf.move(parseInt(move));
            }
            // after loop, close scanner
            elf.distance();
            inputStream.close();
            

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }

}
