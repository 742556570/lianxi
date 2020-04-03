package json;

public class User {
  private  int  id ;
  private  String  name;
  private  String  sex;
  private  String   tel;
  private  String  age;
public User(int id, String name, String sex, String tel, String age) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.tel = tel;
	this.age = age;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((sex == null) ? 0 : sex.hashCode());
	result = prime * result + ((tel == null) ? 0 : tel.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (age == null) {
		if (other.age != null)
			return false;
	} else if (!age.equals(other.age))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (sex == null) {
		if (other.sex != null)
			return false;
	} else if (!sex.equals(other.sex))
		return false;
	if (tel == null) {
		if (other.tel != null)
			return false;
	} else if (!tel.equals(other.tel))
		return false;
	return true;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", tel=" + tel + ", age=" + age + "]";
}
  
	
	
}
