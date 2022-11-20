package dev.jujumba;

/**
 * @author Jujumba
 */
public class Music extends Show {
    private final String songName;
    private final String authorName;

    public Music(String songName, String authorName) {
        setPaidContent(false);
        setDuration(3);
        setShowName("\uD83C\uDFB5: " + songName); //Это знак ноты:)
        this.songName = songName;
        this.authorName = authorName;
    }
}
