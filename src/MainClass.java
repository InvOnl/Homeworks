public class MainClass {
    public static void main(String[] args) {
        byte q = 10;
        short w = 2000;
        int e = 30000;
        long r = 40000000000L;
        float t = 32632.47376f;
        double y = 45642314.4564654;
        char u = 'd';
        boolean i = true;
        System.out.println(task3(5,6,4,10));
        if (task4(5,11)==true){
            System.out.println("True");}
        else {
            System.out.println("False");
        }
        task5(100000);
        if (task6(-25630)==true){
            System.out.println("True");}
        else {
            System.out.println("False");
        }
        task7("Дима");
        task8(1600);
    }
    public static double task3(double a, double b, double c, double d){
        double value = 0;
        value = a * (b + (c / d));
        return value;
    }

    public static boolean task4(double num1, double num2){
        double sum;
        sum = num1 + num2;
        if (sum < 10)  {
            return false;
        }
        if (sum > 20)  {
            return false;
        } else {
            return true;
        }
    }

    public  static  void task5 (long number) {
        if (number<0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }

    public static boolean task6 (long number) {
        if (number<0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void task7 (String name){
        System.out.println("Привет, "+name+"!");
    }

   public static void task8 (int year){
        if (year%4==0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }
}
