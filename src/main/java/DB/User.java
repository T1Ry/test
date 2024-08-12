package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString@Setter@Getter
@JSONType(orders={"user_id","name","password","authority","department_id","phone_num"})


public class User {
    private int user_id;
    private String name;
    private String password;
    private int authority;
    private int department_id;
    private int phone_num;

}
