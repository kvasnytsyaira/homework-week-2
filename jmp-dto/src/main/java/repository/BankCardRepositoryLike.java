package repository;

import models.Bank_Card;
import models.DebitBankCard;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class BankCardRepositoryLike {
    private final List<Bank_Card> cards;

    public BankCardRepositoryLike() {
        this.cards = init();
    }

    public List<Bank_Card> getAllBankCards() {
        return cards;
    }

    public Bank_Card createBankCard(Bank_Card newCard) {
        cards.add(newCard);
        return newCard;
    }

    public void deleteBankCard(Bank_Card oldCard) {
        cards.remove(oldCard);
    }


    private List<Bank_Card> init() {
        UserRepositoryLike userRepositoryLike = new UserRepositoryLike();
        List<User> users = userRepositoryLike.getUsers();

        List<Bank_Card> cards = new ArrayList<>();
        cards.add(new Bank_Card(users.get(0)));
        cards.add(new Bank_Card(users.get(1)));
        cards.add(new Bank_Card(users.get(2)));
        cards.add(new Bank_Card(users.get(3)));
        cards.add(new DebitBankCard(users.get(4)));
        cards.add(new Bank_Card(users.get(5)));
        cards.add(new Bank_Card(users.get(6)));
        return cards;
    }


}
