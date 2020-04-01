package ibu.edu.ba.simplenewsapplab;

public class News {
    private int imageId;
    private String title;
    private String shortDescription;

    public News() {
    }

    public News(int imageId, String title, String shortDescription) {
        this.imageId = imageId;
        this.title = title;
        this.shortDescription = shortDescription;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
