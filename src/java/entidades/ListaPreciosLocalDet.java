package entidades;
// Generated 19 sep. 2022 19:32:22 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ListaPreciosLocalDet generated by hbm2java
 */
public class ListaPreciosLocalDet  implements java.io.Serializable {


     private Integer id;
     private ListaPreciosLocal listaPreciosLocal;
     private Producto producto;
     private BigDecimal precio;

    public ListaPreciosLocalDet() {
    }

    public ListaPreciosLocalDet(ListaPreciosLocal listaPreciosLocal, Producto producto, BigDecimal precio) {
       this.listaPreciosLocal = listaPreciosLocal;
       this.producto = producto;
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
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }




}


