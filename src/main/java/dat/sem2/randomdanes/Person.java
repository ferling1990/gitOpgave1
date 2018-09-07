package dat.sem2.randomdanes;

/**
 * The purpose of this class is is to represent contact persons
 * @author kasper
 */
class Person {
    private final String hejsa;
    private final String phone;

    public Person(String name, String phoneNo) {
        this.hejsa = name;
        this.phone = phoneNo;
    }

    public String getName() {
        return hejsa;
    }

    public String getPhoneNo() {
        return phone;
    }

    @Override
    public String toString() {
        return hejsa + " ph: " + phone;
    }
    
}
