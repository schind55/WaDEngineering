package edu.de.uni.passau.webeng.students;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class StudentServicesApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

	@Test
	public void getStudentTest() {
        assertEquals("{\"matrNr\":34622,\"firstName\":\"Hans\",\"lastName\":\"Muster\"}",
                restTemplate.getForObject("/students/34622/", String.class));
	}

    @Test
    public void getStudentTest2() {
        assertEquals("{\"matrNr\":34622,\"firstName\":\"Hans\",\"lastName\":\"Muster\"}",
                restTemplate.getForObject("/students/34622/", String.class));
    }

	// Anfragen mit curl testen
    // curl -w "\n" localhost:8080/students/34622/

    // curl -X POST -w "\n" localhost:8080/students/34622/courses/
}
