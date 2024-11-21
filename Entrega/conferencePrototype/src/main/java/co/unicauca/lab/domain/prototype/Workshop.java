package co.unicauca.lab.domain.prototype;

import java.util.ArrayList;

public class Workshop extends ConferencePrototype{
    public Workshop() {
        name="Default Workshop";
        mySession =new ArrayList<>();
        mySession.add(new Session("A","Session A"));
        mySession.add(new Session("B","Session B"));
    }
}
