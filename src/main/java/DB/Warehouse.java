package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString@Setter@Getter
@JSONType(orders={"warehouseId","name","wVolume","wLeftVolume","managerId","company","wShelfNum"})
public class Warehouse {
    private String warehouseId;
    private String name;
    private String wVolume;
    private String wLeftVolume;
    private String managerId;
    private String company;
    private String wShelfNum;
}
