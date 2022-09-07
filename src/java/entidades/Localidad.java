package entidades;
// Generated 26 ago. 2022 21:12:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Localidad generated by hbm2java
 */
public class Localidad  implements java.io.Serializable {


     private Integer id;
     private Provincia provincia;
     private String nombre;
     private String cp;
     private Set<PersonaDireccion> personaDireccions = new HashSet<PersonaDireccion>(0);
     private Set<LocalCarniceria> localCarnicerias = new HashSet<LocalCarniceria>(0);
     private Set<Empleado> empleados = new HashSet<Empleado>(0);

    public Localidad() {
    }

	
    public Localidad(Provincia provincia, String nombre) {
        this.provincia = provincia;
        this.nombre = nombre;
    }
    public Localidad(Provincia provincia, String nombre, String cp, Set<PersonaDireccion> personaDireccions, Set<LocalCarniceria> localCarnicerias, Set<Empleado> empleados) {
       this.provincia = provincia;
       this.nombre = nombre;
       this.cp = cp;
       this.personaDireccions = personaDireccions;
       this.localCarnicerias = localCarnicerias;
       this.empleados = empleados;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Provincia getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public Set<PersonaDireccion> getPersonaDireccions() {
        return this.personaDireccions;
    }
    
    public void setPersonaDireccions(Set<PersonaDireccion> personaDireccions) {
        this.personaDireccions = personaDireccions;
    }
    public Set<LocalCarniceria> getLocalCarnicerias() {
        return this.localCarnicerias;
    }
    
    public void setLocalCarnicerias(Set<LocalCarniceria> localCarnicerias) {
        this.localCarnicerias = localCarnicerias;
    }
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString(){
        return nombre;  
    }  



}


