package main;

import files.manager.FileManager;
import statistics.Statistics;

/**
 *
 * @author Lexynux
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileManager fm = new FileManager();
        fm.loadData("data/datos.csv");
        
        Statistics stat = new Statistics(fm.getMyListA());
        System.out.println("\t\t\tMean\t\tStd. Dev\n----------------------------------------------------------");
        System.out.println("File 1: Column 1:\t" + stat.calculateMean() + "\t\t" + stat.calculateStdDeviation());
        
        stat = new Statistics(fm.getMyListB());
        System.out.println("File 1: Column 2:\t" + stat.calculateMean() + "\t\t" + stat.calculateStdDeviation());
        
        System.out.println("");
    }
    
}
