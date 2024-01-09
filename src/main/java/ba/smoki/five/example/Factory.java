package ba.smoki.five.example;

import ba.smoki.one.human.Pensioner;
import ba.smoki.one.human.Person;
import ba.smoki.one.human.Student;

public class Factory {
    public static Person create(String type){
        if(type.equalsIgnoreCase("student")){
            return new Student();
        }else if(type.equalsIgnoreCase("pensioner")){
            return new Pensioner();
        }else{
            return new Person();
        }
    }
}
