package co.unicauca.lab.domain.prototype;

public class Session {

    private String name;
    private String description;

    public Session(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Session() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Session makeClone() throws InstantiationException, IllegalAccessException {
        Session session = null;
        session = this.getClass().newInstance();
        session.setName(this.getName());
        session.setDescription(this.getDescription());
        return session;
    }

    @Override
    public String toString() {
        String sesion;
        sesion = "Name Session:"+this.getName()+"\nDescription Session:"+this.getDescription();
        return sesion;
    }
}
