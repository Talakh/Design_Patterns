package behavioral.iterator.entity;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Musician {
    private String name;
    private Role role;

    public Musician(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "name: " + name + "(" + role + ")";
    }
}
