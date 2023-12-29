package software.ulpgc.kata1;

public class Main {
    public static void main(String[] args) {
        Person juan = new Person("Juan", "Hernández");
        Person pepe = new Person("Pepe", "Ramírez");
        System.out.println(juan.initials());
        System.out.println(pepe.initials());
    }
}
