package dev.jujumba;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Ведущий и интервьюер
 */
@Data
public class LeadingMan {
    private final String name;
    private final List<Show> heldShows; //список проведённых шоу
    private int workExperience;
    public LeadingMan(String name) {
        this.name = name;
        heldShows = new ArrayList<>();
        workExperience = 0;
    }

    public LeadingMan(String name, int workExperience) {
        this(name);
        this.workExperience = workExperience;
    }

    public void addShow(Show show) {
        heldShows.add(show);
    }
}
