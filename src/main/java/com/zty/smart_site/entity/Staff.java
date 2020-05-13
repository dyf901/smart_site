package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
STAFF    		员工信息表
id            			员工id
staff_name      		员工姓名
staff_age				年龄
staff_img				照片
staff_sex				性别
staff_nation			民族
staff_card				身份证号
staff_address			身份证地址
staff_province			所在省
staff_phone				手机号
sos_name				紧急联系人姓名
sos_ship				紧急联系人关系
sos_phone				紧急联系人电话
entry_time				入职时间
history_integral		历史积分
end_integral			剩余积分
section_id				标段id
station_id              站点id
sub_id			        部门id
worktype_id     		工种id
password				账号密码(手机端登录密码和考核系统登录密码)
picture					手机端头像
state					在职状态('0' 离职  '1'在职)
status					实名认证状态('0' 未认证  '1' 已认证)
type 				    员工类型
train					培训状态('0' 未培训  '1'培训)
position_id             菜单id

section_name            标段名称
station_name            站点名称
sub_name                分包单位名称
worktype_name           工种名称
age_duan                年龄段
*/
//@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "staff" , description = "劳务人员对象")
public class Staff {
    @ApiModelProperty(value = "劳务人员id" , name = "id")
    private int id;

    @ApiModelProperty(value = "年龄" , name = "staff_age")
    private int staff_age;

    @ApiModelProperty(value = "历史积分" , name = "history_integral")
    private int history_integral;

    @ApiModelProperty(value = "剩余积分" , name = "end_integral")
    private int end_integral;

    @ApiModelProperty(value = "标段id" , name = "section_id")
    private int section_id;

    @ApiModelProperty(value = "分包单位id" , name = "sub_id")
    private int sub_id;

    @ApiModelProperty(value = "工种id" , name = "worktype_id")
    private int worktype_id;

    @ApiModelProperty(value = "站点id" , name = "station_id")
    private int station_id;

    @ApiModelProperty(value = "统计人数" , name = "count")
    private int count;

    @ApiModelProperty(value = "菜单id" , name = "position_id")
    private int position_id;

    @ApiModelProperty(value = "姓名" , name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "照片" , name = "staff_img")
    private String staff_img;

    @ApiModelProperty(value = "性别" , name = "staff_sex")
    private String staff_sex;

    @ApiModelProperty(value = "民族" , name = "staff_nation")
    private String staff_nation;

    @ApiModelProperty(value = "身份证号" , name = "staff_card")
    private String staff_card;

    @ApiModelProperty(value = "身份证地址" , name = "staff_address")
    private String staff_address;

    @ApiModelProperty(value = "省份" , name = "staff_province")
    private String staff_province;

    @ApiModelProperty(value = "手机号" , name = "staff_phone")
    private String staff_phone;

    @ApiModelProperty(value = "紧急联系人姓名" , name = "sos_name")
    private String sos_name;

    @ApiModelProperty(value = "紧急联系人关系" , name = "sos_ship")
    private String sos_ship;

    @ApiModelProperty(value = "紧急联系人号码" , name = "sos_phone")
    private String sos_phone;

    @ApiModelProperty(value = "入职时间" , name = "entry_time")
    private String entry_time;

    @ApiModelProperty(value = "密码" , name = "password")
    private String password;

    @ApiModelProperty(value = "头像" , name = "picture")
    private String picture;

    @ApiModelProperty(value = "在职状态('0' 离职  '1'在职)" , name = "state")
    private String state;

    @ApiModelProperty(value = "实名认证状态('0' 未认证  '1' 已认证)" , name = "status")
    private String status;

    @ApiModelProperty(value = "员工类型" , name = "type")
    private String type;

    @ApiModelProperty(value = "培训状态('0' 未培训  '1'培训)" , name = "train")
    private String train;

    @ApiModelProperty(value = "标段名称" , name = "section_name")
    private String section_name;

    @ApiModelProperty(value = "站点名称" , name = "station_name")
    private String station_name;

    @ApiModelProperty(value = "分包单位名称" , name = "sub_name")
    private String sub_name;

    @ApiModelProperty(value = "工种名称" , name = "worktype_name")
    private String worktype_name;

    @ApiModelProperty(value = "人员年龄段" , name = "age_duan")
    private String age_duan;

    @ApiModelProperty(value = "部门id" , name = "department_id")
    private int department_id;

    @ApiModelProperty(value = "部门名称" , name = "department_name")
    private String department_name;

    @ApiModelProperty(value = "昵称" , name = "nikename")
    private String nikename;

    @ApiModelProperty(value = "员工二维码" , name = "staff_code")
    private String staff_code;

    public Staff() {
        super();
    }

    public Staff(int id, int staff_age, int history_integral, int end_integral, int section_id, int sub_id, int worktype_id, int station_id, int count, int position_id, String staff_name, String staff_img, String staff_sex, String staff_nation, String staff_card, String staff_address, String staff_province, String staff_phone, String sos_name, String sos_ship, String sos_phone, String entry_time, String password, String picture, String state, String status, String type, String train, String section_name, String station_name, String sub_name, String worktype_name, String age_duan, int department_id, String department_name, String nikename, String staff_code) {
        this.id = id;
        this.staff_age = staff_age;
        this.history_integral = history_integral;
        this.end_integral = end_integral;
        this.section_id = section_id;
        this.sub_id = sub_id;
        this.worktype_id = worktype_id;
        this.station_id = station_id;
        this.count = count;
        this.position_id = position_id;
        this.staff_name = staff_name;
        this.staff_img = staff_img;
        this.staff_sex = staff_sex;
        this.staff_nation = staff_nation;
        this.staff_card = staff_card;
        this.staff_address = staff_address;
        this.staff_province = staff_province;
        this.staff_phone = staff_phone;
        this.sos_name = sos_name;
        this.sos_ship = sos_ship;
        this.sos_phone = sos_phone;
        this.entry_time = entry_time;
        this.password = password;
        this.picture = picture;
        this.state = state;
        this.status = status;
        this.type = type;
        this.train = train;
        this.section_name = section_name;
        this.station_name = station_name;
        this.sub_name = sub_name;
        this.worktype_name = worktype_name;
        this.age_duan = age_duan;
        this.department_id = department_id;
        this.department_name = department_name;
        this.nikename = nikename;
        this.staff_code = staff_code;
    }

    public Staff(int worktype_id, int count, String worktype_name) {
        this.worktype_id = worktype_id;
        this.count = count;
        this.worktype_name = worktype_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    public int getHistory_integral() {
        return history_integral;
    }

    public void setHistory_integral(int history_integral) {
        this.history_integral = history_integral;
    }

    public int getEnd_integral() {
        return end_integral;
    }

    public void setEnd_integral(int end_integral) {
        this.end_integral = end_integral;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public int getWorktype_id() {
        return worktype_id;
    }

    public void setWorktype_id(int worktype_id) {
        this.worktype_id = worktype_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_img() {
        return staff_img;
    }

    public void setStaff_img(String staff_img) {
        this.staff_img = staff_img;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public String getStaff_nation() {
        return staff_nation;
    }

    public void setStaff_nation(String staff_nation) {
        this.staff_nation = staff_nation;
    }

    public String getStaff_card() {
        return staff_card;
    }

    public void setStaff_card(String staff_card) {
        this.staff_card = staff_card;
    }

    public String getStaff_address() {
        return staff_address;
    }

    public void setStaff_address(String staff_address) {
        this.staff_address = staff_address;
    }

    public String getStaff_province() {
        return staff_province;
    }

    public void setStaff_province(String staff_province) {
        this.staff_province = staff_province;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    public void setStaff_phone(String staff_phone) {
        this.staff_phone = staff_phone;
    }

    public String getSos_name() {
        return sos_name;
    }

    public void setSos_name(String sos_name) {
        this.sos_name = sos_name;
    }

    public String getSos_ship() {
        return sos_ship;
    }

    public void setSos_ship(String sos_ship) {
        this.sos_ship = sos_ship;
    }

    public String getSos_phone() {
        return sos_phone;
    }

    public void setSos_phone(String sos_phone) {
        this.sos_phone = sos_phone;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public String getWorktype_name() {
        return worktype_name;
    }

    public void setWorktype_name(String worktype_name) {
        this.worktype_name = worktype_name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAge_duan() {
        return age_duan;
    }

    public void setAge_duan(String age_duan) {
        this.age_duan = age_duan;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    public String getStaff_code() {
        return staff_code;
    }

    public void setStaff_code(String staff_code) {
        this.staff_code = staff_code;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", staff_age=" + staff_age +
                ", history_integral=" + history_integral +
                ", end_integral=" + end_integral +
                ", section_id=" + section_id +
                ", sub_id=" + sub_id +
                ", worktype_id=" + worktype_id +
                ", station_id=" + station_id +
                ", count=" + count +
                ", position_id=" + position_id +
                ", staff_name='" + staff_name + '\'' +
                ", staff_img='" + staff_img + '\'' +
                ", staff_sex='" + staff_sex + '\'' +
                ", staff_nation='" + staff_nation + '\'' +
                ", staff_card='" + staff_card + '\'' +
                ", staff_address='" + staff_address + '\'' +
                ", staff_province='" + staff_province + '\'' +
                ", staff_phone='" + staff_phone + '\'' +
                ", sos_name='" + sos_name + '\'' +
                ", sos_ship='" + sos_ship + '\'' +
                ", sos_phone='" + sos_phone + '\'' +
                ", entry_time='" + entry_time + '\'' +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                ", state='" + state + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", train='" + train + '\'' +
                ", section_name='" + section_name + '\'' +
                ", station_name='" + station_name + '\'' +
                ", sub_name='" + sub_name + '\'' +
                ", worktype_name='" + worktype_name + '\'' +
                ", age_duan='" + age_duan + '\'' +
                ", department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", nikename='" + nikename + '\'' +
                ", staff_code='" + staff_code + '\'' +
                '}';
    }
}
