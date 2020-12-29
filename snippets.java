import java.util.Arrays;
import java.util.stream.Collectors;

//use regex to identify valid strings with a variable length and multiple valid characters at each index
  public static int countSmileys(List<String> arr) {
      return (int) arr.stream()
        .filter(e -> e.matches("[:;][-~]?[\\)D]"))
        .count();
  }

//Take an array of strings and manipulate individual characters using substrings
return Arrays.stream(phrase.split(" "))
                   .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                   .collect(Collectors.joining(" "));


//Process an array of pairs of strings into separate lists 

List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                              .map(name -> name.split(" "))
                              .collect(Collectors.toList());
