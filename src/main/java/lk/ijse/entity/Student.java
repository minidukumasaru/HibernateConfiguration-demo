package lk.ijse.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lk.ijse.embed.FullName;

@Entity
public class Student {
    @Id
    private int id;
    private FullName name;
    private String Address;

    public Student() {
    }

    public Student(int id, FullName name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", Address='" + Address + '\'' +
                '}';
    }
}