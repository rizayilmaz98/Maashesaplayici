public class Emplooye {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Emplooye(String name,int salary, int workHours,int hireYears){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYears;
    }
    public double tax() {
        if (this.salary >= 1000) {
            return ((this.salary * 3) / 100.0);
        } else {
            return 0;
        }
    }

    public int bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        } else{
            return 0;
        }
    }
    public double raiseSalary(){
        if((2021-this.hireYear)>19){
            return (this.salary*15)/100.0 ;
        }
        else if((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
            return (this.salary*10)/100.0 ;
        }
        else if((2021-this.hireYear)<10){
            return (this.salary*5)/100.0 ;
        }
        else{
            return 0;
        }
    }
    public void print(){
        System.out.println("İsim : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+(this.salary-(bonus()-tax())));
        System.out.println("Toplam Maaş : "+(this.salary+raiseSalary()));

    }
}
