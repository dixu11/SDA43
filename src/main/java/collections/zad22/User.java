package collections.zad22;

import java.util.Objects;

public class User {
    private String email;
    private String password;
    private int points;
    private Role role;

    public User(String email, String password, int points, Role role) {
        this.email = email;
        this.password = password;
        this.points = points;
        this.role = role;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        points = 0;
        role = Role.CLIENT;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", points=" + points +
                ", role=" + role +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public void addPoints(int points) {
        this.points += points;
    }
}
