package dat.sem2.randomdanes;

/**
 * The purpose of this class is is to represent contact persons
 * @author kasper
 */
class Person {
    private final String navn;
    private final String phone;

    public Person(String name, String phoneNo) {
        this.navn = name;
        this.phone = phoneNo;
    }

    public String getName() {
        return navn;
    }

    public String getPhoneNo() {
        return phone;
    }

    @Override
    public String toString() {
        return navn + " ph: " + phone;
    }
    
}
