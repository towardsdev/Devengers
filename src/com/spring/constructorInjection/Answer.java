package com.spring.constructorInjection;  
  
import java.util.Date;  
  
public class Answer {  
private int id;  
private String answer;  
private Date postedDate;  
public Answer() {}  
public Answer(int id, String answer, Date postedDate) {  
    super();  
    this.id = id;  
    this.answer = answer;  
    this.postedDate = postedDate;  
}  
  
public String toString(){  
    return "Id:"+id+" Answer:"+answer+" Posted Date:"+postedDate;  
}  
}  