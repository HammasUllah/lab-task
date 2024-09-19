public class Artist {
    private String name;
    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Artist: " + name);
    }
}
