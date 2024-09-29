public class Human {
    public String name;
    public int hight;

    public Human(String name, int hight){
        this.name = name;
        this.hight = hight;
    }

    public String toString(){
        return name + ", рост " + hight;
    }
}
