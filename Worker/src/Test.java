public class Test {
    public static void test(){
        Office Department = new Office("IT");
        Worker guy1 = new Worker("Петрова", Department);
        Worker guy2 = new Worker("Козлова", Department);
        Worker guy3 = new Worker("Сидорова", Department);
        Department.boss = guy2;

        System.out.println(guy1);
        System.out.println(guy2);
        System.out.println(guy3);
    }
}

