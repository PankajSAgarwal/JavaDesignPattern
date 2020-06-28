package playground;

public class Employee {

    private final String jobTitle;
    private final Address address;

    public Employee(String jobTitle, Address address) {
        this.jobTitle = jobTitle;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Employee{jobTitle=%s,address=%s",
                jobTitle,address);
    }

    public StringBuilder append(StringBuilder sb){
        sb.append("Employee{jobTitle=").append(jobTitle);
        sb.append(",address=");
        address.append(sb);
        sb.append("}");
        return sb;


    }
}
