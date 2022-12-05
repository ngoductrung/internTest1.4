import java.util.ArrayList;

public class News implements INews {
    private int Id;
    private String title;
    private String publishDate;
    private String author;
    private String content;

    public ArrayList<Integer> rateList = new ArrayList<Integer>();
    private float averageRate;

    public void caculate(){
        float sum = 0;
        for(int i = 0; i< rateList.size(); i++)
            sum = sum + rateList.get(i);
        averageRate = sum/rateList.size();
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("title: "+ title +
                "\npublishDate: "+ publishDate +
                "\nauthor: " + author +
                "\ncontent: " + content +
                "\naverageRate: " + averageRate);
    }

}
