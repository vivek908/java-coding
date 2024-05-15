// You have an array of Person objects with attributes name, age, gender,
//  and city. Implement a Java method that takes this array and returns
//   a map where the keys are genders, and the values are lists of cities
//    where female persons older than 25 live.
// Sample data:
//Output: {Female=[New York,Amsterdam]}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
    public static void main(String[] args) {
            String[][] persons = {
        {"Alice", "28", "Female", "New York"},
        {"Bob", "22", "Male", "Los Angeles"},
        {"Charlie", "30", "Male", "Chicago"},
        {"Reena", "30", "Female", "Amsterdam"},
        {"Diana", "26", "Female", "New York"},
        {"Eva", "24", "Female", "San Francisco"}
};
Map<String,List<String>> citiesByGender=Arrays.stream(persons)
.filter(person->person[2].equalsIgnoreCase("Female") && Integer.parseInt(person[1])>25)
.collect(Collectors.groupingBy(person->person[2],Collectors
.mapping(person->person[3],Collectors.toList())));
System.out.println(citiesByGender);
    }   
}



