package entidades;
// Generated 26 ago. 2022 21:12:34 by Hibernate Tools 4.3.1



/**
 * CausaDevolucion generated by hbm2java
 */
public class CausaDevolucion  implements java.io.Serializable {


     private Integer id;
     private String nombre;

    public CausaDevolucion() {
    }

    public CausaDevolucion(String nombre) {
       this.nombre = nombre;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}

