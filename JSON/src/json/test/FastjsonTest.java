package json.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSON;

import json.bean.UserInfo;
import junit.framework.TestCase;


public class FastjsonTest extends TestCase{
	
	public void testUser(){
		UserInfo info = new UserInfo();
		info.setName("zhangsan");
		info.setAge(24);
		// 将对象转换为JSON字符串
		String str_json = JSON.toJSONString(info);
		System.out.println("JSON=" + str_json);
	}
	
	public void testCollection(){
		
		   
		  HashMap<String, Object> map = new HashMap<String, Object>(); 
		  map.put("username", "zhangsan"); 
		  map.put("age", 24); 
		  map.put("sex", "男"); 
		     
		  //map集合 
		  HashMap<String, Object> temp = new HashMap<String, Object>(); 
		  temp.put("name", "xiaohong"); 
		  temp.put("age", "23"); 
		  map.put("girlInfo", temp); 
		   
		  //list集合 
		  List<String> list = new ArrayList<String>(); 
		  list.add("爬山"); 
		  list.add("骑车"); 
		  list.add("旅游"); 
		  map.put("hobby", list); 
		     
		  /*JSON 序列化，默认序列化出的JSON字符串中键值对是使用双引号，如果需要单引号的JSON字符串， [eg:String jsonString = JSON.toJSONString(map,   SerializerFeature.UseSingleQuotes);]
		   *fastjson序列化时可以选择的SerializerFeature有十几个属性，你可以按照自己的需要去选择使用。 
		   */ 
		  String jsonString = JSON.toJSONString(map); 
		  System.out.println("JSON=" + jsonString); 
		   
	}

}

