package beans;

import model.Actor;

import java.io.Serializable;

public class ActorBean implements Serializable {
    private int id;
    private String name;
    private String surname;

    public ActorBean(){}
    public ActorBean(Actor actor){
        id = actor.getId();
        name = actor.getName();
        surname = actor.getSurname();
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
