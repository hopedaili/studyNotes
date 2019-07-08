package base;

public class EnumTest {
    public static void main(String[] args) {

        Week w = Week.FRIDAY;
        System.out.println("name() = "+w.name());
        System.out.println("name = "+w.getName());
        System.out.println("ordinal = "+w.ordinal());
        System.out.println("value = "+w.getValue());
        System.out.println("isWorkDay = "+w.getIsWorkDay());


    }
}
