public class Main {
    public static void main(String[] args) {
        System.out.println("Task1:");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Task2:");

        String fullNameToReport = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameToReport);

        System.out.println("Task3:");

        String fullNameNotFormatted = "Иванов Семён Семёнович";

        fullName = fullNameNotFormatted.replace("Ё", "Е");
        fullName = fullNameNotFormatted.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

    }
}