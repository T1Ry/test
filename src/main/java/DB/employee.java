package DB;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;



@ToString@Setter@Getter
@JSONType(employee={"emp_id","name","gender","birthday","race","registedBirthplace","birthplace","communistDate","StartTime","healthStatus","tecPosition","photo","major",
        "full_time","graduateSchoolForFulltime","part_time","graduateSchoolForParttime","highestDegree","schoolLevel","curPosition","CV","reward_punishment"})

public class employee {
    private int emp_id;
    private String name;
    private String gender;
    private Date birthday;
    private String race;
    private String registedBirthplace;
    private String birthplace;
    private Date communistDate;
    private Date StartTime;
    private String healthStatus;
    private String tecPosition;
    private byte[] photo;
    private String major;
    private String full_time;
    private String graduateSchoolForFulltime;
    private String part_time;
    private String graduateSchoolForParttime;
    private String highestDegree;
    private String schoolLevel;
    private String curPosition;
    private String CV;
    private String reward_punishment;
}
