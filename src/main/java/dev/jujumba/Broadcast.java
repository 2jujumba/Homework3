package dev.jujumba;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс трансляции, которая содержит передачи(музыка, реклама или интервью)
 */
public class Broadcast {
    private final List<Show> shows;
    private int duration;


    public Broadcast() {
        shows = new LinkedList<>();
        duration = 300;
    }

    public Broadcast(int duration) {
        this();
        this.duration = duration;
    }

    public void addShow(Show show) {
        if (show.getDuration() >= this.duration) {
            return;
        }
        /*
        Если добавляем рекламный контент и, если так сталось, что длитетельность
        рекламного контента больше половины длительности трансляции
         */
        if (show.isPaidContent() && getPaidContentDuration() >= duration / 2) {
            return;
        }
        shows.add(show);
    }

    private int getPaidContentDuration() {
        int paidContentDuration = 0;
        for (Show show : shows) {
            if (show.isPaidContent()) {
                paidContentDuration += show.getDuration();
            }
        }
        return paidContentDuration;
    }
    //Рассчёт дохода с текущей трансляции
    public int calculateProfit() {
        int profit = 0;
        for (Show show : shows) {
            if (show.isPaidContent) {
                profit += show.getEurosPerMinute() * show.getDuration();
            }
        }
        return profit;
    }

    public void printAll() {
        for (int i = 0; i < shows.size(); i++) {
            Show current = shows.get(i);
            if (i != shows.size() - 2) {
                System.out.print(current.getShowName() +" -> ");
            } else {
                System.out.print(current.getDuration());
            }
        }
        System.out.println();
    }
}
