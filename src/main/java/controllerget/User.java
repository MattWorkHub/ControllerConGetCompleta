package controllerget;

public class User {
    private String nome;
    private String location;
    private String hello;

    public User(String nome, String location) {
        this.nome = nome;
        this.location = location;
    }

    public String getName() {
        return nome;
    }

    public void setNamee(String name) {
        this.nome = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
    public void sayHello(){
        hello = "Ciao " + nome + ", com'è il tempo in " + location +"?";
    }
}
