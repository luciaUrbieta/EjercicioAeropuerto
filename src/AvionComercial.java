public class AvionComercial extends Avion{

    private int cantidadAzafatas;
    private String listaServicios;

    public AvionComercial(){
    }

    public AvionComercial(String nombreModelo, String marca, double capacidadCombustible, TipoMotor tipoMotor, int cantidadAsientos, int cantidadAzafatas, String listaServicios){
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadAzafatas=cantidadAzafatas;
        this.listaServicios=listaServicios;
    }

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }

    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }

    public String getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(String listaServicios) {
        this.listaServicios = listaServicios;
    }


}
