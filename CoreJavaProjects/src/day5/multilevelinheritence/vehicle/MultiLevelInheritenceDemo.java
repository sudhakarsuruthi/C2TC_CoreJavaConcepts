package day5.multilevelinheritence.vehicle;




import java.util.Calendar;

public class MultiLevelInheritenceDemo {
    public static void main(String[] args) throws Exception {

        // Using Calendar for correct date
        Calendar cal = Calendar.getInstance();

        cal.set(2000, Calendar.DECEMBER, 2); // year, month(0-based), day
        Person p1 = new Person("Atharv", 7878767676L, cal.getTime());
        System.out.println(p1);

        cal.set(1995, Calendar.MAY, 7);
        p1 = new Employee("Pranav", 8080807070L, cal.getTime(), "Sales", 45000);
        System.out.println(p1);

        cal.set(1988, Calendar.FEBRUARY, 15);
        p1 = new LevelOneEmployee("Madhur", 9880807227L, cal.getTime(), "Account", 85000, 200,
                "Signing Authority");
        System.out.println(p1);
    }
}
