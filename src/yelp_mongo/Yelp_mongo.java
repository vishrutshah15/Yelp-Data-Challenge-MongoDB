/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yelp_mongo;

/**
 *
 * @author Sanjay Desai
 */
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.regex;
import java.awt.List;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
 

class Dbconnection{
    static Connection sampleDBconn = null;
   
    Connection conn = null;
    public Connection getconnection(){
        
          
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
mongoLogger.setLevel(Level.SEVERE); 
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         MongoDatabase db = mongoClient.getDatabase("mydb");
         System.out.println("Connect to database successfully");
         //boolean auth = db.authenticate("","");
         //System.out.println("Authentication: "+auth);
          MongoCollection<Document> coll = db.getCollection("yelp");
        
         System.out.println("Collection yelp selected successfully");
        
	  /*FindIterable<Document> cursor = coll.find();
          
          cursor.forEach(new Block<Document>() {
                 @Override
                 public void apply(final Document document) {
                     System.out.println(document);
                 }
             });*/
            BasicDBObject clause1 = new BasicDBObject("yelping_since", "2012-02");
            //clause1.put("yelping_since", "2012-02");
            
            BasicDBObject clause2 = new BasicDBObject("review_count",new BasicDBObject("$gt",500));
            BasicDBObject clause3 = new BasicDBObject("fans",new BasicDBObject("$gt",15)); 
            BasicDBObject clause4 = new BasicDBObject("average_stars",new BasicDBObject("$gt",3)); 
            //BasicDBObject cl5 = new BasicDBObject("$exist",true);
            //BasicDBObject cl6 = new BasicDBObject("$where","this.friends.length>49");
            //String cl = cl5.toString();
            //BasicDBObject c = new BasicDBObject(cl,cl6);
            //BasicDBObject f = new BasicDBObject("friends",new BasicDBObject("$exist",true));
            BasicDBObject clause5 = new BasicDBObject("friends.50",new BasicDBObject("$exists",true));
            //BasicDBObject cl5 = new BasicDBObject("$where","this.friends.length>3");
            
            /*BasicDBList fl = new BasicDBList();
            fl.add(f);
            fl.add(cl6);*/
            
            //clause2.put("review_count",gtquery);
            BasicDBList or = new BasicDBList();
            
            or.add(clause1);
            or.add(clause2);
            or.add(clause3);
            or.add(clause4);
            or.add(clause5);
            //or.add(fl);
            
            //fields.put("name",1);
            //fields.put("average_stars",1);
            //fields.put("fans",1);
            BasicDBObject query = new BasicDBObject("$and", or);
            
            
            FindIterable<Document> cursor = coll.find(query);
            System.out.println(query);
            cursor.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                                System.out.println(document.get("user_id"));
                                System.out.println(document.get("name"));
                                System.out.println(document.get("fans"));
                                System.out.println(document.get("average_stars"));
                                System.out.println(document.get("friends"));
                                
                }
            });

        
    
    
               mongoClient.close();
               System.out.println("Connection successfully closed");
          
      
         return null;
     
    }   
}

public class Yelp_mongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Dbconnection A1 = new Dbconnection();
            Connection con = A1.getconnection();
	
      
      
   }

    
    
}
        // TODO code application logic here
  
