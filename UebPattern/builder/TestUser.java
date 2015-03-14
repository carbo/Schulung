package UebPattern.builder;

public class TestUser {
    public static void main(String[] args) {
        User user = new User.UserBuilder("carsten").setAge(30).setEmail("carsten@example.com").build();
        System.out.println(user);
    }

}
