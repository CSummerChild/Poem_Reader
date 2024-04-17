// Poem.java
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
