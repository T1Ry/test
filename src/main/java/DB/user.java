package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString@Setter@Getter
@JSONType(user={"user_id","name","intime","type","state","outtime","warehouseId","position"})

public class user {

}
