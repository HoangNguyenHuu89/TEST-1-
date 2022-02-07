/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news;

/**
 *
 * @author admin
 */
public class News implements INews {

    private int id;
    private String tle;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News() {
    }

    public News(String tle, String publishDate, String author, String content) {
        this.tle = tle;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTle() {
        return tle;
    }

    public void setTle(String tle) {
        this.tle = tle;
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
        System.out.println("Title: " + getTle() + ",PublishDate: " + getPublishDate() + ",Author: " + getAuthor() + ",Content: " + getContent() + ",AverageRate: " + getAverageRate());
    }
    public int[] rateList = new int[3];

    public void calculate() {
        int sum = 0;
        for (int i = 0; i < rateList.length; i++) {
            sum += rateList[i];
        }
        this.averageRate = sum / 3;
    }
}
