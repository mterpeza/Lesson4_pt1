package lesson4pt1;

interface Weighable{
    public void addWeight(double pounds);
    public void loseWeight(double pounds);
}

class Person implements Weighable{

    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    public static int id = 0;

    public Person(){
        firstName = "Unknown";
        lastName = "Unknown";
        age = 0;
        weight = 0;
        id++;
    }
    public Person(String f, String l, int a, double w){
        firstName = f;
        lastName = l;
        age = a;
        weight = w;
        id++;
    }
    public static int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public void addWeight(double a){
        weight = weight + a;
    }
    public void loseWeight(double a){
        weight = weight - a;
    }

}