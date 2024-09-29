public class Hight {
    public Human name;
    public int height;
    public Hight father;

    public Hight(Human name, int height) {
        this.name = name;
        this.height = height;
    }

    public Hight(Human name, int height, Hight father) {
        this.name = name;
        this.height = height;
        this.father = father;

        if (name.last_name.isEmpty() && father != null && !father.name.last_name.isEmpty()){
            name.last_name = father.name.last_name;
        }

        if (name.patronymic.isEmpty() && father != null){
            name.patronymic = father.name.first_name + "ович";
        }
    }

    public String toString() {
        return String.format("Человек с именем "+"%s и ростом %d", name, height);
    }
}
