package org.ruff.example.jackson.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class JsonExample {
	
	public static void main(String[] args) {
		
		//TODO to junit
		
		//TODO rootname
		
		//TODO ...
		
		Person p0 = new Person();
		p0.setName("heesang");
		
		Person p1 = new Person();
		p1.setName("giyeon");
		p1.setPhoneNum("0101111111");
		List<Person> family = new ArrayList<Person>();
		family.add(p0);
		p1.setFamily(family);
		
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = null;
		try {
			json = ow.writeValueAsString(p1);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(json);
	}
}
