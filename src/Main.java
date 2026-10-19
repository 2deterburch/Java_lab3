
abstract class Notification {
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public abstract String formatText();
}

class Email extends Notification {
    public Email(String message) {
        super(message);
    }

    @Override
    public String formatText() {
        return "Email: Шановний користувачу! " + message;
    }
}

class SMS extends Notification {
    public SMS(String message) {
        super(message);
    }

    @Override
    public String formatText() {
        return "SMS: " + message;
    }
}

class Push extends Notification {
    public Push(String message) {
        super(message);
    }

    @Override
    public String formatText() {
        return "Push: Нове сповіщення! " + message;
    }
}

public class Main {
    public static void main(String[] args) {
        Notification[] notifications = {
                new Email("Ваше замовлення підтверджено."),
                new SMS("Ваш код: 1234."),
                new Push("Ви отримали нове повідомлення.")
        };

        for (Notification notification : notifications) {
            System.out.println(notification.formatText());
        }
    }
}
