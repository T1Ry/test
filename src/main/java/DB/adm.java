package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@ToString@Setter@Getter
@JSONType(orders={"adm_id"})

public class adm {
    private int adm_id;
}
