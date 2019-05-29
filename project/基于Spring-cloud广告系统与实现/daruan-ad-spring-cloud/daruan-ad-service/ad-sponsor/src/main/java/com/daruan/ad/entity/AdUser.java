package com.daruan.ad.entity;

import com.daruan.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

/**
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/4/22
 * Time:16:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_user")
public class AdUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "username", nullable = false)
    private String username;

    @Basic
    @Column(name = "token", nullable = false)
    private String token;

    @Basic
    @Column(name = "user_status", nullable = false)
    private Integer userStatus;

    @Basic
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    public AdUser(String username, String token){
        this.username = username;
        this.token = token;
        this.userStatus = CommonStatus.VALID.getStatus();
        this.createTime = new Date();
        this.updateTime = this.createTime;
    }
}
