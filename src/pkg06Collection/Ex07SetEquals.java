package pkg06Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex07SetEquals {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Person("Foo","male"));
        set.add(new Person("Foo","male"));
        set.add(10);
        set.add("hello world");
        System.out.println(set);
    }
}


class Person {
    String name, gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "/" + gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return name.equals(p.name) && gender.equals(p.gender);
        }
        return false;
    }
}

