package demomybatis.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demomybatis.domain.DemoUser;
import demomybatis.mapper.DemoUserMapper;

@RestController
@RequestMapping(path = "/api/user")
// @CrossOrigin(origins = "*")
public class DemomybatisController {

    @GetMapping(path = "/test")
    public String test() {
        return "Controller Available.\n";
    }


    @Autowired
    DemoUserMapper userMapper;

    @GetMapping
    public List<DemoUser> getAllUser() {
        return userMapper.selectAllUser();
    }

    @PostMapping(consumes = "application/json")
    public DemoUser addUser(@RequestBody DemoUser user) {
        userMapper.insertUser(user);
        return user;
    }

    @PostMapping(path = "/update", consumes = "application/json")
    public DemoUser updateUser(@RequestBody DemoUser user) {
        userMapper.updateUserById(user);
        return userMapper.selectUserById(user.getId());
    }

    @GetMapping(path = "/{id}")
    public DemoUser getUserById(@PathVariable("id") Integer id) {
        return userMapper.selectUserById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") Integer id) {
        userMapper.deleteUserById(id);
        return "User id: " + id + " deleted.\n";
    }
    
}
