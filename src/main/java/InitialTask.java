import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InitialTask {
	
	
    public static void main(String[] args) throws URISyntaxException, IOException {
    	
        Path path = Paths.get(InitialTask.class.getClassLoader().getResource("sample.html").toURI());

        String contents = new String(Files.readAllBytes(path));

       // System.out.println(contents);

        //Your logic goes here
        
        if(contents.contains("<title>"+Country.india+"</title>")) {
        	printCities(Country.india, Cities.india);
        }
        else if(contents.contains("<title>"+Country.nepal+"</title>")) {
        	printCities(Country.nepal, Cities.nepal);
        }
        else if(contents.contains("<title>"+Country.southkorea+"</title>")) {
        	printCities(Country.southkorea, Cities.southkorea);
        }
        else if(contents.contains("<title>"+Country.somalia+"</title>")) {
        	printCities(Country.somalia, Cities.somalia);
        }
        else if(contents.contains("<title>"+Country.vietnam+"</title>")) {
        	printCities(Country.vietnam, Cities.vietnam);
        }
        else {
        	System.out.println("Check you title !! incorrect title..\nPlease provide valid country name ");
        }

    }
    
    public static void printCities(String country, String[] cities) {
    	System.out.println("Five cities in "+country+" are\n");
    	for(String city:cities) {
    		System.out.println(city);
    	}
    }
}
