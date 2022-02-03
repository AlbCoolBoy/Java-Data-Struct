package JavaSE.反射;

public class User {
    public int number;
    private String name;
    protected String sex;
    private int id_number;
    private String bitrh_date;
    public int age;


    public User(){

    }

    public User(int number, String name, String sex, int id_number, String bitrh_date, int age) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.id_number = id_number;
        this.bitrh_date = bitrh_date;
        this.age = age;
    }

    public void run(int number, String name){
        System.out.println("running");
    }
}
