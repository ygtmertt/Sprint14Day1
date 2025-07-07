import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;

public class Main {
    public static void main(String[] args) {

        HRManager hr = new HRManager(1, "Alice", 5000);

        JuniorDeveloper jd1 = new JuniorDeveloper(2, "Bob", 3000);
        JuniorDeveloper jd2 = new JuniorDeveloper(3, "Charlie", 3200);
        JuniorDeveloper jd3 = new JuniorDeveloper(4, "Diana", 3100);
        JuniorDeveloper jd4 = new JuniorDeveloper(5, "Eve", 3000);

        hr.addEmployee(jd1);
        hr.addEmployee(jd2);
        hr.addEmployee(jd3);
        hr.addEmployee(jd4);

        jd1.work();
        hr.work();
    }
}