public class HelloWorld {

    public String seyHi() {
        return "Hello World";
    }

    public String seyHi(String name) {
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
        return "Hello " + capName;
    }

}
