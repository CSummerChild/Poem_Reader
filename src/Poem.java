/**Class: Poem
 * @author Tyler Robinson
 * @version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: April 17, 2024
 */

public class Poem {
    private String name;
    private String poet;

    public Poem() {
        name = "unknown";
        poet = "unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoet() {
        return poet;
    }

    public void setPoet(String poet) {
        this.poet = poet;
    }
}
