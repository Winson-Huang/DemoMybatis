package demomybatis.mapper;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import demomybatis.domain.DemoUser;

@SpringBootTest
public class DemoUserMapperTest {

    @Autowired
    private DemoUserMapper demoUserMapper;

    @Test
    public void testGetById() {

        Integer id = 1;
        DemoUser user = demoUserMapper.selectUserById(id);
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getUsername(), "Bob");
    }
}
