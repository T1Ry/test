package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@ToString@Setter@Getter
@JSONType(department={"department_id","name","level"})

public class department {
    private int department_id;
    private String name;
    private String level;
}
