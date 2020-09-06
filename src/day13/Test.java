package day13;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Владимир");
        User user2 = new User("Олег");
        User user3 = new User("Станислав");

        user1.sendMessage(user2, "Привет.");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет.");
        user2.sendMessage(user1, "Всё отлично.");
        user2.sendMessage(user1, "Как твои?");

        user3.sendMessage(user1, "Здравствуйте.");
        user3.sendMessage(user1, "Подскажите, пожалуйста");
        user3.sendMessage(user1, "Где можно приобрести ваш товар?");
        user3.sendMessage(user1, "Буду благодарен.");

        user1.sendMessage(user3, "Здравствуйте.");
        user1.sendMessage(user3, "По данному вопросу вы можете позвонить по телефону +7124789456.");
        user1.sendMessage(user3, "Надеюсь мы сможем вам помочь.");

        MessageDatabase.showDialog(user1, user3);

    }
}
