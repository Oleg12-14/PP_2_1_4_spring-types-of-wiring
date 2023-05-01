package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    private Duck5 dusk;

    @Autowired
    public Rabbit4(Duck5 dusk){
        this.dusk = dusk;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + dusk.toString();
    }
}
