public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary < 1000){
            return 0;
        }else {
            return this.salary * 0.03;
        }
    }
    int bonus(){
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }
    double raiseSalary(){
        if (2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        }else if (2021 -this.hireYear < 20) {
            return this.salary * 0.1;
        }else {
            return this.salary * 0.15;
        }
    }

    void employeeInfo(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Toplam Maaş : " + (this.salary + bonus() + raiseSalary()));
        System.out.println("Kesintiler ile Toplam Maaş : " + (this.salary + bonus() + raiseSalary() - tax()));
    }
}
