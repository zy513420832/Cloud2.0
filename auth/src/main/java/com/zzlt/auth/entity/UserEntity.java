package com.zzlt.auth.entity;




import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private long id;
    @Column
    private String userName;
    @Column
    private String password;
}
