package entity;

public class Person {
    private String name;
    private String lastName;
    private String position;
    private String status;
    private double salary;

    public Person(final String name, final String lastName, final String position, final String status, final double salary) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.status = status;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(final String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" +
               name +
               '\'' +
               ", lastName='" +
               lastName +
               '\'' +
               ", position='" +
               position +
               '\'' +
               ", status='" +
               status +
               '\'' +
               ", salary=" +
               salary +
               '}';
    }
}
