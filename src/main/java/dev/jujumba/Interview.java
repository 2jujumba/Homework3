package dev.jujumba;

/**
 * @author Jujumba
 */
public class Interview extends Show {
    private final LeadingMan leadingMan;

    public Interview(LeadingMan leadingMan) {
        setPaidContent(true);
        setDuration(10);
        setEurosPerMinute(30);
        setShowName("Интервью от " + leadingMan.getName());
        this.leadingMan = leadingMan;
    }

    @Override
    public void runShow() {
        super.runShow();
        leadingMan.addShow(this);
    }
}
