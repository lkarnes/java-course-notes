
public class NameTest {
    public static void main(String[] args)
    {
        //instantiation
        Name myName = new Name("Logan", "Daniel", "Karnes");
        Name yourName = new Name("Isa", "Diana", "Hoernig");
        Name aName = new Name("Durk");
        System.out.println("my Name:" + myName.toString());
        System.out.println(myName.getFirst());
        myName.setFirst("Lowgen");
        System.out.println(myName.toString());
        myName.setName("Loggen","Dan","Blarnes");
        System.out.println(myName.toString());
    }
}
