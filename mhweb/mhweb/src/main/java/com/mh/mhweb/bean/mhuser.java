// /*
//  * @Author: Hitysept
//  * @Date: 2021-03-21 15:56:09
//  * @LastEditors: Hitysept
//  * @LastEditTime: 2021-03-21 16:19:59
//  * @Description: file content
//  * @FilePath: \mhweb\src\main\java\com\mh\mhweb\bean\mhuser.java
//  */
// package com.mh.mhweb.bean;

// import java.security.Timestamp;

// import com.fasterxml.jackson.annotation.JsonFormat;

// public class mhuser {

//     private Integer id;
//     private int user_id;
//     private int user_group_id;
//     private int user_class_id;
//     private int sale_class_id;
//     private int store_id;
//     private String firstname;
//     private String lastname;
//     private String nickname;
//     private String gender;
//     private String email;
//     private String telephone;
//     private String mhweb_user_password;
//     private String image;
//     private String description;
//     private int newsletter;
//     private int address_id;
//     private String user_field;
//     private String ip;
//     private int mhweb_user_status;
//     private int safe;
//     private String token;
//     @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
//     private Timestamp date_added;
    
//     public Integer getId() {
//         return id;
//     }
//     public void setId(Integer id) {
//         this.id = id;
//     }
//     public int getUser_id() {
//         return user_id;
//     }
//     public void setUser_id(int user_id) {
//         this.user_id = user_id;
//     }
//     public int getUser_group_id() {
//         return user_group_id;
//     }
//     public void setUser_group_id(int user_group_id) {
//         this.user_group_id = user_group_id;
//     }
//     public int getUser_class_id() {
//         return user_class_id;
//     }
//     public void setUser_class_id(int user_class_id) {
//         this.user_class_id = user_class_id;
//     }
//     public int getSale_class_id() {
//         return sale_class_id;
//     }
//     public void setSale_class_id(int sale_class_id) {
//         this.sale_class_id = sale_class_id;
//     }
//     public int getStore_id() {
//         return store_id;
//     }
//     public void setStore_id(int store_id) {
//         this.store_id = store_id;
//     }
//     public String getFirstname() {
//         return firstname;
//     }
//     public void setFirstname(String firstname) {
//         this.firstname = firstname;
//     }
//     public String getLastname() {
//         return lastname;
//     }
//     public void setLastname(String lastname) {
//         this.lastname = lastname;
//     }
//     public String getNickname() {
//         return nickname;
//     }
//     public void setNickname(String nickname) {
//         this.nickname = nickname;
//     }
//     public String getGender() {
//         return gender;
//     }
//     public void setGender(String gender) {
//         this.gender = gender;
//     }
//     public String getEmail() {
//         return email;
//     }
//     public void setEmail(String email) {
//         this.email = email;
//     }
//     public String getTelephone() {
//         return telephone;
//     }
//     public void setTelephone(String telephone) {
//         this.telephone = telephone;
//     }
//     public String getMhweb_user_password() {
//         return mhweb_user_password;
//     }
//     public void setMhweb_user_password(String mhweb_user_password) {
//         this.mhweb_user_password = mhweb_user_password;
//     }
//     public String getImage() {
//         return image;
//     }
//     public void setImage(String image) {
//         this.image = image;
//     }
//     public String getDescription() {
//         return description;
//     }
//     public void setDescription(String description) {
//         this.description = description;
//     }
//     public int getNewsletter() {
//         return newsletter;
//     }
//     public void setNewsletter(int newsletter) {
//         this.newsletter = newsletter;
//     }
//     public int getAddress_id() {
//         return address_id;
//     }
//     public void setAddress_id(int address_id) {
//         this.address_id = address_id;
//     }
//     public String getUser_field() {
//         return user_field;
//     }
//     public void setUser_field(String user_field) {
//         this.user_field = user_field;
//     }
//     public String getIp() {
//         return ip;
//     }
//     public void setIp(String ip) {
//         this.ip = ip;
//     }
//     public int getMhweb_user_status() {
//         return mhweb_user_status;
//     }
//     public void setMhweb_user_status(int mhweb_user_status) {
//         this.mhweb_user_status = mhweb_user_status;
//     }
//     public int getSafe() {
//         return safe;
//     }
//     public void setSafe(int safe) {
//         this.safe = safe;
//     }
//     public String getToken() {
//         return token;
//     }
//     public void setToken(String token) {
//         this.token = token;
//     }
//     public Timestamp getDate_added() {
//         return date_added;
//     }
//     public void setDate_added(Timestamp date_added) {
//         this.date_added = date_added;
//     }
//     public mhuser (Integer id,int user_id,int user_group_id,int user_class_id,int sale_class_id,int store_id,String firstname,String lastname,String nickname,String gender,String email,String telephone,String mhweb_user_password,String image,String description,int newsletter,int address_id,String user_field,String ip,int mhweb_user_status,int safe,String token) {
//         super();
//         this.id = id;
//         this.user_id = user_id;
//         this.user_group_id = user_group_id;
//         this.user_class_id = user_class_id;
//         this.sale_class_id = sale_class_id;
//         this.store_id = store_id;
//         this.firstname = firstname;
//         this.lastname = lastname;
//         this.nickname = nickname;
//         this.gender = gender;
//         this.email = email;
//         this.telephone = telephone;
//         this.mhweb_user_password = mhweb_user_password;
//         this.image = image;
//         this.description = description;
//         this.newsletter = newsletter;
//         this.address_id = address_id;
//         this.user_field = user_field;
//         this.ip = ip;
//         this.mhweb_user_status = mhweb_user_status;
//         this.safe = safe;
//         this.token = token;
//     }
//     public mhuser () {
//         super();
//     }

// }

