package beans;

import java.io.Serializable;
import java.util.List;

public class ActorListBean implements Serializable {
    public ActorListBean(){}

    private List<ActorBean> actors;

    public List<ActorBean> getActors() {
        return actors;
    }

    public void setActors(List<ActorBean> actors) {
        this.actors = actors;
    }
}
