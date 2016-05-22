package pojosAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by user on 05.05.2016.
 */
@Service("personA")
public class Person {

    @Value("1")
    private Integer id;

    @Value("10")
    private Integer age;

    @Value("Niki")
    private String name;

    @Value("lauda")
    private String surname;


    private IAddress address;

    public Person(Integer id, Integer age, String name,
                            String surname, IAddress adress) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person() {

    }

    public void getInformation() {
        System.out.println("usint by annotation");
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


    public IAddress getAdress() {
        return address;
    }


    @Autowired
    public void setAdress(IAddress address) {
        this.address = address;
    }
}
