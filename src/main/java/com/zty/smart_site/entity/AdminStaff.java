package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
标段管理人员实体类
admin_staff       标段管理人员表
id            			管理员工id
admin_name      		员工姓名
admin_age				年龄
admin_img				照片
admin_sex				性别
admin_nation			民族
admin_address			身份证地址
admin_province			所在省
admin_card				身份证号
admin_phone				手机号
sos_name				紧急联系人姓名
sos_ship				紧急联系人关系
sos_phone				紧急联系人电话
entry_time				入职时间
section_id				标段id
department_id			部门id
password				账号密码
picture					手机端头像
state					在职状态('0' 离职  '1'在职)
status					实名认证状态('0' 未认证  '1' 已认证)
type 					员工类型
position_id             菜单id

section_name            标段名称
department_name         部门名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminStaff {
    private int id,admin_age,section_id,department_id,position_id;
    private String admin_name,admin_img,admin_sex,admin_nation,admin_address,admin_province,admin_card,admin_phone,sos_name,sos_ship,sos_phone,entry_time,password,picture,state,status,type;
    private String section_name,department_name;
    
    public AdminStaff(){
        super();
    }

    public AdminStaff(int id, int admin_age, int section_id, int department_id, int position_id, String admin_name, String admin_img, String admin_sex, String admin_nation, String admin_address, String admin_province, String admin_card, String admin_phone, String sos_name, String sos_ship, String sos_phone, String entry_time, String password, String picture, String state, String status, String type, String section_name, String department_name) {
        this.id = id;
        this.admin_age = admin_age;
        this.section_id = section_id;
        this.department_id = department_id;
        this.position_id = position_id;
        this.admin_name = admin_name;
        this.admin_img = admin_img;
        this.admin_sex = admin_sex;
        this.admin_nation = admin_nation;
        this.admin_address = admin_address;
        this.admin_province = admin_province;
        this.admin_card = admin_card;
        this.admin_phone = admin_phone;
        this.sos_name = sos_name;
        this.sos_ship = sos_ship;
        this.sos_phone = sos_phone;
        this.entry_time = entry_time;
        this.password = password;
        this.picture = picture;
        this.state = state;
        this.status = status;
        this.type = type;
        this.section_name = section_name;
        this.department_name = department_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdmin_age() {
        return admin_age;
    }

    public void setAdmin_age(int admin_age) {
        this.admin_age = admin_age;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_img() {
        return admin_img;
    }

    public void setAdmin_img(String admin_img) {
        this.admin_img = admin_img;
    }

    public String getAdmin_sex() {
        return admin_sex;
    }

    public void setAdmin_sex(String admin_sex) {
        this.admin_sex = admin_sex;
    }

    public String getAdmin_nation() {
        return admin_nation;
    }

    public void setAdmin_nation(String admin_nation) {
        this.admin_nation = admin_nation;
    }

    public String getAdmin_address() {
        return admin_address;
    }

    public void setAdmin_address(String admin_address) {
        this.admin_address = admin_address;
    }

    public String getAdmin_province() {
        return admin_province;
    }

    public void setAdmin_province(String admin_province) {
        this.admin_province = admin_province;
    }

    public String getAdmin_card() {
        return admin_card;
    }

    public void setAdmin_card(String admin_card) {
        this.admin_card = admin_card;
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
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

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    @Override
    public String toString() {
        return "AdminStaff{" +
                "id=" + id +
                ", admin_age=" + admin_age +
                ", section_id=" + section_id +
                ", department_id=" + department_id +
                ", position_id=" + position_id +
                ", admin_name='" + admin_name + '\'' +
                ", admin_img='" + admin_img + '\'' +
                ", admin_sex='" + admin_sex + '\'' +
                ", admin_nation='" + admin_nation + '\'' +
                ", admin_address='" + admin_address + '\'' +
                ", admin_province='" + admin_province + '\'' +
                ", admin_card='" + admin_card + '\'' +
                ", admin_phone='" + admin_phone + '\'' +
                ", sos_name='" + sos_name + '\'' +
                ", sos_ship='" + sos_ship + '\'' +
                ", sos_phone='" + sos_phone + '\'' +
                ", entry_time='" + entry_time + '\'' +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                ", state='" + state + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", section_name='" + section_name + '\'' +
                ", department_name='" + department_name + '\'' +
                '}';
    }
}
