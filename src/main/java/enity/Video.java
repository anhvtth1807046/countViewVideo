package enity;

public class Video {
    private String id;
    private String title;
    private String day;
    private int countView;

    public Video() {
    }

    public Video(String id, String title, String day, int countView) {
        this.id = id;
        this.title = title;
        this.day = day;
        this.countView = countView;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", day='" + day + '\'' +
                ", countView=" + countView +
                '}';
    }
}
