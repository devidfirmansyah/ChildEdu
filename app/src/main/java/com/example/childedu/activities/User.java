package com.example.childedu.activities;

public class User {
    String userId;
    String userNama;
    String userKelas;

    public User(){

    }

    public User(String userId, String userNama, String userKelas) {
        this.userId = userId;
        this.userNama = userNama;
        this.userKelas = userKelas;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserNama() {
        return userNama;
    }

    public String getUserKelas() {
        return userKelas;
    }
}
