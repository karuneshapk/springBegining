import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 05.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        // TODO: context-xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
//        pojos.Person person = (pojos.Person)context.getBean("person");
//        person.getStreetPerson();

        // TODO: context-Annotation
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
//        pojosAnnotation.Person person = (pojosAnnotation.Person)context.getBean("person");
//        person.getInformation();


//        // TODO: context-xml-byName
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml-byName.xml");
//        pojosByNameByType.Person person = (pojosByNameByType.Person)context.getBean("person");
//        person.getStreetPerson();

        // TODO: context-xml-byTypePrimary
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml-byTypePrimary.xml");
//        pojosByNameByType.Person person = (pojosByNameByType.Person)context.getBean("person");
//        person.getStreetPerson();

         // TODO: context-xml-byTypeCandidate
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml-byTypeCandidate.xml");
//        pojosByNameByType.Person person = (pojosByNameByType.Person)context.getBean("person");
//        person.getStreetPerson();

         // TODO: context-xml-byConstructor(with primary or autowire-candidate
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml-byConstructor.xml");
//        pojosByConstructor.Person person = (pojosByConstructor.Person)context.getBean("person");
//        person.getStreetPerson();

        // TODO: context-@autowared
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-autowared.xml");
//        pojosAutowared.Person person = (pojosAutowared.Person)context.getBean("person");
//        person.getStreetPerson();

        // TODO: context-@Inject
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-inject.xml");
//        pojosInject.Person person = (pojosInject.Person)context.getBean("person");
//        person.getStreetPerson();

        // TODO: context-AOP
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-AOP.xml");
        pojosAOP.Person person = (pojosAOP.Person)context.getBean("proxy");
        person.getStreetPerson();

        System.out.println("=============================================");

        try {
            person.getStreetPersonWithException();
        } catch (Exception e) {
        }

    }

}
