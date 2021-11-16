package tienda.models;

public class LineaGamaAlta extends LineaProducto {
    Producto camara;

    @Override
    public String getLinea() {

        return "Gama Alta";
    }

    @Override
    public String CaracteristicaCamara() {

        return "Camara de alta resolucion ";

    }

    @Override
    public String CaracteristicaBateria() {

        return "Bateria duracion alta, carga rapida";
    }
}