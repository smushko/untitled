package homeworks.lesson9.task6;

public class User {
    //User, содержащий логин, пароль и объект класса Basket
    String loginUser, passwordUser;
    Basket basketUser;



    public User(String loginUser, String passwordUser, Basket basketUser) {
        this.loginUser = loginUser;
        this.passwordUser = passwordUser;
        this.basketUser = basketUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public Basket getBasketUser() {
        return basketUser;
    }

    public void setBasketUser(Basket basketUser) {
        this.basketUser = basketUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!loginUser.equals(user.loginUser)) return false;
        if (!passwordUser.equals(user.passwordUser)) return false;
        return basketUser.equals(user.basketUser);
    }

    @Override
    public int hashCode() {
        int result = loginUser.hashCode();
        result = 31 * result + passwordUser.hashCode();
        result = 31 * result + basketUser.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginUser='" + loginUser + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                ", basketUser=" + basketUser +
                '}';
    }
}
