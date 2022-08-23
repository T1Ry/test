package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString@Getter@Setter
@JSONType(orders={"workId","name","gender","age","telephone","warehouseId","password"})
public class Worker {
    private String workId;
    private String name;
    private String gender;
    private int age;
    private String telephone;
    private String warehouseId;
    private String password;


}
