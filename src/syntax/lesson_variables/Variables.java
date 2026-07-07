package syntax.lesson_variables;

public class Variables {
    static void main() {

        byte age = 127;
        System.out.println(Integer.parseInt("00100100", 2));
        System.out.println("My age is: " + age);

        float pi_num = 3.14F;
        double double_num = 3.14;

        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.isNaN(0.0 / 0.0));

        char ch = 'a';
        char ch_n = '\n';
        System.out.println(Character.toString(ch) + ch_n + ch);

        boolean isss, aaaaa, qqqqq;
        aaaaa = qqqqq = isss = false;

        var VAR = 900_000_000L;

        int a = 10, b = 10;
        System.out.println(Integer.toString(a) + Integer.toString(b));

        int castTest = 6_000_100;
        short castShort = (short) castTest;
        System.out.println(castShort);

        var doubleTest = 3.14;
        int intCast = (int) doubleTest;
        System.out.println(intCast);
    }
}