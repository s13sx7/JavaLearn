package syntax.lesson_string;

public class Main {
    static void main() {
        String strName = "Andrey";
        String strLastName = new String("Sudarev");
        System.out.println(strName + " " + strLastName);

        String strJava1 = "Java";
        String strJava2 = "java";

        System.out.println(strJava1.equals(strJava2));
        System.out.println(strJava1.equalsIgnoreCase(strJava2));

        String str = "Hello, World!";
        System.out.println(str.substring(str.indexOf('W'), str.lastIndexOf('l')));
        System.out.println("String contains \"world\": " + str.toLowerCase().contains("world"));
        System.out.println("String contains \"World\": " + str.contains("World"));

        str.toLowerCase();
        System.out.println(str);
        str.toUpperCase();
        System.out.println(str);
        System.out.println(str.toUpperCase().contains("W"));

        System.out.println(str.substring(str.indexOf("llo")));

        var login = "    ANDREY!!!@@@   ";
        System.out.println(login.strip());
        System.out.println(login.replace('!','+').strip());

        StringBuilder sb = new StringBuilder("Andrey ");
        sb.append("Sudarev");
        System.out.println(sb);

        var check = "immutable";
        System.out.println(check);
        check = check.toUpperCase();
        System.out.println(check);
        check = check.substring(check.toLowerCase().indexOf("table"));
        System.out.println(check);
    }
}
