package javastreams.map.and.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {
public static void main(String[] args) {
    List<User> users = Stream.of(
          new User("user1","123456", Arrays.asList("a@gmail.com", "b@gmail.com")),
          new User("user2","7891011", Arrays.asList("c@gmail.com", "d@gmail.com")),
          new User("user2","07891011", Arrays.asList("e@gmail.com", "f@gmail.com"))
    ).collect(Collectors.toList());
    System.out.println(users.stream().map(User::getName).collect(Collectors.toList()));
    List<String> phone= users.stream().map(User::getPhone).collect(Collectors.toList());
    System.out.println(phone);
    // So if you want to get the all the names for the users list or if you want to get the particular info from the list
    // then we will use map. Returns a stream consisting of the results of applying the given function to the
    // elements of this stream.
    // So if we want to get the particular object value from the list object then we will use map,or if we have
    // one-to-one scenario (like one user contains only one name or phone then we will use map.
    // But if we have one-to-many scenario like one user contains list of emails then in this case we will use flatMap

    List<List<String>> userEmailList = users.stream().map(User::getEmail).collect(Collectors.toList());
    System.out.println(userEmailList);

    // In the above line of code we have used map, so it returns list of list instead of returning only list, so to get
    // only list (one user contains list of emails) let's use flatMap
    List<String> emailList = users.stream().flatMap(user -> user.getEmail().stream()).collect(Collectors.toList());
    System.out.println(emailList);

    // So if we want to fetch single element from the list object or attribute(i.e. one-to-one) then we will use map
    // But if we have scenario like one use has multiple email list i.e. one-to-many then will use flatMap
}
}
