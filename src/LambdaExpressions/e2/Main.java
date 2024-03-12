package LambdaExpressions.e2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static <T,S> List<T> create(List<S> src, Filter<S> f, Transformer<T,S> t){
        List<T> target = new ArrayList<>();
        for(S e : src){
            if(f.test(e)){
                target.add(t.transform(e));
            }
        }
        return target;
    }

    static <S> void change(List<S> list, Filter<S> f, Modifier <S> mod){
        for(S e : list){
            if(f.test(e)){
                mod.modify(e);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,3,5,10,9,12,7);
        List<String> txt = Arrays.asList("ala", "ma", "kota", "aleksandra", "psa", "azora");
        List<Employee> emp = Arrays.asList(
                new Employee("Kowalski", "Jan", 34, 3200),
                new Employee("As", "Ala", 54, 4200),
                new Employee("Kot", "Zofia", 27, 3800),
                new Employee("Puchacz", "Franek", 41, 3600)
        );

        System.out.println(
                create(num, n -> n % 2 != 0, n -> n * 100)
        );

        List<Employee> employeesToRaise =
                create(emp,
                    e -> e.getAge() > 30 && e.getSalary() < 4000,
                    e -> e
                );

        System.out.println("Employees to receive a raise: ");
        System.out.print(employeesToRaise);

        List<Double> employeesSalaries =
                create(emp,
                        e -> true,
                        e -> e.getSalary()
                );
        System.out.println(employeesSalaries);

        List<String> oldEmployees =
                create(emp,
                        e -> e.getAge() > 30,
                        Employee::getLname

                );
        System.out.println(oldEmployees);

        List<Employee> emps = Arrays.asList(
                new Employee("Kowal", "Jan", 34, 34000.0),
                new Employee("Kedziry", "Pawel", 64, 30000.0),
                new Employee("Wojtaszek", "Piotr", 42, 100000.0),
                new Employee("Zarazem", "Zbigniew", 21, 12800.0),
                new Employee("Kowalczyk", "Bartosz", 33, 5100.0)
        );
        change(emps,
                e -> e.getAge() < 50 && e.getSalary() < 15000,
                e -> e.setSalary(e.getSalary() + 2000)

        );

        for(Employee e : emps){
            System.out.println(e + " " + e.getSalary());
        }


        //Example 4 - Streams on Employees
        emps.stream()
                .filter(e -> e.getAge() > 30 && e.getSalary() < 20000)
                .forEach(e -> e.setSalary(e.getSalary() * 1.5));

        emps.forEach(
                e -> System.out.printf("%s %.0f\n", e, e.getSalary())
        );
    }

}
