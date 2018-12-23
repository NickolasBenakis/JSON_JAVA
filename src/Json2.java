import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


import java.io.FileNotFoundException;
import java.util.Iterator;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json2 {

    public static void main(String[] args) throws  ParseException, IOException{


        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("Test1.json"));
        JSONObject jsonObject = (JSONObject) obj;
        String name = (String) jsonObject.get("name");
        System.out.println(name);
        Long age = (Long) jsonObject.get("age");
        System.out.println(age);

        JSONArray msg = (JSONArray) jsonObject.get("toDoList");
        Iterator<String> iterator = msg.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
