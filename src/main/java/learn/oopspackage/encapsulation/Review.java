package learn.oopspackage.encapsulation;

public class Review {
    private int id;
    private String comments;
    private float rating;

    public Review(int id, String comments, float rating) {
        this.id = id;
        this.comments = comments;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getComments() {
        return comments;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", comments='" + comments + '\'' +
                ", rating=" + rating +
                '}';
    }
}
