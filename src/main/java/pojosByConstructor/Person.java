package pojosByConstructor;

/**
 * Created by user on 05.05.2016.
 */
public class Person {

    private Integer id;

    private Integer age;
    private String name;
    private String surname;
    private IAddress address;

    public Person (Integer id, Integer age, String name,
                   String surname, IAddress adress) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }


    public Person(IAddress address) {
        this.address = address;
    }

    public Person() {

    }

    public String getStreetPerson() {
        return address.getStreet();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public IAddress getAddress() {
        return address;
    }

    public void setAddress(IAddress address) {
        this.address = address;
    }
}
