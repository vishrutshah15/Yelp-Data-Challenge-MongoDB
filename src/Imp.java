
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Imp {
    
    public static void main(String args[]) throws IOException, ParseException
    {
        try {
            JSONParser parser = new JSONParser();
            System.out.println("javafxapplication1.Imp.main()");
            Object obj = parser.parse(new FileReader("C:\\Users\\Sanjay Desai\\Desktop\\yelp_business.json"));
            
            JSONArray jsonArray = (JSONArray) obj;
            
            
            JSONArray output = new JSONArray();
            for(int i=0;i<jsonArray.size();i++)
            {
                JSONObject temp2 = (JSONObject) jsonArray.get(i);
                JSONObject temp_obj = new JSONObject();
                
                temp_obj.put("business_id", temp2.get("business_id"));
                
                JSONArray loc = new JSONArray();
                loc.add(0, temp2.get("latitude"));
                loc.add(1, temp2.get("longitude"));
                
                temp_obj.put("loc",loc);
                
                output.add(i, temp_obj);
            }
            System.out.println("HIII");
            
            try {

		FileWriter file = new FileWriter("D:\\test.json");
		file.write(output.toJSONString());
		file.flush();
		file.close();

	} catch (IOException e) {
		e.printStackTrace();
	}
            
            //
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Imp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}