package demomybatis.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemomybatisControllerTest {

    @Autowired
    private TestRestTemplate rest;

    @Test
    void testTest() {
        String message = rest.getForObject("/api/user/test", String.class);
        Assertions.assertNotNull(message);
        Assertions.assertEquals(message, "Controller Available.\n");
    }
}
