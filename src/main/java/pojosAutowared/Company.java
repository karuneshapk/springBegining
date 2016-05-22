package pojosAutowared;


import pojosAutowared.annotation.AutowaredCompany;

/**
 * Created by user on 17.05.2016.
 */
@AutowaredCompany
public class Company implements IAddress{

    private Long id;
    private String street;

    public Company(Long id, String street) {
        this.id = id;
        this.street = street;
    }

    public Company() {

    }

    public String getStreet() {
        System.out.println(street);
        return street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
