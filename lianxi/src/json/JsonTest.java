package json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;

public class JsonTest {

public  static  void  main(String [] args)
{
	User user=new  User(110,"渣渣辉","男","123456789","25");
	Gson  gson=new Gson();
	String  str=gson.toJson(user);
	System.out.println(str);
	Object o=gson.fromJson(str, User.class);
    System.out.println(o);
    List<User> list =new  ArrayList<>();
    List<String> strlist=new  ArrayList<>();
    list.add(new User(111,"渣渣辉","男","123456789","25"));
    list.add(new User(112,"渣渣辉","男","123456789","25"));
    list.add(new User(113,"渣渣辉","男","123456789","25"));
    list.add(new User(114,"渣渣辉","男","123456789","25"));
    list.add(new User(115,"渣渣辉","男","123456789","25"));
    String  str1=gson.toJson(list);
    System.out.println(str1);
	User  [] userList=(User[]) gson.fromJson(str1, User[].class);
	List<User> listUsers=Arrays.asList(userList);
	List<User>  listUserss=new ArrayList<>(listUsers);
	listUserss.add(new User(111,"渣渣辉","男","123456789","25"));
	
    Iterator<User> iterator=listUserss.iterator();
    while(iterator.hasNext()){
    	
    	System.out.println(iterator.next());
    }
	User[] userss= listUserss.toArray(new User[0]);
	System.out.println(user);
}
}
