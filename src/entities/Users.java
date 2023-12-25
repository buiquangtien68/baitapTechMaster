package entities;

public class Users {
    private int id;
    private static int autoId;
    private String name;
    private String phone;
    private  String email;
    private int roleId;
    private int accountBankingId;

    public Users( String name, String phone, String email, int roleId, int accountBankingId) {
        this.id = ++autoId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.roleId = roleId;
        this.accountBankingId = accountBankingId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Users.autoId = autoId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getAccountBankingId() {
        return accountBankingId;
    }

    public void setAccountBankingId(int accountBankingId) {
        this.accountBankingId = accountBankingId;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", accountBankingId=" + accountBankingId +
                '}';
    }
}
