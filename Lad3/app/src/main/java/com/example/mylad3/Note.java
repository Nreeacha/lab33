package com.example.mylad3;

import java.util.Date;

public abstract class Note {
    //Attribute
    protected String title;
    Date createdDate;
    protected User owner;
    //  String context;

    //getter method
       public String getTexContent(){
      return title;
      }

    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    //srtter method
    public  void setTitle(String inpuTitle) {

           this.title = inpuTitle;
       }

    abstract CharSequence display();



    // System.out.println(title);
       // System.out.println(context);
      //  System.out.println(createdDate);


}
