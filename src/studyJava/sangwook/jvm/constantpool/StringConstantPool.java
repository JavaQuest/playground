package studyJava.sangwook.jvm.constantpool;

public class StringConstantPool {
    public static void main(String[] args) {
        String str1 = "Hello!";
        String str2 = "Hello!";
        System.out.println(str1 == str2);

        String str2_2 = new String("Hello!");
        System.out.println(str2 == str2_2);

        String str3 = new String("Hello2");
        String str4 = new String("Hello2");
        System.out.println(str3 == str4);

        String str5 = "Hello!!!!".intern();
        String str6 = new String("Hello!!!!").intern();
        System.out.println(str5 == str6);

    }
}
