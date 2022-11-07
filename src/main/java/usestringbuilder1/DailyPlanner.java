package usestringbuilder1;
/*
We are going to do a lot of tasks today! Let's write them out.

Implement a method createDailyPlan() that takes an array of string plans and returns a string displaying our daily plans as a list.

Rules:

the list should start with the words "My plans:";
each item is preceded by a new line ("\n") and its order number in the format like "1.) ";
each item is followed by a semicolon.
For example:

plans = ["wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"]

createDailyPlan(plans) ==>
"My plans:
1.) wake up;
2.) have breakfast;
3.) go to work;
4.) solve 5 tasks from codewars;"

Hint: use StringBuilder class to complete this task.
 */
public class DailyPlanner {
    public static String createDailyPlan(String[] plans) {
    StringBuilder builder = new StringBuilder("My plans: \n");
    for (int i = 0; i < plans.length; i++) {
           builder.append(i + 1).append(".) ").append(plans[i]).append(";\n");
        }
    String result = new String(builder);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
String[] plans = new String[] {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};
    createDailyPlan(plans);
    }
}
