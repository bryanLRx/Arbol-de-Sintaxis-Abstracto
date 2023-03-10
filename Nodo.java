package paquete1;

class Nodo {
    
    //Un nodo esta compuesto de un dato, y un nodo izquierdo y derecho.
    private String dato;
    private Nodo izquierda, derecha;

    //Creamos un nodo con un dato, y los extremos con null.
    public Nodo(String dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    //Getters y Setters del dato y de los nodos. 
    public String getDato() {
        return dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}
