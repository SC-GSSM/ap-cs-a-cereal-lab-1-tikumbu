import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CerealRunner
{
    // create a private instance variable to store an ArrayList of Cereal objects
    private ArrayList<Cereal> cereals;

    public CerealRunner(String fileName)
    {
        // instantiate the ArrayList
        this.cereals = new ArrayList<Cereal>();

        try
        {
            FileReader fileRdr = new FileReader(fileName);
            Scanner scan = new Scanner(fileRdr);
            while(scan.hasNext())
            {
                String myStr = scan.nextLine();

                // use the split method to parse the data into an array of
                //   String objects
                String[] line = myStr.split(",");

                // go through each String array element and save it
                //   into the appropriate variable which will be used to
                //   create a Cereal object
                String n = line[0];
                int c = Integer.parseInt(line[1]);
                double f = Double.parseDouble(line[2]);
                double ca = Double.parseDouble(line[3]);
                double cu = Double.parseDouble(line[4]);

                // create a new Cereal object, and add it to the ArrayList
                Cereal choco = new Cereal(n, c, f, ca, cu);
                cereals.add(choco);

            }
            scan.close();


        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int numCereals = cereals.size();
        System.out.println(numCereals + " records created.");
    }

    public static void main(String[] args)
    {
        String fileName = "src/data/cerealSubset.csv";
        CerealRunner cr = new CerealRunner(fileName);
    }

}

