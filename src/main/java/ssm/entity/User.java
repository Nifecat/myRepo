package ssm.entity;

import java.sql.Date;

public class User {

    private String userEmail;
    private String userPassword;
    private String userName;
    private String userPictureUrl;
    private int userSex;
    private Date userBirthday;

    public User() {
    }


    public User(String userEmail, String userPassword, String userName, String userPictureUrl, int userSex, Date userBirthday) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userPictureUrl = userPictureUrl;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
    }

    public User(String userEmail, String userPassword, String userName, String userPictureUrl) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userPictureUrl = userPictureUrl;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPictureUrl() {
        return userPictureUrl;
    }

    public void setUserPictureUrl(String userPictureUrl) {
        this.userPictureUrl = userPictureUrl;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userPictureUrl='" + userPictureUrl + '\'' +
                ", userSex=" + userSex +
                ", userBirthday=" + userBirthday +
                '}';
    }
}
