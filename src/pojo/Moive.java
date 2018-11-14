package pojo;

public class Moive {
   private int id;
   private String title;
   private String stars;
   private String url;
   private String imgUrl;
   private int score;
   private String releasetime;

    @Override
    public String toString() {
        return "Moive{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", stars='" + stars + '\'' +
                ", url='" + url + '\'' +
                ", releasetime='" + releasetime + '\'' +
                '}';
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }
}
