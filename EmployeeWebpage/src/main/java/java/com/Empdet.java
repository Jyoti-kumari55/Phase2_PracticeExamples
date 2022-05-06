package java.com;

public class Empdet {
    
private String id;
private String name;
private String email;
private String department;
private String city;

public Empdet() {
}

public String getId() {
	return id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Empdet [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + ", city=" + city
			+ "]";
}

public void setId(String string) {
	// TODO Auto-generated method stub
	
}



}