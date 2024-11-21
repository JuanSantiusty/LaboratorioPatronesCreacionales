package co.unicauca.lab.presentation;

import co.unicauca.lab.domain.abstracfactory.entidades.InterfazConferencia;
import co.unicauca.lab.domain.abstracfactory.entidades.Participante;
import co.unicauca.lab.domain.abstracfactory.entidades.Sesion;
import co.unicauca.lab.domain.abstracfactory.fabrica.FabricaAbstracta;
import co.unicauca.lab.domain.abstracfactory.fabrica.FabricaWorkshop;

public class ClientFactory {

    /**
     * @brief Crear algún tipo de conferencia usando las fábricas encargadas de la creación de ese tipo
     * de conferencias
     * */
    public static void main(String[] args) {
        FabricaAbstracta fabrica=new FabricaWorkshop();
        InterfazConferencia conferencia= fabrica.crearConferencia();
        System.out.println("Titulo: "+conferencia.getTitulo());
        System.out.println("Sesiones");
        for(Sesion s: conferencia.getSecions()){
            System.out.println("Nombre: "+s.getNombre());
            System.out.println("Tipo:"+s.getTipoSecion());
        }
        System.out.println("Participantes");
        for(Participante p: conferencia.getParticipantes()){
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Tipo: "+p.getTipo());
        }
    }
}
