package demomybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import demomybatis.domain.DemoUser;

@Mapper
public interface DemoUserMapper {

    @Results({
        @Result(property = "username", column = "name"),
        @Result(property = "emailaddress", column = "email"),
    })
    @Select("SELECT * FROM demo_user")
    List<DemoUser> selectAllUser();

    @Results({
        @Result(property = "username", column = "name"),
        @Result(property = "emailaddress", column = "email"),
    })
    @Select("SELECT * FROM demo_user WHERE id = #{id}")
    DemoUser selectUserById(Integer id);

    @Insert("INSERT INTO demo_user (name, password, email) " + 
    "values(#{username}, #{password}, #{emailaddress})")
    void insertUser(DemoUser user);

    @Update("UPDATE demo_user SET " + 
    "name = #{username}, password = #{password}, email = #{emailaddress} " + 
    "WHERE id = #{id}")
    void updateUserById(DemoUser user);

    @Delete("DELETE from demo_user WHERE id = #{id}")
    void deleteUserById(Integer id); 
}
