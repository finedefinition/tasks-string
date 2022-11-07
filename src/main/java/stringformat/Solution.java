package stringformat;
/*
Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.

Для этого используй метод String.format().

Требования:
•	Нужно, чтобы метод format(String, int) использовал метод String.format().
•	Нужно, чтобы метод format(String, int) возвращал строку согласно условию задачи.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
        System.out.println(format("Ivan", 30000));
    }

    public static String format(String name, int salary) {
        String s = String.format( "Меня зовут %s. Я буду зарабатывать %d$ в месяц.", name, salary);
        return s;
    }
}
