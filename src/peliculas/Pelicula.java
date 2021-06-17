package src.peliculas;

public class Pelicula {
    private int id;
    private String pelicula;
    private int ano;
    private String categoria;
    private boolean disponible;

   public Pelicula(int id,String pelicula,int ano,String categoria,boolean disponible){
    this.id = id;
    this.pelicula = pelicula;
    this.ano = ano;
    this.categoria = categoria;
    this.disponible = disponible;
   }
   public Pelicula(int id,String pelicula,int ano,String categoria){
    this.id = id;
    this.pelicula = pelicula;
    this.ano = ano;
    this.categoria = categoria;
    this.disponible = true;
   }
   public void setId(int id){
    this.id = id;
   }
   public void setPelicula(String pelicula){
    this.pelicula = pelicula;
   }
   public void setAno(int ano){
    this.ano = ano;
   }
   public void setCategoria(String categoria){
    this.categoria = categoria;
   }
   public void setDisponible(boolean disponible){
       this.disponible = disponible;
   }
   public int getId(){
    return id;
   }
   public String getPelicula(){
    return pelicula;
   }
   public int getAno(){
    return ano;
   }
   public String getCategoria(){
    return categoria;
   }
   public boolean getDisponible(){
    return disponible;
   }
   public String getInformacion(){
    String resultado = "Id: "+id+" Nombre de la pelicula: " + pelicula+" categoria: "+categoria+" año: "+ano+" disponible: "+disponible;
    return resultado;
   }






}
