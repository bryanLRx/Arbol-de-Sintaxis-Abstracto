package paquete1;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String args[]) {
        //Instanciamos el arbol.
        ArbolAST arbol = new ArbolAST();
        //Ingresamos la expresión.
        String a = JOptionPane.showInputDialog(null, "Ingresa la expresión: ");
        //Convertimos la expresion en caracteres. 
        char b[] = a.toCharArray();
        String x = "";
        //Los ingresamos en el árbol. 
        for(int i = 0; i<b.length; i++){
            x = String.valueOf(b[i]);
            if((x.equals(")")==false)){
                if((x.equals("(")==false)){
                    arbol.insertar(x);
                }
                
            }
            
        }
        //Lo imprimimos. 
        System.out.println("Recorrido del árbol:");
        arbol.mostrarDatos();
    }
}
