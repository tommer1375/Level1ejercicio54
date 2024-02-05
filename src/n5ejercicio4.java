import java.io.*;


public class n5ejercicio4 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo a leer:");
        String datoString = myObj.nextLine();
        leerDirectorio.leerArchivoTxt(datoString);

    }
}
