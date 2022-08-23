package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString@Setter@Getter
@JSONType(orders={"managerId","name","telephone","age","gender","username","password"})
public class Manager {

    private String managerId;
    private String name;
    private String telephone;
    private int age;
    private String gender;
    private String username;
    private String password;

}
