package layer;

import models.BankCardType;
import models.Bank_Card;
import models.User;

public interface Bank {
    Bank_Card createBankCard(User user, BankCardType bankCardType);
}
