import java.util.Objects;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        User user = (User) obj;
        return age == user.age && Objects.equals(name, user.name);
    }
}

class SecondUser {
    private String name;
    private int age;

    public SecondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class UserComparison {
    public static void main(String[] args) {
        User user1 = new User("John", 25);
        User user2 = new User("John", 25);
        SecondUser secondUser1 = new SecondUser("John", 25);
        SecondUser secondUser2 = new SecondUser("John", 25);

        System.out.println("User objects:");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println("user1 equals user2: " + user1.equals(user2));

        System.out.println("\nSecondUser objects:");
        System.out.println(secondUser1);
        System.out.println(secondUser2);
        System.out.println("secondUser1 equals secondUser2: " + secondUser1.equals(secondUser2));
    }
}
