public class Person {

    protected String name;
    protected int age;

    public Person(String name, int age){
        if (name == null){
            System.out.println("Name cannot be null!");
        }
        setName(name);
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayInfo(){

        System.out.println("My names is " + name + ". I am " + age + " years old.");

    }

}
