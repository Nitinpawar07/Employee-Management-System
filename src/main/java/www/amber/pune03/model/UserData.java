package www.amber.pune03.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class UserData {
    @Id
    private long id ;
      
    @Column(name = "UserName")
    private String Name;

    @Column(name =  "contact_no")
    private long contact;

    @Column
    private String Address;

     @Column(name = "department")
    private String department;

    

    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }



    public String getName() {
        return Name;
    }



    public void setName(String name) {
        Name = name;
    }



    public long getContact() {
        return contact;
    }



    public void setContact(long contact) {
        this.contact = contact;
    }



    public String getAddress() {
        return Address;
    }



    public void setAddress(String address) {
        Address = address;
    }



    public String getDepartment() {
        return department;
    }



    public void setDepartment(String department) {
        this.department = department;
    }



    public UserData() {
    }



    @Override
    public String toString() {
        return "UserData [id=" + id + ", Name=" + Name + ", contact=" + contact + ", Address=" + Address
                + ", department=" + department + "]";
    }
    

  

   
 

    


}
