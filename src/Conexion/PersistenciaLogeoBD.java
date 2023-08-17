package Conexion;

import Modelo.Logeo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class PersistenciaLogeoBD {

    public boolean Guardar(Object logeo) {
        //Escritura
        FileOutputStream fichero = null;
        try {
            fichero = new FileOutputStream("Logeo.bin");
            ObjectOutputStream objg = new ObjectOutputStream(fichero);
            objg.writeObject(logeo);
            fichero.close();
            objg.close();
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error -->\n" + e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public void Leer() {
        //Lectura
        FileInputStream fichero = null;

        try {
            fichero = new FileInputStream("Logeo.bin");
            ObjectInputStream obji = new ObjectInputStream(fichero);
            PersistenciaLoginBD l = (PersistenciaLoginBD) obji.readObject();
            Logeo p = new Logeo(l.getPuerto(), l.getHost(), l.getBase());
            obji.close();
            fichero.close();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se a configurado la conexion\n Usando base local", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            PersistenciaLoginBD p = new PersistenciaLoginBD("localhost", "GSPA", "5432");
            Guardar(p);
        }
    }
}

