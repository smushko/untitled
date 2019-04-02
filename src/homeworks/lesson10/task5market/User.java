package homeworks.lesson10.task5market;

import java.util.Objects;

public class User {
    private String nickName;
    private String password;

    public User(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return nickName.equals(user.nickName) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
