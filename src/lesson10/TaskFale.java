package lesson10;

public class TaskFale {
    public static void main(String[] args) {
        int [] array = new int[20];
        for (int i = 0; i < array.length ; i++) {
            System.out.println(Math.round(Math.random()*10)-10);
        }
//        Random ran = new Random();
//        for(int i = 0;i<5;i++){
//            int val = ran.nextInt(201) - 100;
//            System.out.println(val);
//        }
    }
}
