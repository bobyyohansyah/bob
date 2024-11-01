public class Employee implements calculateBonus {
    private static final double BONUS_RATE = ;
    private String name;
    private int id;
    private double salary;
    private String department;

    public Employee(String name, int id, double salary, String department) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
        this.setDepartment(department);
    }
    public void printDetails() {
        System.out.println("Employee ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment());
    }

    public void applyBonus() {
        double bonus = getSalary() * BONUS_RATE;
        setSalary(getSalary() + bonus);
        System.out.println("Bonus applied! New salary: " + getSalary());
    }

    public void updateDepartment(String newDepartment) {
        setDepartment(newDepartment);
        System.out.println("Department updated to: " + getDepartment());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Project {
    public String projectName;
    public String projectDeadline;
    public Employee projectLeader;
    public double budget;

    public Project(String projectName, String projectDeadline, Employee projectLeader, double budget) {
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
        this.projectLeader = projectLeader;
        this.budget = budget;
    }

    public void printProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Deadline: " + projectDeadline);
        System.out.println("Budget: " + budget);
        projectLeader.printDetails();
    }

    public void updateBudget(double newBudget) {
        budget = newBudget;
        System.out.println("Budget updated to: " + budget);
    }
}

class Client {
    public String clientName;
    public String clientEmail;
    public Project project;

    public Client(String clientName, String clientEmail, Project project) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.project = project;
    }

    public void printClientDetails() {
        System.out.println("Client Name: " + clientName);
        System.out.println("Client Email: " + clientEmail);
        project.printProjectDetails();
    }
}

class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("John Cena WWE", 666, 10000, "WWE RAW");
        Project proj = new Project("WWE Development", "2025-02-22", emp, 1000000);
        Client client = new Client("RAW Corp", "contact@RAW.com", proj);

        client.printClientDetails();
        emp.applyBonus();
        emp.updateDepartment("Smackdown");
        proj.updateBudget(1200000);
    }
}