package dev.jujumba;

import lombok.Data;

/**
 * @author Jujumba
 */
@Data
public class Add extends Show {
    private final String productName;

    public Add(String productName) {
        setPaidContent(true);
        setDuration(1);
        setEurosPerMinute(30);
        setShowName("Реклама " + productName);
        this.productName = productName;
    }
}
