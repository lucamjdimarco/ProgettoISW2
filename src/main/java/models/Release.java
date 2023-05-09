package models;

public class Release {

    private int id;
    private final String name;
    private final String releaseDate;

    public Release(int id, String name, String releaseDate) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }


}
