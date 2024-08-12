package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString@Setter@Getter
@JSONType(orders={"department_id","name","level"})

public class Department {
    private int department_id;
    private String name;
    private String level;
}
