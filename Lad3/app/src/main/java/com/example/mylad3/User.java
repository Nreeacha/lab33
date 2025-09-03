package com.example.mylad3;

import android.widget.EditText;

public class User {
    String name;
    String id;

    public User (String name){
        this.name=name;

    }
    public  User(EditText name){
        //getter

    }

    public static Object getText() {
        return null;
    }

    public String getName(){
        return name;

    }
    public void setName(String name ){
        this.name=name;

    }
    public String getId(){
        return id;

    }
    public void setIdUser(String idUser) {
        this.id = idUser;
    }


}
