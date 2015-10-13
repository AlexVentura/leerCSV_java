package files.manager;

import java.io.*;
import model.structs.LinkedLst;

/*
 * Lee un archivo separado por comas que se encuentra dentro
 * del proyecto en la carpeta data con el nombre datos.cvs
 */
/**
 *
 * @author Lexynux
 */
public class FileManager {

    LinkedLst<Float> myListA = null, myListB = null;

    public LinkedLst<Float> getMyListA() {
        return myListA;
    }

    public LinkedLst<Float> getMyListB() {
        return myListB;
    }
    
    public void loadData(String path) {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        String linea = null;

        try {
            // Creamos una nueva lista
            myListA = new LinkedLst();
            myListB = new LinkedLst();
            // Cargamos el archivo de la ruta relativa
            archivo = new File(path);
            // Cargamos el objeto FileReader
            fr = new FileReader(archivo);
            // Creamos un buffer de FileManager
            br = new BufferedReader(fr);

            String[] datos = null;

            // Leemos hasta que se termine el archivo
            while ((linea = br.readLine()) != null) {

                // Utilizamos el separador para los datos
                datos = linea.split(";");
                // Presentamos los datos
                //System.out.println("col: " + datos[0] + " col: " + datos[1]);
                // Guardamos los datos
                myListA.addLast(Float.parseFloat(datos[0]));
                myListB.addLast(Float.parseFloat(datos[1]));
            }

            // Capturamos las posibles excepciones
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
