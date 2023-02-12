package Config;
import net.datafaker.Faker;


import java.util.Locale;

public class GenerateUser {
    Faker faker = new Faker(new Locale("ru"));

    public GenerateUser() {
    }

    public String name() {
        return faker.name().firstName();
    }

    public String surname() {
        return faker.name().lastName();
    }

    public String address() {
        return faker.address().streetAddress();
    }

    public String phoneNumber() {
        return faker.phoneNumber().subscriberNumber(11);
    }

    public String comment() {
        return faker.toString();
    }
}
