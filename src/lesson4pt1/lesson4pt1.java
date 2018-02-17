package lesson4pt1;

public class lesson4pt1{
    public static void main(String[] args){
        Person[] list = new Person[5];

        for (int i = 0; i<5; i++){
            String s = Integer.toString(i);
            list[i] = new Person("first" + s,"last" + s, i+20, i+30);
        }
        for (int i = 0; i<5; i++){
            System.out.println("ID:" + list[i].getId());
            System.out.println("First Name:" + list[i].getFirstName());
            System.out.println("Last Name:" + list[i].getLastName());
            System.out.println("Age:" + list[i].getAge());
            System.out.println("Weight:" + list[i].getWeight());
            System.out.println("-------------------------------------------");
        }

    }
}
