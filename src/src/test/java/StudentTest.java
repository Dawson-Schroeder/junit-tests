import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student student = new Student("John Doe", 123456, new ArrayList<Integer>(List.of()));
        assertEquals("John Doe", student.getName());
        assertEquals(123456, student.getId());
        assertEquals(new ArrayList<Integer>(), student.getGrades());
    }

    @Test
    public void testAddGrade() {
        Student student = new Student("John Doe", 123456, new ArrayList<Integer>(List.of()));
        student.addGrade(90);
        student.addGrade(85);
        assertEquals(2, student.getGrades().size());
        assertEquals(90, (int) student.getGrades().get(0));
        assertEquals(85, (int) student.getGrades().get(1));
    }

    @Test
    public void testGradeAverage() {
        Student student = new Student("John Doe", 123456, new ArrayList<Integer>(List.of()));
        student.addGrade(90);
        student.addGrade(85);
        assertEquals(87.5, student.getGradeAverage(), 0.0);
    }
}

