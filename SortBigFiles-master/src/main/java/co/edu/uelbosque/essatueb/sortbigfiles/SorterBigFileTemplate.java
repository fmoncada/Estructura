/*
 * Apache 2.0
 * Universidad El Bosque  * 
 */
package co.edu.uelbosque.essatueb.sortbigfiles;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Alejandro Leon
 */
public abstract class SorterBigFileTemplate {
    
    protected File toSort;
    protected int linesPerFile;
    protected File outPutDir;

    public SorterBigFileTemplate(File toSort, int linesPerFile, File outPutDir) {
        this.toSort = toSort;
        this.linesPerFile = linesPerFile;
        this.outPutDir=outPutDir;
    }
    
    
    /**
     * 
     * @param toSort File to sort
     * @param linesPerFile Number of Lines perFile
     * @return number of chunks generated
     */
    
    public int breakFileInChunksAndSortIt(Comparator c){
        int numberOfFile=2;
        while(hasMoreLines()){
            String lines[]=getNextLines();
                for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                String persona[] = line.split(",");
                    int edad = Short.parseShort(persona[0]);
                    String nombre = persona[1];
                    String tipoDocumento = persona[2];
                    String tipoSangre = persona[3];
                Persona p = new Persona(edad, nombre, tipoDocumento,tipoSangre);
            }
            Arrays.sort(lines, c);
            saveToNewFile(lines,numberOfFile);
            numberOfFile++;
        }
        return numberOfFile;
    }

    /**
     * Read the next amount of lines for the file 
     * @return 
     */
    public abstract String[] getNextLines();

    /**
     * 
     * @return true when the file to sort has more lines to read 
     */
    public  abstract boolean hasMoreLines() ;

    /**
     * Save the lines to a file in the output folder with a consecutive
     * number at the end of file name
     * @param lines 
     */
    public abstract void saveToNewFile(String[] lines,int fileNumber);
}
