package DataObject;

import com.github.javafaker.Faker;

public interface SearchData {

     Faker faker = new Faker();
     String
    incorrectSearchData = "andadadada",
     fakeSearchData= faker.lorem().word(),
    correctSearchData = "PYLONES";
}
