public class Test {
    public static void test1(){
        Human guy1 = new Human("Клеопатра");
        Human guy2 = new Human("Пушкин", "Александр", "Сергеевич");
        Human guy3 = new Human("Владимир", "Маяковский");
        Hight human1 = new Hight(guy1, 152);
        Hight human2 = new Hight(guy2, 167);
        Hight human3 = new Hight(guy3, 189);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }

    public static void test2(){
        Human guy1 = new Human("Клеопатра");
        Human guy2 = new Human("Пушкин", "Александр", "Сергеевич");
        Human guy3 = new Human("Владимир", "Маяковский");

        System.out.println(guy1);
        System.out.println(guy2);
        System.out.println(guy3);
    }

    public static void test3(){
        Human guy1 = new Human("Иван", "Чудов");
        Human guy2 = new Human("Петр", "Чудов");
        Human guy3 = new Human("Борис");

        Hight human1 = new Hight(guy1, 152);
        Hight human2 = new Hight(guy2, 167, human1);
        Hight human3 = new Hight(guy3, 189, human2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
