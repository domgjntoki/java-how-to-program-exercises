package C10;

import C08.C08Date;

public abstract class C10Employee implements C10Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final C08Date birthDate;
    
    public C10Employee(String firstName, String lastName, 
            String socialSecurityNumber, C08Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }
    
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSocialSecurityNumber(){return socialSecurityNumber;}
    public C08Date getBirthObject(){return birthDate;}
    public String getBirthDate(){return birthDate.formatoPadrao();}
   
    @Override
    public String toString(){
        return String.format("%s %s%n%s%n%s: %s", 
        getFirstName(), getLastName(), getSocialSecurityNumber(),
        "birth date", getBirthDate());
    }
}
