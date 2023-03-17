import java.util.*;

public class Main {
    public static void main(String[] args) {

        String jsonInput = "{\"key1\": \"value1\", \"key2\": \"value2\", \"key3\": \"value3\", \"key4\": \"value4\", \"key5\": \"value5\"}";

        try {

            ArrayList<String> keys = new ArrayList<>();
            ArrayList<String> values = new ArrayList<>();

            jsonInput = jsonInput.substring(1, jsonInput.length() - 1); // remove curly braces from input
            String[] pairs = jsonInput.split(", ");

            for(String pair : pairs) {
                String[] keyValue = pair.split(": ");
                String key = keyValue[0].replaceAll("\"", "");
                keys.add(key);
                String value = keyValue[1].replaceAll("\"", "");
                values.add(value);
            }

            int spacer = 0;
            for (int i = 0; i < keys.size(); i++){

                if (spacer == 3){
                    System.out.println();
                    spacer = 0;
                }

                if(i == 0)
                    System.out.print("First Key: " + keys.get(i) + ", Value" + ": " + values.get(i) + ",\t\t");
                else if(i == 1)
                    System.out.print("Second Key: " + keys.get(i) + ", Value" + ": " + values.get(i) + ",\t\t");
                else if(i == 2)
                    System.out.print("Third Key: " + keys.get(i) + ", Value" + ": " + values.get(i) + ",\t\t");
                else
                    System.out.print(i+1 + "th Key: " + keys.get(i) + ", Value" + ": " + values.get(i) + ",\t\t");

                spacer++;

            }
        }
        catch(Exception e) {
            System.out.println("Invalid JSON input.");
        }
    }
}