package com.tugasOOP_2;

class Student{ 
// sebelum diubah --> public class Student

    private String name;     
    private int mark;

    private void setName(String n){
        name=n;     
    }

    public String getName(){
        return name;     
    }         
    
    public void setMark(int m){
        mark=m;     
    }    

    public int getMark(){
        return mark;     
    }
}

public class Test{
    public static void main(String[] args) {
        Student s1=new Student();         
        //s1.setName("Enkapsulasi");   

        s1.setMark(90);
         //un-error-a 

        System.out.println("s1Name is "+s1.getName()); 
                                      //un-error-b  
        System.out.println("s1Mark is "+s1.getMark());
                                      //un-error-b  
        System.out.println("name dan mark "+s1.getName()+" "+s1.getMark());       
                                          //un-error-c     //un-error-c
    }
}
