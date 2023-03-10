
package paquete1;

class ArbolAST {
    //Creamos un nodo raíz. 
    private Nodo raiz;

    public ArbolAST() {

    }
    
    //Creamos un metodo para buscar el dato en un nodo.
    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }
    
    //Este metodo sirve para búscar en cada uno de los nodos el dato. 
    private boolean existe(Nodo n, String busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato().equals(busqueda)) {
            return true;
        } else if (busqueda.compareTo(n.getDato()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }
    
    //Insertamos un nodo en la raíz. 
    public void insertar(String dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }
    
    //Insertamos el dato en uno de los nodos hijos. 
    private void insertar(Nodo padre, String dato) {
        if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    //Imprimimos el árbol de manera adecuada.
    private void mostrarDatos(Nodo n) {
        if (n != null) {
            ArbolAST.this.mostrarDatos(n.getIzquierda());
            ArbolAST.this.mostrarDatos(n.getDerecha());
            n.imprimirDato();
        }
    }


    public void mostrarDatos() {
        this.mostrarDatos(this.raiz);
    }
}

