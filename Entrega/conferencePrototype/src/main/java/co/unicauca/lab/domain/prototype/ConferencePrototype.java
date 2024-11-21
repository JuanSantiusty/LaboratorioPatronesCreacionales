package co.unicauca.lab.domain.prototype;

import java.util.ArrayList;
import java.util.List;

public class ConferencePrototype {

    protected String name;
    protected List<Session> mySession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Session> getMySession() {
        return mySession;
    }

    public void setMySession(List<Session> mySession) {
        this.mySession = mySession;
    }

    public ConferencePrototype makeClone() throws InstantiationException, IllegalAccessException {
        ConferencePrototype clone = (ConferencePrototype) this.getClass().newInstance();
        clone.setName(this.getName());
        clone.setMySession(this.getMySession());
        return clone;
    }

    public ConferencePrototype makeDeepClone() throws InstantiationException, IllegalAccessException {
        ConferencePrototype clone = (ConferencePrototype) this.getClass().newInstance();
        clone.setName(this.getName());
        clone.setMySession(new ArrayList<>());
        for(Session session : this.getMySession()) {
            clone.getMySession().add(session.makeClone());
        }
        return clone;
    }

    @Override
    public String toString() {
       String confe="Name conference:"+this.name+"\n";
        for(Session session : this.getMySession()) {
            confe+=session.toString()+"\n";
        }
        return confe;
    }
}
