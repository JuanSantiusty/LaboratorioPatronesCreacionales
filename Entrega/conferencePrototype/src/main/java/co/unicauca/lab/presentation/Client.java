package co.unicauca.lab.presentation;

import co.unicauca.lab.domain.prototype.Session;
import co.unicauca.lab.domain.prototype.ConferencePrototype;
import co.unicauca.lab.domain.prototype.Workshop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ConferencePrototype defaultConference= new Workshop();
        ConferencePrototype quality =  defaultConference.makeClone();
        quality.setName("Third Worlshop Prototipe");
        quality.getMySession().add(new Session("C","Session C"));
        System.out.println(defaultConference);
        System.out.println(quality);
    }
}