package entity;

public class Game {
    private String name;
    private String describe;
    private int price;
    private String createdate;
    private String home;

    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                ", createdate='" + createdate + '\'' +
                ", home='" + home + '\'' +
                '}';
    }

    public Game(String name, String describe, int price, String createdate, String home) {
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.createdate = createdate;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
