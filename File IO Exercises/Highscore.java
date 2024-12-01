import java.io.*;
public class Highscore {
    public static void main(String[] args) {
    //This assumes you already have the file in the right directory.  If not just create a blank txt in intellij and test it out
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //read input from console
            BufferedWriter bw = new BufferedWriter(new FileWriter("scores.txt"));
            System.out.println("Enter name");
            String name = br.readLine();
            System.out.println("Enter highscore");
            int highscore = Integer.valueOf(br.readLine());
            bw.write("Name: " + name + "\n");
            bw.write("Highscore: " + highscore);
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.println("File doesnt exist");
        }
    }
}
