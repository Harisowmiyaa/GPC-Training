class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
// Single Inheritance
class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);  
    }

    public void manage() {
        System.out.println(name + " is managing the team.");
    }
}

// Multiple Inheritance
interface Skill {
    void coding();
}

class Developer extends Employee implements Skill {
    public Developer(String name, int id) {
        super(name, id); 
    }

    public void coding() {
        System.out.println(name + " is coding.");
    }
}

// Multilevel Inheritance
class SeniorDeveloper extends Developer {
    public SeniorDeveloper(String name, int id) {
        super(name, id);  
    }

    public void mentor() {
        System.out.println(name + " is mentoring junior developers.");
    }
}

// Hierarchical Inheritance
class Analyst extends Employee {
    public Analyst(String name, int id) {
        super(name, id); 
    }

    public void analyze() {
        System.out.println(name + " is analyzing data.");
    }
}

// Hybrid Inheritance
class TeamLead extends Manager implements Skill {
    public TeamLead(String name, int id) {
        super(name, id); 
    }

    public void coding() {
        System.out.println(name + " is coding as a team lead.");
    }

    public void lead() {
        System.out.println(name + " is leading the team.");
    }
}

public class exInheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Manager manager = new Manager("ram", 101);
        manager.display();
        manager.manage();
        System.out.println();

        // Multiple Inheritance
        Developer developer = new Developer("gowtham", 102);
        developer.display();
        developer.coding();
        System.out.println();

        // Multilevel Inheritance
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper("nithish", 103);
        seniorDeveloper.display();
        seniorDeveloper.coding();
        seniorDeveloper.mentor();
        System.out.println();

        // Hierarchical Inheritance
        Analyst analyst = new Analyst("hari", 104);
        analyst.display();
        analyst.analyze();
        System.out.println();

        // Hybrid Inheritance
        TeamLead teamLead = new TeamLead("priya", 105);
        teamLead.display();
        teamLead.manage();
        teamLead.coding();
        teamLead.lead();
    }
}