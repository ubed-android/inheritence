public class Employee {
    float salary=40000;

}
class Programmer extends Employee{
    int bonus=10000;
    float totalsal;
    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("programmer salary is "+p.salary);
        System.out.println("Bonus of programmer is "+p.bonus);

        p.totalsal=p.salary+p.bonus;
        System.out.println("total salary "+ p.totalsal);
    }
}
