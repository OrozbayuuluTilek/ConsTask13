import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class aclass = new Class(13,"Programm",new int[]{22,33,44,55,66});

        System.out.println(Arrays.toString(aclass.method(new int[4])));
        System.out.println(aclass.getNumber()+","+aclass.getName());

    }
}