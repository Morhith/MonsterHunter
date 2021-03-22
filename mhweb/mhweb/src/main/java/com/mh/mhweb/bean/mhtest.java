/*
 * @Author: Hitysept
 * @Date: 2021-03-21 16:20:21
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-21 21:04:03
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\bean\mhtest.java
 */
package com.mh.mhweb.bean;

import java.security.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class mhtest {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private int user_id;
    private String nickname;
    private String mhweb_user_password;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Timestamp date_added;

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user_id='" + getUser_id() + "'" +
            ", nickname='" + getNickname() + "'" +
            ", password='" + getMhweb_user_password() + "'" +
            ", date_added='" + getDate_added() + "'" +
            "}";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getMhweb_user_password() {
        return mhweb_user_password;
    }
    public void setMhweb_user_password(String mhweb_user_password) {
        this.mhweb_user_password = mhweb_user_password;
    }
    public Timestamp getDate_added() {
        return date_added;
    }
    public void setDate_added(Timestamp date_added) {
        this.date_added = date_added;
    }

    public mhtest(int id,int user_id,String nickname,String mhweb_user_password){
        super();
        this.id = id;
        this.user_id = user_id;
        this.nickname = nickname;
        this.mhweb_user_password = mhweb_user_password;
    }
    public mhtest(){
        super();
    }
    
}

