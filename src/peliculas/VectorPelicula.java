package src.peliculas;
import src.tienda.*;

public class VectorPelicula {
    private  Pelicula[] peli = new Pelicula[50];
    private int siguienteCodigo;
    
    public VectorPelicula(){
        siguienteCodigo = 1;
    }
    public void agregarPelicula(int id,String pelicula,int ano,String categoria){
        if (50<siguienteCodigo) {
            System.out.println("limite de peliculas alcanzado");
            return;
        }else{
            peli[siguienteCodigo-1] = new Pelicula(id, pelicula, ano, categoria);
        }
        siguienteCodigo++;
    }
    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int ano = IngresoDatos.getEntero("Ingresse el año", false);
        String categoria = IngresoDatos.getTexto("Ingrese la categoria");
        agregarPelicula(siguienteCodigo,nombre,ano,categoria);
    }
    public void mostrarPeliculas(){
        System.out.print("\n\n ------------------------Peliculas de memorabilia----------------------------");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.print("-"+i+") "+peli[i].getInformacion());
        }
        System.out.print("\n\n");
    }
    public void ordenarPorNombre(boolean ascendente){
        Pelicula seleccion;
        boolean cambio = true;
        int posicion = 0;
        for (int i = 0; i < siguienteCodigo-1; i++) {
            seleccion = peli[i];
            posicion = i;
            for (int j =i+1; j < siguienteCodigo-1; j++) {
                if (ascendente) 
                    cambio = (peli[j].getPelicula().compareTo(peli[j+1].getPelicula())>0);
                else
                cambio = (peli[j].getPelicula().compareTo(peli[j+1].getPelicula())<0);
                if (cambio) {
                    seleccion = peli[j];
                    posicion = j;
                }
            }
            peli[posicion]=peli[i];
            peli[i]=seleccion;
        }
    }
}
