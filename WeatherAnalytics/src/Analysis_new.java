

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class Analysis_new {
	
	
	//To find the min and max
	  public static ArrayList mm(ArrayList<Integer> city)
	  {
		  
		  ArrayList<Integer> city1=new ArrayList<>();
		  int min = city.get(0);
		  int max = city.get(0);

		  for(Integer i2: city) {
		      if(i2 <min) min = i2;
		      if(i2 > max) max = i2;
		      
		  }
		      city1.add(min);
		      city1.add(max);
		  return city1;
	  }
	  
	  
	 //to split the date and get the day 
	  public static Integer split(String date) 
	  {

			String[] day= date.split("\\s+");
			String day0=day[1];
	       Integer day1=Integer.parseInt(day0);
		    System.out.println(day[1]);
		   return day1;

			}
	  
	  
	  
     public static void main(String[] args) {

	JSONParser parser = new JSONParser();

	try {

	
		
	
		 JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\HP\\Desktop\\json\\a.json"));
		 
		 
		 ArrayList<Integer> f18la = new ArrayList<>();
		 ArrayList<Integer> f18denver = new ArrayList<>();
		 ArrayList<Integer> f18sfo = new ArrayList<>();
		 ArrayList<Integer> f18seattle = new ArrayList<>();
		 ArrayList<Integer> f18ny = new ArrayList<>();
		 ArrayList<Integer> f18chicago = new ArrayList<>();
		 ArrayList<Integer> f18aus = new ArrayList<>();
		 
		 
		 ArrayList<Integer> f19la = new ArrayList<>();
		 ArrayList<Integer> f19denver = new ArrayList<>();
		 ArrayList<Integer> f19sfo = new ArrayList<>();
		 ArrayList<Integer> f19seattle = new ArrayList<>();
		 ArrayList<Integer> f19ny = new ArrayList<>();
		 ArrayList<Integer> f19chicago = new ArrayList<>();
		 ArrayList<Integer> f19aus = new ArrayList<>();
		 
		 
		 
		 ArrayList<Integer> f20la = new ArrayList<>();
		 ArrayList<Integer> f20denver = new ArrayList<>();
		 ArrayList<Integer> f20sfo = new ArrayList<>();
		 ArrayList<Integer> f20seattle = new ArrayList<>();
		 ArrayList<Integer> f20ny = new ArrayList<>();
		 ArrayList<Integer> f20chicago = new ArrayList<>();
		 ArrayList<Integer> f20aus = new ArrayList<>();
		 
		 
		 ArrayList<Integer> f21la = new ArrayList<>();
		 ArrayList<Integer> f21denver = new ArrayList<>();
		 ArrayList<Integer> f21sfo = new ArrayList<>();
		 ArrayList<Integer> f21seattle = new ArrayList<>();
		 ArrayList<Integer> f21ny = new ArrayList<>();
		 ArrayList<Integer> f21chicago = new ArrayList<>();
		 ArrayList<Integer> f21aus = new ArrayList<>();
		 
		 
		 
		 ArrayList<Integer> f22la = new ArrayList<>();
		 ArrayList<Integer> f22denver = new ArrayList<>();
		 ArrayList<Integer> f22sfo = new ArrayList<>();
		 ArrayList<Integer> f22seattle = new ArrayList<>();
		 ArrayList<Integer> f22ny = new ArrayList<>();
		 ArrayList<Integer> f22chicago = new ArrayList<>();
		 ArrayList<Integer> f22aus = new ArrayList<>();
		 
		 
		 
		 ArrayList<Integer> f23la = new ArrayList<>();
		 ArrayList<Integer> f23denver = new ArrayList<>();
		 ArrayList<Integer> f23sfo = new ArrayList<>();
		 ArrayList<Integer> f23seattle = new ArrayList<>();
		 ArrayList<Integer> f23ny = new ArrayList<>();
		 ArrayList<Integer> f23chicago = new ArrayList<>();
		 ArrayList<Integer> f23aus = new ArrayList<>();
		 
		 
		 ArrayList<Integer> f24la = new ArrayList<>();
		 ArrayList<Integer> f24denver = new ArrayList<>();
		 ArrayList<Integer> f24sfo = new ArrayList<>();
		 ArrayList<Integer> f24seattle = new ArrayList<>();
		 ArrayList<Integer> f24ny = new ArrayList<>();
		 ArrayList<Integer> f24chicago = new ArrayList<>();
		 ArrayList<Integer> f24aus = new ArrayList<>();
		 
		 ArrayList<Integer> f25la = new ArrayList<>();
		 ArrayList<Integer> f25denver = new ArrayList<>();
		 ArrayList<Integer> f25sfo = new ArrayList<>();
		 ArrayList<Integer> f25seattle = new ArrayList<>();
		 ArrayList<Integer> f25ny = new ArrayList<>();
		 ArrayList<Integer> f25chicago = new ArrayList<>();
		 ArrayList<Integer> f25aus = new ArrayList<>();
		
		 
		 
		 
		 ArrayList<Integer> la = new ArrayList<>();
		 ArrayList<Integer> denver = new ArrayList<>();
		 ArrayList<Integer> sfo = new ArrayList<>();
		 ArrayList<Integer> seattle = new ArrayList<>();
		 ArrayList<Integer> ny = new ArrayList<>();
		 ArrayList<Integer> aus = new ArrayList<>();
		 ArrayList<Integer> chicago = new ArrayList<>();
		 
		 int la_f18=0,la_f19=0,la_f20=0,la_f21=0,la_f22=0,la_f23=0,la_f24=0,la_f25=0;
		 int seattle_f18=0,seattle_f19=0,seattle_f20=0,seattle_f21=0,seattle_f22=0,seattle_f23=0,seattle_f24=0,seattle_f25=0;
		 int ny_f18=0,ny_f19=0,ny_f20=0,ny_f21=0,ny_f22=0,ny_f23=0,ny_f24=0,ny_f25=0;
		 int sfo_f18=0,sfo_f19=0,sfo_f20=0,sfo_f21=0,sfo_f22=0,sfo_f23=0,sfo_f24=0,sfo_f25=0;
		 int aus_f18=0,aus_f19=0,aus_f20=0,aus_f21=0,aus_f22=0,aus_f23=0,aus_f24=0,aus_f25=0;
		 int chicago_f18=0,chicago_f19=0,chicago_f20=0,chicago_f21=0,chicago_f22=0,chicago_f23=0,chicago_f24=0,chicago_f25=0;
		 int denver_f18=0,denver_f19=0,denver_f20=0,denver_f21=0,denver_f22=0,denver_f23=0,denver_f24=0,denver_f25=0;
		 
		 int count=0;
		 int sunsetCount=0 , sunsetCount1=0;
		 int k=0 ,k1=0,k2=0,k3=0,k4=0,k5=0,k6=0 ;
		 String ss;
		  for (Object o : a)
		  {
		    JSONObject id = (JSONObject) o;
		    

		    JSONObject name =(JSONObject) id.get("query");
		    

		    JSONObject results=(JSONObject) name.get("results");     //getting the result object 
		    
		    JSONObject channel =(JSONObject) results.get("channel");  //getting the channel object inside the result
		
		    
		    JSONObject location =(JSONObject) channel.get("location");    //getting the location object inside the result so we can access the city field inside it
		    System.out.println("Location :: "+location.get("city"));   // Printing the location inside the channel object
		    
		    
		    JSONObject astronomy =(JSONObject) channel.get("astronomy");    
		    System.out.println("Sunrise:: "+astronomy.get("sunrise"));
		    System.out.println("Sunset:: "+astronomy.get("sunset"));
		    
		    
		    JSONObject item =(JSONObject) channel.get("item"); 
		  
		    
		    JSONArray forecast = (JSONArray) item.get("forecast");
		
		 
		    for (Object o1 : forecast)
			  {
		    	
		    	 JSONObject f1 = (JSONObject) o1;
		    	 
		    	
		    	 
		    	 System.out.println("high:: "+ f1.get("high"));
			  
		    	 
			  }
		    
		    JSONObject cond = (JSONObject) item.get("condition");
		    System.out.println("temp :: "+cond.get("temp")); 
		    
		    int temp1=Integer.parseInt((String)cond.get("temp"));
		
		    
		    count++;
			
			   System.out.println("count:: "+count); 
			   System.out.println("sunsetCount:: "+sunsetCount); 
		    
//////////////////////////////////////////////******************************** adding values to cities on days		   
if(location.get("city").equals("Los Angeles")) {
String day0=(String)cond.get("date");

Integer day =split(day0);
String temp01=(String)cond.get("temp");
Integer temp02=Integer.parseInt(temp01);

if(day==18){
f18la.add(temp02);

}

if(day==19){
f19la.add(temp02);

}


if(day==20){
f20la.add(temp02);

}

if(day==21){
f21la.add(temp02);

}


if(day==22){
f22la.add(temp02);

}

if(day==23){
f23la.add(temp02);

}

if(day==24){
f24la.add(temp02);

}

if(day==25){
f25la.add(temp02);

}





}


if(location.get("city").equals("Seattle")) {
String day0=(String)cond.get("date");

Integer day =split(day0);
String temp01_seattle=(String)cond.get("temp");
Integer temp02_seattle=Integer.parseInt(temp01_seattle);

if(day==18){ f18seattle.add(temp02_seattle); }

if(day==19){ f19seattle.add(temp02_seattle); }

if(day==20){ f20seattle.add(temp02_seattle); }

if(day==21){ f21seattle.add(temp02_seattle);  }

if(day==22){  f22seattle.add(temp02_seattle);   }

if(day==23){  f23seattle.add(temp02_seattle);   }

if(day==24){  f24seattle.add(temp02_seattle);   }

if(day==25){ f25seattle.add(temp02_seattle);   }

}

if(location.get("city").equals("Denver")) {
String day0=(String)cond.get("date");

Integer day =split(day0);
String temp01_denver=(String)cond.get("temp");
Integer temp02_denver=Integer.parseInt(temp01_denver);

if(day==18){ f18denver.add(temp02_denver); }

if(day==19){ f19denver.add(temp02_denver); }

if(day==20){ f20denver.add(temp02_denver); }

if(day==21){ f21denver.add(temp02_denver);  }

if(day==22){  f22denver.add(temp02_denver);   }

if(day==23){  f23denver.add(temp02_denver);   }

if(day==24){  f24denver.add(temp02_denver);   }

if(day==25){ f25denver.add(temp02_denver);   }

}

if(location.get("city").equals("San Francisco")) {
String day0=(String)cond.get("date");

Integer day =split(day0);
String temp01_sfo=(String)cond.get("temp");
Integer temp02_sfo=Integer.parseInt(temp01_sfo);

if(day==18){ f18sfo.add(temp02_sfo); }

if(day==19){ f19sfo.add(temp02_sfo); }

if(day==20){ f20sfo.add(temp02_sfo); }

if(day==21){ f21sfo.add(temp02_sfo);  }

if(day==22){  f22sfo.add(temp02_sfo);   }

if(day==23){  f23sfo.add(temp02_sfo);   }

if(day==24){  f24sfo.add(temp02_sfo);   }

if(day==25){ f25sfo.add(temp02_sfo);   }

}

if(location.get("city").equals("Chicago")) {
String day0=(String)cond.get("date");

Integer day =split(day0);
String temp01_chicago=(String)cond.get("temp");
Integer temp02_chicago=Integer.parseInt(temp01_chicago);

if(day==18){ f18chicago.add(temp02_chicago); }

if(day==19){ f19chicago.add(temp02_chicago); }

if(day==20){ f20chicago.add(temp02_chicago); }

if(day==21){ f21chicago.add(temp02_chicago);  }

if(day==22){  f22chicago.add(temp02_chicago);   }

if(day==23){  f23chicago.add(temp02_chicago);   }

if(day==24){  f24chicago.add(temp02_chicago);   }

if(day==25){ f25chicago.add(temp02_chicago);   }

}

if(location.get("city").equals("Austin")) {
String day0=(String)cond.get("date");

Integer day =split(day0);
String temp01_aus=(String)cond.get("temp");
Integer temp02_aus=Integer.parseInt(temp01_aus);

if(day==18){ f18aus.add(temp02_aus); }

if(day==19){ f19aus.add(temp02_aus); }

if(day==20){ f20aus.add(temp02_aus); }

if(day==21){ f21aus.add(temp02_aus);  }

if(day==22){  f22aus.add(temp02_aus);   }

if(day==23){  f23aus.add(temp02_aus);   }

if(day==24){  f24aus.add(temp02_aus);   }

if(day==25){ f25aus.add(temp02_aus);   }

}


if(location.get("city").equals("New York")) {
String day0=(String)cond.get("date");

Integer day =split(day0);
String temp01_ny=(String)cond.get("temp");
Integer temp02_ny=Integer.parseInt(temp01_ny);

if(day==18){ f18ny.add(temp02_ny); }

if(day==19){ f19ny.add(temp02_ny); }

if(day==20){ f20ny.add(temp02_ny); }

if(day==21){ f21ny.add(temp02_ny);  }

if(day==22){  f22ny.add(temp02_ny);   }

if(day==23){  f23ny.add(temp02_ny);   }

if(day==24){  f24ny.add(temp02_ny);   }

if(day==25){ f25ny.add(temp02_ny);   }

}


				 
			   
			   //*************If LA city
		    if(location.get("city").equals("Los Angeles")){
		    la.add(temp1);
		    System.out.println("---LA---- "); 
		    }
		      
			  
		   for (int p : la)
		   {
		         k=+p;
			    System.out.println("LA Temp"+p);		   
		  }
		   
		   //*****
		   
		   //*************If Denver city
		    if(location.get("city").equals("Denver")){
		    denver.add(temp1);
		    System.out.println("---Denver---- "); 
		    }
		      
			  
		   for (int p1 : denver)
		   {
		         k1=+p1;
			    System.out.println("denver Temp"+p1);		   
		  }
		   
		   //*****
		   
		   
		   //*************If chicago city
		    if(location.get("city").equals("Chicago")){
		    	chicago.add(temp1);
		    System.out.println("---chicago---- "); 
		    }
		      
			  
		   for (int p2 : chicago)
		   {
		         k2=+p2;
			    System.out.println("seattle Temp"+p2);		   
		  }
		   
		   //*****
		   
		   
		   //*************If seattle city
		    if(location.get("city").equals("Seattle")){
		    	seattle.add(temp1);
		    System.out.println("---seattle---- "); 
		    }
		      
			  
		   for (int p2 : seattle)
		   {
		         k2=+p2;
			    System.out.println("seattle Temp"+p2);		   
		  }
		   
		   //*****
		   
		   
		   //*************If sfo city
		    if(location.get("city").equals("San Francisco")){
		    	sfo.add(temp1);
		    System.out.println("---sfo---- "); 
		    }
		      
			  
		   for (int p3 : sfo)
		   {
		         k3=+p3;
			    System.out.println("sfo Temp"+p3);		   
		  }
		   
		   //*****
		   
		 //*************If chicago city
		    if(location.get("city").equals("chicago")){
		    	chicago.add(temp1);
		    System.out.println("---chicago---- "); 
		    }
		      
			  
		   for (int p4 : chicago)
		   {
		         k4=+p4;
			    System.out.println("chicago Temp"+p4);		   
		  }
		   
		   //*****
		   
		   //*************If ny city
		    if(location.get("city").equals("New York")){
		    	ny.add(temp1);
		    System.out.println("---ny---- "); 
		    }
		      
			  
		   for (int p5 : ny)
		   {
		         k5=+p5;
			    System.out.println("chicago Temp"+p5);		   
		  }
		   
		   //*****
		   
		   //*************If aus city
		    if(location.get("city").equals("Austin")){
		    	aus.add(temp1);
		    System.out.println("---Austin---- "); 
		    }
		      
			  
		   for (int p6 : aus)
		   {
		         k6=+p6;
			    System.out.println("aus Temp"+p6);		   
		  }
		   
		  
		   
		   
		   //*****
		   

		  }
		   
		   /** summation of  to la temp array ****/
		   
		   if(f18la.size()>0) {for (int la018: f18la) { la_f18=+la018; } }
		   
		   if(f19la.size()>0) {for (int la019: f19la) {
			   la_f19 =la_f19+ la019 ;System.out.println("laa Temp="+la_f19+"la019="+la019);	
			   }}
		
		   //for(int l=0;l<f19la.size();l++) {la_f19 =la_f19+ f19la.get(l) ;System.out.println("laa Temp="+la_f19+"la019="+la_f19);	}
		  // System.out.println("la_f19"+la_f19);
		   
		   
		   if(f20la.size()>0) {for (int la020: f20la) { la_f20=la_f20+la020; }}
		   if(f21la.size()>0) {for (int la021: f21la) { la_f20=la_f20+la021; }}
		   if(f22la.size()>0) {for (int la022: f22la) { la_f20=la_f20+la022; }}
		   if(f23la.size()>0) {for (int la023: f23la) { la_f23=la_f23+la023; }}
		   if(f24la.size()>0) {for (int la024: f24la) { la_f24=la_f24+la024; }}
		   if(f25la.size()>0) {for (int la025: f25la) { la_f25=la_f25+la025; }}
		   /***la summation ends here **/
		   
		   
		   
  /** summation of  to la temp array ****/
		   
		   if(f18sfo.size()>0) {for (int sfo018: f18sfo) { sfo_f18=sfo_f18+sfo018; } }
		   if(f19sfo.size()>0) {for (int sfo019: f18sfo) { sfo_f19=sfo_f19+sfo019; }}
		   if(f20sfo.size()>0) {for (int sfo020: f20sfo) { sfo_f20=sfo_f20+sfo020; }}
		   if(f21sfo.size()>0) {for (int sfo021: f21sfo) { sfo_f21=sfo_f21+sfo021; }}
		   if(f22sfo.size()>0) {for (int sfo022: f22sfo) { sfo_f22=sfo_f22+sfo022; }}
		   if(f23sfo.size()>0) {for (int sfo023: f23sfo) { sfo_f23=sfo_f23+sfo023; }}
		   if(f24sfo.size()>0) {for (int sfo024: f24sfo) { sfo_f24=sfo_f24+sfo024; }}
		   if(f25sfo.size()>0) {for (int sfo025: f25sfo) { sfo_f24=sfo_f24+sfo025; }}
		   /***la summation ends here **/
		   
		   
  /** summation of  to la temp array ****/
		   
		   if(f18denver.size()>0) {for (int denver018: f18denver) { denver_f18=denver_f18+denver018; } }
		   if(f19denver.size()>0) {for (int denver019: f18denver) { denver_f19=denver_f19+denver019; }}
		   if(f20denver.size()>0) {for (int denver020: f20denver) { denver_f20=denver_f20+denver020; }}
		   if(f21denver.size()>0) {for (int denver021: f21denver) { denver_f21=denver_f21+denver021; }}
		   if(f22denver.size()>0) {for (int denver022: f22denver) { denver_f22=denver_f22+denver022; }}
		   if(f23denver.size()>0) {for (int denver023: f23denver) { denver_f23=denver_f23+denver023; }}
		   if(f24denver.size()>0) {for (int denver024: f24denver) { denver_f24=denver_f24+denver024; }}
		   if(f25denver.size()>0) {for (int denver025: f25denver) { denver_f24=denver_f24+denver025; }}
		   /***la summation ends here **/
		   
		   
 /** summation of  to la temp array ****/
		   
		   if(f18seattle.size()>0) {for (int seattle018: f18seattle) { seattle_f18=seattle_f18+seattle018; } }
		   if(f19seattle.size()>0) {for (int seattle019: f18seattle) { seattle_f19=seattle_f19+seattle019; }}
		   if(f20seattle.size()>0) {for (int seattle020: f20seattle) { seattle_f20=seattle_f20+seattle020; }}
		   if(f21seattle.size()>0) {for (int seattle021: f21seattle) { seattle_f21=seattle_f21+seattle021; }}
		   if(f22seattle.size()>0) {for (int seattle022: f22seattle) { seattle_f22=seattle_f22+seattle022; }}
		   if(f23seattle.size()>0) {for (int seattle023: f23seattle) { seattle_f23=seattle_f23+seattle023; }}
		   if(f24seattle.size()>0) {for (int seattle024: f24seattle) { seattle_f24=seattle_f24+seattle024; }}
		   if(f25seattle.size()>0) {for (int seattle025: f25seattle) { seattle_f24=seattle_f24+seattle025; }}
		   /***la summation ends here **/
		   
		  
		  /** summation of  to la temp array ****/
		   
		   if(f18chicago.size()>0) {for (int chicago018: f18chicago) { chicago_f18=chicago_f18+chicago018; } }
		   if(f19chicago.size()>0) {for (int chicago019: f18chicago) { chicago_f19=chicago_f19+chicago019; }}
		   if(f20chicago.size()>0) {for (int chicago020: f20chicago) { chicago_f20=chicago_f20+chicago020; }}
		   if(f21chicago.size()>0) {for (int chicago021: f21chicago) { chicago_f21=chicago_f21+chicago021; }}
		   if(f22chicago.size()>0) {for (int chicago022: f22chicago) { chicago_f22=chicago_f22+chicago022; }}
		   if(f23chicago.size()>0) {for (int chicago023: f23chicago) { chicago_f23=chicago_f23+chicago023; }}
		   if(f24chicago.size()>0) {for (int chicago024: f24chicago) { chicago_f24=chicago_f24+chicago024; }}
		   if(f25chicago.size()>0) {for (int chicago025: f25chicago) { chicago_f25=chicago_f25+chicago025; }}
		   /***la summation ends here **/
		   
/** summation of  to la temp array ****/
		   
		   if(f18ny.size()>0) {for (int ny018: f18ny) { ny_f18=ny_f18=+ny018; } }
		   if(f19ny.size()>0) {for (int ny019: f18ny) { ny_f19=ny_f19+ny019; }}
		   if(f20ny.size()>0) {for (int ny020: f20ny) { ny_f20=ny_f20+ny020; }}
		   if(f21ny.size()>0) {for (int ny021: f21ny) { ny_f21=ny_f21+ny021; }}
		   if(f22ny.size()>0) {for (int ny022: f22ny) { ny_f22=ny_f22+ny022; }}
		   if(f23ny.size()>0) {for (int ny023: f23ny) { ny_f23=ny_f23+ny023; }}
		   if(f24ny.size()>0) {for (int ny024: f24ny) { ny_f24=ny_f24+ny024; }}
		   if(f25ny.size()>0) {for (int ny025: f25ny) { ny_f25=ny_f25+ny025; }}
		   /***la summation ends here **/
		   
		   
/** summation of  to la temp array ****/
		   
		   if(f18aus.size()>0) {for (int aus018: f18ny) { aus_f18=aus_f18+aus018; } }
		   if(f19aus.size()>0) {for (int aus019: f18ny) { aus_f19=aus_f19+aus019; }}
		   if(f20aus.size()>0) {for (int aus020: f20ny) { aus_f20=aus_f20+aus020; }}
		   if(f21aus.size()>0) {for (int aus021: f21ny) { aus_f21=aus_f21+aus021; }}
		   if(f22aus.size()>0) {for (int aus022: f22ny) { aus_f22=aus_f22+aus022; }}
		   if(f23aus.size()>0) {for (int aus023: f23ny) { aus_f23=aus_f23+aus023; }}
		   if(f24aus.size()>0) {for (int aus024: f24ny) { aus_f24=aus_f24+aus024; }}
		   if(f25aus.size()>0) {for (int aus025: f25ny) { aus_f25=aus_f25+aus025; }}
		   /***la summation ends here **/
		   
		   
		  
		  	
		   
		  
		 
		  
/////////////////*******************************adding values ends here ****************************/////////////////		  
		  
		  
		  //**********Avg temp of all cities ***//
		  
		  int la_avg_temp = k/la.size();
		  int denver_avg_tem = k1/denver.size();
		  int seattle_avg_tem= k2/seattle.size();
		  int sfo_avg_tem = k3/sfo.size();
		  int chicago_avg_tem = k4/chicago.size();
		  int ny_avg_tem = k5/ny.size();
		  int aus_avg_tem = k6/aus.size();
		  
		  int sfo18_temp=0,sfo19_temp=0,sfo20_temp=0,sfo21_temp=0,sfo22_temp=0,sfo23_temp=0,sfo24_temp=0;
		  int denver18_temp=0,denver19_temp=0,denver20_temp=0,denver21_temp=0,denver22_temp=0,denver23_temp=0,denver24_temp=0;
		  int la18_temp=0,la19_temp=0,la20_temp=0,la21_temp=0,la22_temp=0,la23_temp=0,la24_temp=0;
		  int seattle18_temp=0,seattle19_temp=0,seattle20_temp=0,seattle21_temp=0,seattle22_temp=0,seattle23_temp=0,seattle24_temp=0;
		  int chicago18_temp=0,chicago19_temp=0,chicago20_temp=0,chicago21_temp=0,chicago22_temp=0,chicago23_temp=0,chicago24_temp=0;
		  int aus18_temp=0,aus19_temp=0,aus20_temp=0,aus21_temp=0,aus22_temp=0,aus23_temp=0,aus24_temp=0;
		  int ny18_temp=0,ny19_temp=0,ny20_temp=0,ny21_temp=0,ny22_temp=0,ny23_temp=0,ny24_temp=0;
		  
		  if(f18sfo.size()>0) {  sfo18_temp=sfo_f18/f18sfo.size(); }
		  
		  if(f19sfo.size()>0) { sfo19_temp=sfo_f19/f19sfo.size();}
		  if(f20sfo.size()>0) { sfo20_temp=sfo_f20/f20sfo.size();}
		  if(f21sfo.size()>0) { sfo21_temp=sfo_f21/f21sfo.size();}
		  if(f22sfo.size()>0) { sfo22_temp=sfo_f22/f22sfo.size();}
		  if(f23sfo.size()>0) { sfo23_temp=sfo_f23/f23sfo.size();}
		  if(f24sfo.size()>0) { sfo24_temp=sfo_f24/f24sfo.size();}
		  
		  
		  if(f18la.size()>0) { la18_temp=la_f18/f18la.size();}
		  if(f19la.size()>0) { la19_temp=la_f19/f19la.size();}
		  if(f20la.size()>0) {la20_temp=la_f20/f20la.size();}
		  if(f21la.size()>0) { la21_temp=la_f21/f21la.size();}
		  if(f22la.size()>0) {la22_temp=la_f22/f22la.size();}
		  if(f23la.size()>0) { la23_temp=la_f23/f23la.size();}
		  if(f24la.size()>0) { la24_temp=la_f24/f24la.size();}
		  
		  
		  if(f18denver.size()>0) { denver18_temp=denver_f18/f18denver.size();}
		  if(f19denver.size()>0) { denver19_temp=denver_f19/f19denver.size();}
		  if(f20denver.size()>0) { denver20_temp=denver_f20/f20denver.size();}
		  if(f21denver.size()>0) {  denver21_temp=denver_f21/f21denver.size();}
		  if(f22denver.size()>0) { denver22_temp=denver_f22/f22denver.size();}
		  if(f23denver.size()>0) {  denver23_temp=denver_f23/f23denver.size();}
		  if(f24denver.size()>0) {  denver24_temp=denver_f24/f24denver.size();}
		  
		  
		  if(f18chicago.size()>0) { chicago18_temp=chicago_f18/f18chicago.size();}
		  if(f19chicago.size()>0) { chicago19_temp=chicago_f19/f19chicago.size();}
		  if(f20chicago.size()>0) {  chicago20_temp=chicago_f20/f20chicago.size();}
		  if(f21chicago.size()>0) { chicago21_temp=chicago_f21/f21chicago.size();}
		  if(f22chicago.size()>0) {  chicago22_temp=chicago_f22/f22chicago.size();}
		  if(f23chicago.size()>0) {  chicago23_temp=chicago_f23/f23chicago.size();}
		  if(f24chicago.size()>0) {  chicago24_temp=chicago_f24/f24chicago.size();}
		  
		  
		  if(f18aus.size()>0) { aus18_temp=aus_f18/f18aus.size();}
		  if(f19aus.size()>0) { aus19_temp=aus_f19/f19aus.size();}
		  if(f20aus.size()>0) { aus20_temp=aus_f20/f20aus.size();}
		  if(f21aus.size()>0) { aus21_temp=aus_f21/f21aus.size();}
		  if(f22aus.size()>0) {aus22_temp=aus_f22/f22aus.size();}
		  if(f23aus.size()>0) { aus23_temp=aus_f23/f23aus.size();}
		  if(f24aus.size()>0) { aus24_temp=aus_f24/f24aus.size();}
		  
		  
		  if(f18ny.size()>0) { ny18_temp=ny_f18/f18ny.size();}
		  if(f19ny.size()>0) { ny19_temp=ny_f19/f19ny.size();}
		  if(f20ny.size()>0) { ny20_temp=ny_f20/f20ny.size();}
		  if(f21ny.size()>0) { ny21_temp=ny_f21/f21ny.size();}
		  if(f22ny.size()>0) { ny22_temp=ny_f22/f22ny.size();}
		  if(f23ny.size()>0) { ny23_temp=ny_f23/f23ny.size();}
		  if(f24ny.size()>0) { ny24_temp=ny_f24/f24ny.size();}
		  
		  
		  if(f18seattle.size()>0) { seattle18_temp=seattle_f18/f18seattle.size();}
		  if(f19seattle.size()>0) {  seattle19_temp=seattle_f19/f19seattle.size();}
		  if(f20seattle.size()>0) { seattle20_temp=seattle_f20/f20seattle.size();}
		  if(f21seattle.size()>0) { seattle21_temp=seattle_f21/f21seattle.size();}
		  if(f22seattle.size()>0) {  seattle22_temp=seattle_f22/f22seattle.size();}
		  if(f23seattle.size()>0) { seattle23_temp=seattle_f23/f23seattle.size();}
		  if(f24seattle.size()>0) { seattle24_temp=seattle_f24/f24seattle.size();}
		  
		  
		  //***Avg_temp ends here *****//
		  
		  
		  
		  System.out.println("k=="+k);
		  System.out.println("j==");
		  
		  
		  
		  //************LA city ends here
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		   JSONArray la_array = new JSONArray();
		   
		   JSONObject la_obj = new JSONObject();
		   JSONObject denver_obj = new JSONObject();
		   JSONObject seattle_obj = new JSONObject();
		   JSONObject sfo_obj = new JSONObject();
		   JSONObject chicago_obj = new JSONObject();
		   JSONObject ny_obj = new JSONObject();
		   JSONObject aus_obj = new JSONObject();
		   
		   JSONObject la18_obj = new JSONObject();
		   JSONObject la19_obj = new JSONObject();
		   JSONObject la20_obj = new JSONObject();
		   JSONObject la21_obj = new JSONObject();
		   JSONObject la22_obj = new JSONObject();
		   JSONObject la23_obj = new JSONObject();
		   JSONObject la24_obj = new JSONObject();
		   
		   JSONObject denver18_obj = new JSONObject();
		   JSONObject denver19_obj = new JSONObject();
		   JSONObject denver20_obj = new JSONObject();
		   JSONObject denver21_obj = new JSONObject();
		   JSONObject denver22_obj = new JSONObject();
		   JSONObject denver23_obj = new JSONObject();
		   JSONObject denver24_obj = new JSONObject();
		  
		   
		   JSONObject seattle18_obj = new JSONObject();
		   JSONObject seattle19_obj = new JSONObject();
		   JSONObject seattle20_obj = new JSONObject();
		   JSONObject seattle21_obj = new JSONObject();
		   JSONObject seattle22_obj = new JSONObject();
		   JSONObject seattle23_obj = new JSONObject();
		   JSONObject seattle24_obj = new JSONObject();
		   
		   JSONObject chicago18_obj = new JSONObject();
		   JSONObject chicago19_obj = new JSONObject();
		   JSONObject chicago20_obj = new JSONObject();
		   JSONObject chicago21_obj = new JSONObject();
		   JSONObject chicago22_obj = new JSONObject();
		   JSONObject chicago23_obj = new JSONObject();
		   JSONObject chicago24_obj = new JSONObject();
		   
		   JSONObject aus18_obj = new JSONObject();
		   JSONObject aus19_obj = new JSONObject();
		   JSONObject aus20_obj = new JSONObject();
		   JSONObject aus21_obj = new JSONObject();
		   JSONObject aus22_obj = new JSONObject();
		   JSONObject aus23_obj = new JSONObject();
		   JSONObject aus24_obj = new JSONObject();
		   
		   JSONObject sfo18_obj = new JSONObject();
		   JSONObject sfo19_obj = new JSONObject();
		   JSONObject sfo20_obj = new JSONObject();
		   JSONObject sfo21_obj = new JSONObject();
		   JSONObject sfo22_obj = new JSONObject();
		   JSONObject sfo23_obj = new JSONObject();
		   JSONObject sfo24_obj = new JSONObject();
		   
		   JSONObject ny18_obj = new JSONObject();
		   JSONObject ny19_obj = new JSONObject();
		   JSONObject ny20_obj = new JSONObject();
		   JSONObject ny21_obj = new JSONObject();
		   JSONObject ny22_obj = new JSONObject();
		   JSONObject ny23_obj = new JSONObject();
		   JSONObject ny24_obj = new JSONObject();
		   
		  
		  la18_obj.put("Location", "Los Angeles");
		    la18_obj.put("avg_temp", k);
		    la18_obj.put("date", "18");
		    la18_obj.put("min", mm(f18la).get(0));
		    la18_obj.put("max", mm(f18la).get(1));
		    
		    la19_obj.put("Location", "Los Angeles");
		    la19_obj.put("avg_temp", la19_temp);
		    la19_obj.put("date", "19");
		    la19_obj.put("min", mm(f19la).get(0));
		    la19_obj.put("max", mm(f19la).get(1));
		    
		    la20_obj.put("Location", "Los Angeles");
		    la20_obj.put("avg_temp", la20_temp);
		    la20_obj.put("date", "20");
		   if(f20la.size()>0) {  la20_obj.put("min", mm(f20la).get(0)); }
		   if(f20la.size()>0) {  la20_obj.put("max", mm(f20la).get(1)); }
		    
		    la21_obj.put("Location", "Los Angeles");
		    la21_obj.put("avg_temp", la21_temp);
		    la21_obj.put("date", "21");
		    if(f21la.size()>0) {  la21_obj.put("min", mm(f21la).get(0));}
		    if(f21la.size()>0) {  la21_obj.put("max", mm(f21la).get(1));}
		    
		    
		    la22_obj.put("Location", "Los Angeles");
		    la22_obj.put("avg_temp", la22_temp);
		    la22_obj.put("date", "22");
		    if(f22la.size()>0) {   la22_obj.put("min", mm(f22la).get(0));}
		    if(f22la.size()>0) {   la22_obj.put("max", mm(f22la).get(1));}
		    
		    la23_obj.put("Location", "Los Angeles");
		    la23_obj.put("avg_temp", la23_temp);
		    la23_obj.put("date", "23");
		    if(f23la.size()>0) {   la23_obj.put("min", mm(f23la).get(0));}
		    if(f23la.size()>0) {   la23_obj.put("max", mm(f23la).get(1));}
		    
		    la24_obj.put("Location", "Los Angeles");
		    la24_obj.put("avg_temp", la24_temp);
		    la24_obj.put("date", "24_");
		    if(f24la.size()>0) {   la24_obj.put("min", mm(f24la).get(0));}
		    if(f24la.size()>0) {  la24_obj.put("max", mm(f24la).get(1));}
		    
		    
		    denver18_obj.put("Location", "Denver");
		    denver18_obj.put("avg_temp", denver18_temp);
		    denver18_obj.put("date", "18");
		    denver18_obj.put("min", mm(f18denver).get(0));
		    denver18_obj.put("max", mm(f18denver).get(1));
			    
		    denver19_obj.put("Location", "Denver");
		    denver19_obj.put("avg_temp", denver19_temp);
		    denver19_obj.put("date", "19");
		    denver19_obj.put("min", mm(f19denver).get(0));
		    denver19_obj.put("max", mm(f19denver).get(1));
			    
		    denver20_obj.put("Location", "Denver");
		    denver20_obj.put("avg_temp", denver20_temp);
		    denver20_obj.put("date", "20");
			   if(f20denver.size()>0) {  denver20_obj.put("min", mm(f20denver).get(0)); }
			   if(f20denver.size()>0) {  denver20_obj.put("max", mm(f20denver).get(1)); }
			    
			   denver21_obj.put("Location", "Denver");
			   denver21_obj.put("avg_temp", denver21_temp);
			   denver21_obj.put("date", "21");
			    if(f21denver.size()>0) {  denver21_obj.put("min", mm(f21denver).get(0));}
			    if(f21denver.size()>0) {  denver21_obj.put("max", mm(f21denver).get(1));}
			    
			    
			    denver22_obj.put("Location", "Denver");
			    denver22_obj.put("avg_temp", denver22_temp);
			    denver22_obj.put("date", "22");
			    if(f22denver.size()>0) {   denver22_obj.put("min", mm(f22denver).get(0));}
			    if(f22denver.size()>0) {   denver22_obj.put("max", mm(f22denver).get(1));}
			    
			    denver23_obj.put("Location", "Denver");
			    denver23_obj.put("avg_temp", denver23_temp);
			    denver23_obj.put("date", "23");
			    if(f23denver.size()>0) {   denver23_obj.put("min", mm(f23denver).get(0));}
			    if(f23denver.size()>0) {   denver23_obj.put("max", mm(f23denver).get(1));}
			    
			    denver24_obj.put("Location", "Denver");
			    denver24_obj.put("avg_temp", denver24_temp);
			    denver24_obj.put("date", "24_");
			    if(f24denver.size()>0) {   denver24_obj.put("min", mm(f24denver).get(0));}
			    if(f24denver.size()>0) {  denver24_obj.put("max", mm(f24denver).get(1));}
			    
			    
			    ny18_obj.put("Location", "New York");
			    ny18_obj.put("avg_temp", ny18_temp);
			    ny18_obj.put("date", "18");
			    ny18_obj.put("min", mm(f18ny).get(0));
			    ny18_obj.put("max", mm(f18ny).get(1));
			    
			    ny19_obj.put("Location", "New York");
			    ny19_obj.put("avg_temp", ny19_temp);
			    ny19_obj.put("date", "19");
			    ny19_obj.put("min", mm(f19ny).get(0));
			    ny19_obj.put("max", mm(f19ny).get(1));
				    
			    ny20_obj.put("Location", "New York");
			    ny20_obj.put("avg_temp", ny20_temp);
			    ny20_obj.put("date", "20");
				   if(f20ny.size()>0) {  ny20_obj.put("min", mm(f20ny).get(0)); }
				   if(f20ny.size()>0) {  ny20_obj.put("max", mm(f20ny).get(1)); }
				    
				   ny21_obj.put("Location", "New York");
				   ny21_obj.put("avg_temp", ny21_temp);
				   ny21_obj.put("date", "21");
				    if(f21ny.size()>0) {  ny21_obj.put("min", mm(f21ny).get(0));}
				    if(f21ny.size()>0) {  ny21_obj.put("max", mm(f21ny).get(1));}
				    
				    
				    ny22_obj.put("Location", "New York");
				    ny22_obj.put("avg_temp", ny22_temp);
				    ny22_obj.put("date", "22");
				    if(f22ny.size()>0) {   ny22_obj.put("min", mm(f22ny).get(0));}
				    if(f22ny.size()>0) {   ny22_obj.put("max", mm(f22ny).get(1));}
				    
				    ny23_obj.put("Location", "New York");
				    ny23_obj.put("avg_temp", ny23_temp);
				    ny23_obj.put("date", "23");
				    if(f23ny.size()>0) {   ny23_obj.put("min", mm(f23ny).get(0));}
				    if(f23ny.size()>0) {   ny23_obj.put("max", mm(f23ny).get(1));}
				    
				    ny24_obj.put("Location", "New York");
				    ny24_obj.put("avg_temp", ny24_temp);
				    ny24_obj.put("date", "24_");
				    if(f24ny.size()>0) {   ny24_obj.put("min", mm(f24ny).get(0));}
				    if(f24ny.size()>0) {  ny24_obj.put("max", mm(f24ny).get(1));}
		 
				    
				    sfo18_obj.put("Location", "San Fransisco");
				    sfo18_obj.put("avg_temp", sfo18_temp);
				    sfo18_obj.put("date", "18");
				    if(f18sfo.size()>0) { sfo18_obj.put("min", mm(f18sfo).get(0));}
				    if(f18sfo.size()>0) {sfo18_obj.put("max", mm(f18sfo).get(1));}
				    
				    sfo19_obj.put("Location", "San Fransisco");
				    sfo19_obj.put("avg_temp", sfo19_temp);
				    sfo19_obj.put("date", "19");
				    if(f19sfo.size()>0) { sfo19_obj.put("min", mm(f19sfo).get(0));}
				    if(f19sfo.size()>0) {sfo19_obj.put("max", mm(f19sfo).get(1));}
					    
				    sfo20_obj.put("Location", "San Fransisco");
				    sfo20_obj.put("avg_temp", ny20_temp);
				    sfo20_obj.put("date", "20");
					   if(f20sfo.size()>0) {  sfo20_obj.put("min", mm(f20sfo).get(0)); }
					   if(f20sfo.size()>0) {  sfo20_obj.put("max", mm(f20sfo).get(1)); }
					    
					   sfo21_obj.put("Location", "San Fransisco");
					   sfo21_obj.put("avg_temp", sfo21_temp);
					   sfo21_obj.put("date", "21");
					    if(f21sfo.size()>0) {  sfo21_obj.put("min", mm(f21sfo).get(0));}
					    if(f21sfo.size()>0) {  sfo21_obj.put("max", mm(f21sfo).get(1));}
					    
					    
					    sfo22_obj.put("Location", "San Fransisco");
					    sfo22_obj.put("avg_temp", sfo22_temp);
					    sfo22_obj.put("date", "22");
					    if(f22sfo.size()>0) {   sfo22_obj.put("min", mm(f22sfo).get(0));}
					    if(f22sfo.size()>0) {   sfo22_obj.put("max", mm(f22sfo).get(1));}
					    
					    sfo23_obj.put("Location", "San Fransisco");
					    sfo23_obj.put("avg_temp", ny23_temp);
					    sfo23_obj.put("date", "23");
					    if(f23sfo.size()>0) {   sfo23_obj.put("min", mm(f23sfo).get(0));}
					    if(f23sfo.size()>0) {   sfo23_obj.put("max", mm(f23sfo).get(1));}
					    
					    sfo24_obj.put("Location", "San Fransisco");
					    sfo24_obj.put("avg_temp", sfo24_temp);
					    sfo24_obj.put("date", "24_");
					    if(f24sfo.size()>0) {   sfo24_obj.put("min", mm(f24sfo).get(0));}
					    if(f24sfo.size()>0) {  sfo24_obj.put("max", mm(f24sfo).get(1));}
				    
					    seattle18_obj.put("Location", "Seattle");
					    seattle18_obj.put("avg_temp", seattle18_temp);
					    seattle18_obj.put("date", "18");
					    seattle18_obj.put("min", mm(f18seattle).get(0));
					    seattle18_obj.put("max", mm(f18seattle).get(1));
					    
					    seattle19_obj.put("Location", "Seattle");
					    seattle19_obj.put("avg_temp", seattle19_temp);
					    seattle19_obj.put("date", "19");
					    seattle19_obj.put("min", mm(f19seattle).get(0));
					    seattle19_obj.put("max", mm(f19seattle).get(1));
						    
					    seattle20_obj.put("Location", "Seattle");
					    seattle20_obj.put("avg_temp", seattle20_temp);
					    seattle20_obj.put("date", "20");
						   if(f20seattle.size()>0) {  seattle20_obj.put("min", mm(f20seattle).get(0)); }
						   if(f20seattle.size()>0) {  seattle20_obj.put("max", mm(f20seattle).get(1)); }
						    
						   seattle21_obj.put("Location", "Seattle");
						   seattle21_obj.put("avg_temp", seattle21_temp);
						   seattle21_obj.put("date", "21");
						    if(f21seattle.size()>0) {  seattle21_obj.put("min", mm(f21seattle).get(0));}
						    if(f21seattle.size()>0) {  seattle21_obj.put("max", mm(f21seattle).get(1));}
						    
						    
						    seattle22_obj.put("Location", "Seattle");
						    seattle22_obj.put("avg_temp", seattle22_temp);
						    seattle22_obj.put("date", "22");
						    if(f22seattle.size()>0) {   seattle22_obj.put("min", mm(f22seattle).get(0));}
						    if(f22seattle.size()>0) {   seattle22_obj.put("max", mm(f22seattle).get(1));}
						    
						    seattle23_obj.put("Location", "Seattle");
						    seattle23_obj.put("avg_temp", seattle23_temp);
						    seattle23_obj.put("date", "23");
						    if(f23seattle.size()>0) {   seattle23_obj.put("min", mm(f23seattle).get(0));}
						    if(f23seattle.size()>0) {   seattle23_obj.put("max", mm(f23seattle).get(1));}
						    
						    seattle24_obj.put("Location", "Seattle");
						    seattle24_obj.put("avg_temp", seattle24_temp);
						    seattle24_obj.put("date", "24");
						    if(f24seattle.size()>0) {   seattle24_obj.put("min", mm(f24seattle).get(0));}
						    if(f24seattle.size()>0) {  seattle24_obj.put("max", mm(f24seattle).get(1));}    
				    
						    chicago18_obj.put("Location", "Chicago");
						    chicago18_obj.put("avg_temp", chicago18_temp);
						    chicago18_obj.put("date", "18");
						    chicago18_obj.put("min", mm(f18chicago).get(0));
						    chicago18_obj.put("max", mm(f18chicago).get(1));
						    
						    chicago19_obj.put("Location", "Chicago");
						    chicago19_obj.put("avg_temp", chicago19_temp);
						    chicago19_obj.put("date", "19");
						    chicago19_obj.put("min", mm(f19chicago).get(0));
						    chicago19_obj.put("max", mm(f19chicago).get(1));
							    
						    chicago20_obj.put("Location", "Chicago");
						    chicago20_obj.put("avg_temp", chicago20_temp);
						    chicago20_obj.put("date", "20");
							   if(f20chicago.size()>0) {  chicago20_obj.put("min", mm(f20chicago).get(0)); }
							   if(f20chicago.size()>0) {  chicago20_obj.put("max", mm(f20chicago).get(1)); }
							    
							   chicago21_obj.put("Location", "Chicago");
							   chicago21_obj.put("avg_temp", chicago21_temp);
							   chicago21_obj.put("date", "21");
							    if(f21chicago.size()>0) {  chicago_obj.put("min", mm(f21chicago).get(0));}
							    if(f21chicago.size()>0) {  chicago_obj.put("max", mm(f21chicago).get(1));}
							    
							    
							    chicago22_obj.put("Location", "Chicago");
							    chicago22_obj.put("avg_temp", chicago22_temp);
							    chicago22_obj.put("date", "22");
							    if(f22chicago.size()>0) {   chicago22_obj.put("min", mm(f22chicago).get(0));}
							    if(f22chicago.size()>0) {   chicago22_obj.put("max", mm(f22chicago).get(1));}
							    
							    chicago23_obj.put("Location", "Chicago");
							    chicago23_obj.put("avg_temp", chicago23_temp);
							    chicago23_obj.put("date", "23");
							    if(f23chicago.size()>0) {   chicago23_obj.put("min", mm(f23chicago).get(0));}
							    if(f23chicago.size()>0) {   chicago23_obj.put("max", mm(f23chicago).get(1));}
							    
							    chicago24_obj.put("Location", "Chicago");
							    chicago24_obj.put("avg_temp", chicago24_temp);
							    chicago24_obj.put("date", "24");
							    if(f24chicago.size()>0) {   chicago24_obj.put("min", mm(f24chicago).get(0));}
							    if(f24chicago.size()>0) {  chicago24_obj.put("max", mm(f24chicago).get(1));} 
							    
							    aus18_obj.put("Location", "Austin");
							    aus18_obj.put("avg_temp", aus18_temp);
							    aus18_obj.put("date", "18");
							    aus18_obj.put("min", mm(f18aus).get(0));
							    aus18_obj.put("max", mm(f18aus).get(1));
							    
							    aus19_obj.put("Location", "Austin");
							    aus19_obj.put("avg_temp", aus19_temp);
							    aus19_obj.put("date", "19");
							    aus19_obj.put("min", mm(f19aus).get(0));
							    aus19_obj.put("max", mm(f19aus).get(1));
								    
							    aus20_obj.put("Location", "Austin");
							    aus20_obj.put("avg_temp", aus20_temp);
							    aus20_obj.put("date", "20");
								   if(f20aus.size()>0) {  aus20_obj.put("min", mm(f20aus).get(0)); }
								   if(f20aus.size()>0) {  aus20_obj.put("max", mm(f20aus).get(1)); }
								    
								   aus21_obj.put("Location", "Austin");
								   aus21_obj.put("avg_temp", aus21_temp);
								   aus21_obj.put("date", "21");
								    if(f21aus.size()>0) {  aus21_obj.put("min", mm(f21aus).get(0));}
								    if(f21aus.size()>0) {  aus21_obj.put("max", mm(f21aus).get(1));}
								    
								    
								    aus22_obj.put("Location", "Austin");
								    aus22_obj.put("avg_temp", aus22_temp);
								    aus22_obj.put("date", "22");
								    if(f22aus.size()>0) {   aus22_obj.put("min", mm(f22aus).get(0));}
								    if(f22aus.size()>0) {   aus22_obj.put("max", mm(f22aus).get(1));}
								    
								    aus23_obj.put("Location", "Austin");
								    aus23_obj.put("avg_temp", aus23_temp);
								    aus23_obj.put("date", "23");
								    if(f23aus.size()>0) {   aus23_obj.put("min", mm(f23aus).get(0));}
								    if(f23aus.size()>0) {   aus23_obj.put("max", mm(f23aus).get(1));}
								    
								    aus24_obj.put("Location", "Austin");
								    aus24_obj.put("avg_temp", aus24_temp);
								    aus24_obj.put("date", "24_");
								    if(f24aus.size()>0) {   aus24_obj.put("min", mm(f24aus).get(0));}
								    if(f24aus.size()>0) {  aus24_obj.put("max", mm(f24aus).get(1));}
						 						    
							    
							    
							    
				/*		    
		    
		    denver_obj.put("Location", "Denver");
		    denver_obj.put("avg_temp", k1);
		    denver_obj.put("date", "2016-02-18T22:41:44Z");
		    denver_obj.put("min", mm(denver).get(0));
		    denver_obj.put("max", mm(denver).get(1));
		    
		   
		    
		    sfo_obj.put("Location", "SFO");
		    sfo_obj.put("avg_temp", k2);
		    sfo_obj.put("date", "2016-02-18T22:41:44Z");
		    sfo_obj.put("min", mm(sfo).get(0));
		    sfo_obj.put("max", mm(sfo).get(1));
		    
		    
		    seattle_obj.put("Location", "Seattle");
		    seattle_obj.put("avg_temp", k3);
		    seattle_obj.put("date", "2016-02-18T22:41:44Z");
		    seattle_obj.put("min", mm(seattle).get(0));
		    seattle_obj.put("max", mm(seattle).get(1));
		    
		    ny_obj.put("Location", "New York");
		    ny_obj.put("avg_temp", k3);
		    ny_obj.put("date", "2016-02-18T22:41:44Z");
		    ny_obj.put("min", mm(ny).get(0));
		    ny_obj.put("max", mm(ny).get(1));
		    
		    
		    aus_obj.put("Location", "Austin");
		    aus_obj.put("avg_temp", k3);
		    aus_obj.put("date", "2016-02-18T22:41:44Z");
		    aus_obj.put("min", mm(aus).get(0));
		    aus_obj.put("max", mm(aus).get(1));;
		    
		    
		    chicago_obj.put("Location", "chicago");
		    chicago_obj.put("avg_temp", k4);
		    chicago_obj.put("date", "2016-02-18T22:41:44Z");
		    chicago_obj.put("min", mm(chicago).get(0));
		    chicago_obj.put("max", mm(chicago).get(1));
		    
		    */
		    
		    la_array.add(la_obj);
		    
		    la_array.add(la18_obj);
		    la_array.add(la19_obj);
		    la_array.add(la20_obj);
		    la_array.add(la21_obj);
		    la_array.add(la22_obj); 
		    la_array.add(la23_obj);
		    la_array.add(la24_obj);
		    
		    la_array.add(sfo18_obj);
		    la_array.add(sfo19_obj);
		    la_array.add(sfo20_obj);
		    la_array.add(sfo21_obj);
		    la_array.add(sfo22_obj);
		    la_array.add(sfo23_obj);
		    la_array.add(sfo24_obj);
		    
		    la_array.add(denver18_obj);
		    la_array.add(denver19_obj);
		    la_array.add(denver20_obj);
		    la_array.add(denver21_obj);
		    la_array.add(denver22_obj);
		    la_array.add(denver23_obj);
		    la_array.add(denver24_obj);
		    
		    la_array.add(chicago18_obj);
		    la_array.add(chicago19_obj);
		    la_array.add(chicago20_obj);
		    la_array.add(chicago21_obj);
		    la_array.add(chicago22_obj);
		    la_array.add(chicago23_obj);
		    la_array.add(chicago24_obj);
		    
		    
		    la_array.add(aus18_obj);
		    la_array.add(aus19_obj);
		    la_array.add(aus20_obj);
		    la_array.add(aus21_obj);
		    la_array.add(aus22_obj);
		    la_array.add(aus23_obj);
		    la_array.add(aus24_obj);
		    
		    la_array.add(ny18_obj);
		    la_array.add(ny19_obj);
		    la_array.add(ny20_obj);
		    la_array.add(ny21_obj);
		    la_array.add(ny22_obj);
		    la_array.add(ny23_obj);
		    la_array.add(ny24_obj);
		    
		    la_array.add(seattle18_obj);
		    la_array.add(seattle19_obj);
		    la_array.add(seattle20_obj);
		    la_array.add(seattle21_obj);
		    la_array.add(seattle22_obj);
		    la_array.add(seattle23_obj);
		    la_array.add(seattle24_obj);
		    
		    la_array.add(denver_obj);
		    la_array.add(sfo_obj);
		    la_array.add(seattle_obj);
		    la_array.add(ny_obj);
		    la_array.add(aus_obj);
		    la_array.add(chicago_obj);

		    
		    
		    
		    

		    try (FileWriter file = new FileWriter("/Users/HP/Documents/file1.json")) {
				//file.write(la_obj.toJSONString());
				file.write(la_array.toJSONString());
				
				
				System.out.println("Successfully Copied JSON Object to File...");
				System.out.println("\nJSON Object: " + la_obj);
			}
		  
		  System.out.println("sunsetCount:: "+sunsetCount); 
		  
		  
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}

     }

}
