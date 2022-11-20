package dev.jujumba;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Jujumba
 */
@Setter
@Getter
public abstract class Show {
    protected boolean isPaidContent;
    protected int duration;
    protected String showName;
    protected int eurosPerMinute = isPaidContent ? 1 : 0;
    public void runShow() {
        System.out.println(showName);
    }

    @Override
    public String toString() {
        return showName;
    }
}
