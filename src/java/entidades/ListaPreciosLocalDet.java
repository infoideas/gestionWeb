package entidades;
// Generated 26 ago. 2022 21:12:34 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ListaPreciosLocalDet generated by hbm2java
 */
public class ListaPreciosLocalDet  implements java.io.Serializable {


     private Integer id;
     private ListaPreciosLocal listaPreciosLocal;
     private int idProducto;
     private BigDecimal precio;

    public ListaPreciosLocalDet() {
    }

    public ListaPreciosLocalDet(ListaPreciosLocal listaPreciosLocal, int idProducto, BigDecimal precio) {
       this.listaPreciosLocal = listaPreciosLocal;
       this.idProducto = idProducto;
       this.precio = precio;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public ListaPreciosLocal getListaPreciosLocal() {
        return this.listaPreciosLocal;
    }
    
    public void setListaPreciosLocal(ListaPreciosLocal listaPreciosLocal) {
        this.listaPreciosLocal = listaPreciosLocal;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }




}

