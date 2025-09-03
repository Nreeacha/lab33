package com.example.mylad3;

public class TextNote extends Note{
    //Attribute
   private String texContent;
    //getter method
    public String getTexContent(){
        return texContent;
    }

    //srtter method
    void setTexContent(String inputText){
        this.texContent = inputText;
    }


    //method
    @Override
     String display() {
        System.out.println(title);
        System.out.println(texContent);
        System.out.println(createdDate);
        return title + ":" + texContent + "\nItemList : " + texContent +
                "\nDate : " + createdDate +
                "\nOwner : " + (owner != null ? owner.getName() : "Unknow");
    }
}
