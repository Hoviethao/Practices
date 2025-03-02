/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackages;

/**
 *
 * @author This PC
 */
import com.mycompany.practices.Student;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentTest {

    private Student student;

    // Phương thức này sẽ được chạy trước mỗi test case để khởi tạo đối tượng Student
    @BeforeMethod
    public void setUp() {
        student = new Student("S123", "John Doe", 20); // Khởi tạo đối tượng Student
    }

    // Test phương thức getName()
    @Test
    public void testGetName() {
        Assert.assertEquals(student.getName(), "John Doe", "Tên sinh viên không đúng");
    }

    // Test phương thức setAge() và getAge()
    @Test
    public void testSetAge() {
        student.setAge(21);
        Assert.assertEquals(student.getAge(), 21, "Tuổi sinh viên không đúng");
    }

    // Test phương thức updateName()
    @Test
    public void testUpdateName() {
        student.updateName("Jane Doe");
        Assert.assertEquals(student.getName(), "Jane Doe", "Tên sinh viên không được cập nhật");
    }

    // Test phương thức getStudentId()
    @Test
    public void testGetStudentId() {
        Assert.assertEquals(student.getStudentId(), "S123", "Mã sinh viên không đúng");
    }
}
