package Homework8.PracticalTask1;

public class Department implements Cloneable{
    private String name;
    private Address address;

    class Address {
        String city;
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }
        public Address(Address other) {
            this.city = other.city;
            this.street = other.street;
            this.building = other.building;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }

    public Department(String name,String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        Department cloned = (Department)super.clone();
        cloned.address = new Address(this.address);
        return cloned;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
