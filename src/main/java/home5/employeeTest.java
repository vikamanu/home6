package home5;

import java.util.Arrays;

public class employeeTest {
    public static void main(String[] args) {
        home55[] employees = new home55[5];


        employees[0] = new home55(
                "Ivanov Oleg",
                "manager",
                "ivanovo@mail.ru",
                "+74956677787",
                42,
                120000

        );

        employees[1] = new home55(
                "Nikitin Ivan",
                "manager",
                "nikitini@mail.ru",
                "+74956699787",
                32,
                140000
        );
        employees[2] = new home55(
                "Pavlova Olga",
                "manager",
                "pavlovao@mail.ru",
                "+74956677897",
                41,
                180000
        );
        employees[3] = new home55(
                "Ionov Stepan",
                "staff manager",
                "ionovs@mail.ru",
                "+74959897787",
                28,
                130000
        );
        employees[4] = new home55(
                "Ivanova Anna",
                "director",
                "ivanovaa@mail.ru",
                "+74956665487",
                39,
                220000
        );


        for (home55 employee : employees) {
            

            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
