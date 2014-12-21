package CobaUnit;
public class Hello {
    public Hello() {

    }    
    public String sayHello(String name) {
      {
        String out;
        if (name == null || name.equals("")) {
            out = "Please input your name!";
        } else {
            out = "Hello, " + name + "!";
        }
        return out;
    }

    }
}
