import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {

    private List<Student> students;

    public StudentDataUtil() {
        loadSampleData();
    }

    public void loadSampleData() {
        students = new ArrayList<>();

        students.add(new Student("Mary", "Public", "mary@luv2code.com"));
        students.add(new Student("John", "Doe", "john@luv2code.com"));
        students.add(new Student("Ajay", "Rao", "ajay@luv2code.com"));
    }

    public List<Student> getStudents() {
        return students;
    }
}
