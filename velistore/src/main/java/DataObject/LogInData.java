package DataObject;

import com.github.javafaker.Faker;

public interface LogInData {
Faker faker = new Faker();
    String
           incorrectEmailData = "salomest@sh.com",
            incorrectPasswordData = "qwe12345",

            correctEmailData = "salomemadridista@gmail.com",
            correctPasswordData = "Qwerty1996" ,
                    fakeEmail = faker.bothify("?????#@gmail.com"),


    expectedResult = "Not Logged in ";

}
