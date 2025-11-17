package data;

public class Film {
    String title;
    int year;

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int age) {
        this.year = age;
    }
}
