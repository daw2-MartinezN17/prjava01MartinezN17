/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01MartinezN17;

/**
 *
 * @author cognom17
 */

import java.io.*;

public class prjava01MartinezN17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer01MartinezN17.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova p&agrave;gina  web de MartinezN17");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Nova p&agrave;gina web de MartinezN17");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }
}
