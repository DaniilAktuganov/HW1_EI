package homework.homework2;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String city;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getGender(String gender) {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    public String getCity(String city) {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    @Override
    public boolean equals (Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person guest = (Person) obj;
        return (name == guest.name || (name != null && name.equals(guest.getName()))) &&
                age == guest.age;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
