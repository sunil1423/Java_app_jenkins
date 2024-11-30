public abstract class employee {
    String name;
    double basesalary;

    abstract void calsalary();
    abstract void work();

    abstract void addBonus(double bonus);



    employee(String name,double basesalary){
        this.name=name;
        this.basesalary=basesalary;

    }
}
class manager extends employee{
    @Override
    void calsalary() {
        System.out.println("current salary: "+basesalary);

    }

    @Override
    void work() {
        System.out.println(name+" "+"is the manager who is managing the team");

    }

    @Override
    void addBonus(double bonus) {
        System.out.println("new salary");

    }

    manager(String name, double basesalary){
        super(name,basesalary);

    }
}
class developer extends employee{
    developer(String name, double basesalary) {
        super(name, basesalary);
    }

    @Override
    void calsalary(){
        System.out.println(basesalary+" "+" the base of the developer");

    }
    @Override
    void work(){
        System.out.println(name+" "+"is the developer who is writting the code");

    }
    @Override
    void addBonus(double bonus){
        System.out.println("basesalary including bonus");
    }
}
class test{
    public static void main(String[] args) {
        manager m1 = new manager("ritesh",4500000.0);
        m1.calsalary();
        m1.work();
        m1.addBonus(50000.0);
        developer d1= new developer("Sunil",54000);
        d1.calsalary();
        d1.work();
        d1.addBonus(2000);
    }
}

