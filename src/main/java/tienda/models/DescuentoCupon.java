package tienda.models;

import tienda.models.interfaces.IDescuento;

public class DescuentoCupon implements IDescuento {

    private Double descuento;

    public DescuentoCupon() {

        this.descuento = 50.0;
    }

    @Override
    public Double getDescuento() {
        
        return this.descuento;
    }
}