package tienda.models;

public class LineaGamaBaja extends LineaProducto {

    @Override
    public String getLinea() {

        return "Gama Baja";
    }

    @Override
    public String CaracteristicaCamara() {

        return "Camara estandar";
    }

    @Override
    public String CaracteristicaBateria() {

        return "Bateria standar ";
    }

}