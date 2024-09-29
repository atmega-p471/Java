public class Office {
    public String title;
    public Worker boss;

    public Office(String title, Worker boss) {
        this.title = title;
        this.boss = boss;
    }

    public Office(String title) {
        this.title = title;
    }
}
