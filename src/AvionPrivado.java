public class AvionPrivado extends Avion{

    private boolean jaccuzzi;
    private String claveWifi;

    public AvionPrivado(){
    }

    public AvionPrivado(String nombreModelo, String marca, double capacidadCombustible, TipoMotor tipoMotor, int cantidadAsientos, boolean jaccuzzi, String claveWifi){
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.jaccuzzi=jaccuzzi;
        this.claveWifi=claveWifi;
    }

    public boolean isJaccuzzi() {
        return jaccuzzi;
    }

    public void setJaccuzzi(boolean jaccuzzi) {
        this.jaccuzzi = jaccuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }
}
