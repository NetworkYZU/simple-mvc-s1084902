/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.simplemvc;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class SchoolStudent {

    static SchoolStudent getScore(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String id, firstName, lastName;
    private double score;
    public SchoolStudent(String id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    private static Map<String, SchoolStudent> db=new HashMap<>();
    static{
        db.put("Student1", new SchoolStudent("Student1", "name1", "name1", 95));
        db.put("Student2", new SchoolStudent("Student2", "name2", "name2", 26));
        db.put("Student3", new SchoolStudent("Student3", "name3", "name3", 48));
        db.put("Student4", new SchoolStudent("Student4", "name4", "name4", 71));
    }
    
    public static SchoolStudent getStudent(String id){
        return db.get(id);
    }
    }
    
