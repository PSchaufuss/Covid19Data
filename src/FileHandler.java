import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler
{
    private ArrayList<Covid19Data> dataList = new ArrayList<>();

    public void loadFile(String filePath) throws IOException
    {
        try
        {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file, StandardCharsets.ISO_8859_1);
            scanner.nextLine();

            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] values = line.split(";");

                if (values.length == 7 && !values[0].isEmpty())
                {
                    Covid19Data data = new Covid19Data
                            (
                                    values[0], // Region
                                    values[1], // Aldersgruppe
                                    values[2], // Bekræftede tilfælde i alt
                                    values[3], // Døde
                                    values[4], // Indlagte på intensiv afdeling
                                    values[5], // Indlagte
                                    values[6] // Dato
                            );
                    dataList.add(data);
                }
            }
            scanner.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Filen blev ikke fundet: " + e.getMessage());
        }
    }

    public void printData()
    {
        for (Covid19Data data : dataList)
        {
            System.out.println(data);
        }
    }
}
