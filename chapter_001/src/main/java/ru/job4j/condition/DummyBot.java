package ru.job4j.condition;

/**
 * @author Glyazev Ramil drones2024@mail.ru
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос клиента.
     * @return Ответ.
     */

    public String answer(String question) {
        String rs1 = "Это ставит меня в тупик. Спросите другой вопрос.";

        if (question.equals("Привет, Бот.")) {
            rs1 = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            rs1 = "До скорой встречи.";
        }

        return rs1;
    }
}
