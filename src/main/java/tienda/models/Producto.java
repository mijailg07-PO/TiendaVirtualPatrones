package tienda.models;

import tienda.models.interfaces.IFamilia;

public class Producto {
    private String id;
    private String codigo;
    private String descripcion;
    private Double precioBase;
    private String lineaProducto;
    private String mantenimiento;
    private String camara;
    private String bateria;
    private IFamilia familia;

    public Producto(String codigo, String descripcion, Double precioBase, String linea, String mantenimiento,
            String camara, String bateria) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.lineaProducto = linea;
        this.mantenimiento = mantenimiento;
        this.camara = camara;
        this.bateria = bateria;
    }

    public IFamilia getFamilia() {
        return familia;
    }

    public void setFamilia(IFamilia familia) {
        this.familia = familia;
    }

    public Producto(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
        System.out.println("Estableciendo precio base en: " + this.precioBase);
    }

    public String getLineaProducto() {
        return lineaProducto;
    }

    public void setLineaProducto(String lineaProducto) {
        this.lineaProducto = lineaProducto;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

}