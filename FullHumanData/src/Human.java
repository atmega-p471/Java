public class Human {
    public String last_name;
    public String first_name;
    public String patronymic;


    public Human(String last_name, String first_name, String patronymic) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;
    }

    public Human(String last_name, String first_name) {
        this.last_name = last_name;
        this.first_name = first_name;
        if (patronymic == null){
            patronymic = " ";
        }
    }

    public Human(String first_name) {
        this.first_name = first_name;
        if (last_name == null){
            last_name = " ";
        }
        if (patronymic == null){
            patronymic = " ";
        }
    }

    public String toString() {
        String res = String.format("%s %s %s", last_name, first_name, patronymic);
        return res;
    }
}

