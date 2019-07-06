package C09;

public class C09Employee {
    private final String firstName;
    private final String lastName;
    private String socialSecurityNumber;
    public C09Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public void setSeguroSocial(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSocialSecurityNumber(){return socialSecurityNumber;}
    
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s",
    "employee", firstName, lastName,
    "social security number", socialSecurityNumber);
    }
}
