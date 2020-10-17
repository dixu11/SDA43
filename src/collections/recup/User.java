package collections.recup;

public class User implements Comparable<User>{
    private String email;

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(User otherUser) {
        int result = email.length() - otherUser.email.length();
        if (result == 0) {
            result = email.compareTo(otherUser.email);
        }
        return result;
    }
}
