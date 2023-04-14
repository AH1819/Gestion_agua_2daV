package Entity;

import java.util.ArrayList;

public class Datos_Existentes {
    private static String[][] Contratos_Guardados;
    private static String[][] Clientes_Guardados;
    private static ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
    
    public String[][] getContratos_Guardados() {
        return Contratos_Guardados;
    }

    public void setContratos_Guardados(String[][] Contratos_Guardados) {
        this.Contratos_Guardados = Contratos_Guardados;
    }

    public Datos_Existentes() {
    }
    
    public String[][] getClientes_Guardados() {
        return Clientes_Guardados;
    }

    public void setClientes_Guardados(String[][] Clientes_Guardados) {
        this.Clientes_Guardados = Clientes_Guardados;
    }

    public ArrayList<ArrayList<String>> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<ArrayList<String>> arrayList) {
        this.arrayList = arrayList;
    }
    
}
