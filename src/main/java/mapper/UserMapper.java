package mapper;

import DB.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //List<User> selectAll();
    User selectByNamePwd(@Param("name") String name, @Param("password") String password);
    //User select(@Param("user_id") int user_id);
    //void update(@Param("user_id") int user_id);
    //void delete(@Param("user_id") int user_id);
}
