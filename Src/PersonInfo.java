public class PersonInfo {
    public static void main (String [] args){
        Person.personInfoStatic("Will","Smith", "New York", "2936729462846");
        Person.personInfoStatic("Jackie","Chan", "Shanghai", "12312412412");
        Person.personInfoStatic("Sherlock","Holmes", "London", "37742123513");
        System.out.println("Статичний метод");

        Person person = new Person();
        person.personInfo("Will","Smith", "New York", 2936729462846L);
        person.personInfo("Jackie","Chan", "Shanghai", 12312412412L);
        person.personInfo("Sherlock","Holmes", "London", 37742123513L);
        System.out.println("Не статичний метод");


    }
}
