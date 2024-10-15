//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //task1
        String firstName = "дмитрий";
        String middleName = "захаров";
        String lastName = "сергеевич";
        String fullName = middleName + " " + firstName + " " + lastName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //task2
        String[] names = fullName.split(" ");
        String result = "";
        for (String name : names){
            result += name.substring(0, 1).toUpperCase() + name.substring(1, name.length()) + " ";
        }
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + result.trim());
        System.out.print("\n");

        //task 3
        fullName = "Иванов Семён Семёнович";
        System.out.print("Данные Ф. И. О. сотрудника — " + fullName.replace("ё", "е"));

    }
}