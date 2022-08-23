package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString@Setter@Getter
@JSONType(orders={"goodId","name","intime","type","state","outtime","warehouseId","position"})
public class Good {
//    public String getGoodId() {
//        return goodId;
//    }
//
//    public void setGoodId(String goodId) {
//        this.goodId = goodId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getIntime() {
//        return intime;
//    }
//
//    public void setIntime(String intime) {
//        this.intime = intime;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getOuttime() {
//        return outtime;
//    }
//
//    public void setOuttime(String outtime) {
//        this.outtime = outtime;
//    }
//
//    public String getWarehouseId() {
//        return warehouseId;
//    }
//
//    public void setWarehouseId(String warehouseId) {
//        this.warehouseId = warehouseId;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }

    private String goodId;
    private String name;
    private String intime;
    private String type;
    private String state;
    private String outtime;
    private String warehouseId;
    private String position;
}
