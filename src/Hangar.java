import java.util.ArrayList;
import java.util.List;

public class Hangar<T extends Avion> {

    private List<T> aviones;

    public Hangar(){
        aviones=new ArrayList<>();
    }

    //manejar excepciones despues

    public void agregarAvion(T avion){
        aviones.add(avion);
    }

    public void eliminarAvion(T avion){
        aviones.remove(avion);
    }

    public String mostrarAvion(T avion){
        String retorno="El avion no fue encontrado.";
        for(T avionActual : aviones){
            if(avionActual.equals(avion)){
                retorno=avionActual.toString();
            }
        }
        return retorno;
    }

}
