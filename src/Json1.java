import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


import java.io.FileNotFoundException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json1 {


    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name","Nickolas");
        obj.put("age",new Integer(25));

        JSONArray list = new JSONArray();
        list.add("1st");
        list.add("2nd");
        list.add("3rd");
        obj.put("toDoList",list);


        try{
            FileWriter file = new FileWriter("test1.json");
            file.write(obj.toJSONString());
            System.out.println(file);
            file.flush();
            file.close();

        }catch(IOException e){
            e.printStackTrace();

        }



    }

}
