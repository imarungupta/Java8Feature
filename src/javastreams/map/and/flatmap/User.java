package javastreams.map.and.flatmap;

import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private String phone;
    private List<String> email;

    public User() {
    }

    public User(String name, String phone, List<String> email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && phone.equals(user.phone) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public List<String> getEmail() {
        return email;
    }
    public void setEmail(List<String> email) {
        this.email = email;
    }
}
