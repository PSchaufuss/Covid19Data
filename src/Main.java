import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.loadFile("DatamatikerNøgletalRegionOpgave.csv");
        fileHandler.printData();
    }
}
