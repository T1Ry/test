package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

enum Dept{
    tec,man;
}

@ToString@Setter@Getter
@JSONType(user={"user_id","name","password","authority","department","phone_num"})


public class user {
    private int user_id;
    private String name;
    private String password;
    private int authority;
    private Dept department;
    private int phone_num;

}
