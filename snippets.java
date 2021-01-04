import java.util.Arrays;
import java.util.stream.Collectors;


//code to split a long string around a huge number of variables, remove a set of variables, then ensure each has more than apostrophes in it
 Map<String, Long> map = Arrays.stream(s.split("\\p{javaWhitespace}+|[\\p{P}&&[^\u0027]]"))
        .map(str -> str.replaceAll("[\\n\\s+\\p{P}&&[^\u0027]]","").toLowerCase())
        .filter(str -> str.length() > 0)
        .filter(str -> !str.matches("(')+"))
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    

//sort a result of map entries by set and limit the number returned
    List<String> result = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(3)
        .map(e -> e.getKey())
        .collect(Collectors.toList());


//First line allows you to compare the first three elements of an array to determine the commonalities
 int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

  //Parallel call here for filtering of a single odd one out element
        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }

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
