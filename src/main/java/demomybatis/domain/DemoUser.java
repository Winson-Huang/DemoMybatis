package demomybatis.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DemoUser {

    private Integer id;

    private String username;

    private String password;

    private String emailaddress;
}
