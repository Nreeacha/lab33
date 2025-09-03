package com.example.mylad3;

import java.util.List;

public class CheckListNote extends Note{
    //Attribute
    List<String> itemList;
    private String CheckListNote;

    //getter method
    public String getTexContent(){
        return CheckListNote;
    }

    //srtter method
    void setTexContent(String inputText){
        this.CheckListNote = inputText;
    }

    //mathod
    @Override
    String display() {
        /*System.out.println(title + ":");
        System.out.println(itemList);
        System.out.println("Date : " + createdDate);*/
        return "Title : " + title +
                "\nItemList : " + itemList +
                "\nDate : " + createdDate +
                "\nOwner : " + (owner != null ? owner.getName() : "Unknow");
    }

    @Override
    public void setTitle(String stringOfTitle) {

    }
}
