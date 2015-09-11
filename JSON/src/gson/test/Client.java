package gson.test;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import gson.bean.Person;
import gson.bean.PersonList;

public class Client {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		Person p = new Person("张三",20);
		//Person 对象转换为JSON字符串
		String personJson = gson.toJson(p);
		System.out.println(personJson);
		
		String jsonStr = "{\"name\":\"张三\",\"age\":20}";
		//JSON字符串转换为Person对象
		Person p1 = gson.fromJson(jsonStr, Person.class);
		System.out.println(p1.toString());
		
		List<Person> persons = new ArrayList<Person>();
		Person p2 = new Person("李四",22);
		persons.add(p1);
		persons.add(p2);
		
		PersonList personList = new PersonList();
		personList.setPersons(persons);
		
		//PersonList转换为json字符串
		String jsonStr1 = gson.toJson(personList);
		System.out.println(jsonStr1);
		
		
		
		



	}

}
