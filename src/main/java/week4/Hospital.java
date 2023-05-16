package week4;

public class Hospital {
    String name;
    String zipcode;
    Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getzipcode() {
        return zipcode;
    }

    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Hospital(String name, String zipcode, Address address){
        this.name = name;
        this.zipcode = zipcode;
        this.address = address;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", name, zipcode, address.toString());
    }

}
