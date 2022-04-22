package models;

import java.util.UUID;

public class Bank_Card {

    String number;
    User user;

    public Bank_Card(User user) {
        this.number = String.valueOf(UUID.randomUUID());
        this.user = user;
    }

    public Bank_Card() {
    }

    public String getNumber() {
        return number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bank_Card{" +
                "number='" + number + '\'' +
                ", user=" + user +
                '}';
    }
}
