package factory;

public class Main {
    public static void main(String[] args) {

        Phone phone=PhoneFabric.createPhone("samsung","2000",7,6);
        System.out.println(phone);
        Phone phone1=PhoneFabric.createPhone("samsung","2000",7,6);

        System.out.println(phone.hashCode());
        System.out.println(phone1.hashCode());
    }

}
