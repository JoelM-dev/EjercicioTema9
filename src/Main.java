public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       Trabajador trabajador = new Trabajador();

       cliente.nombre = "Joel";
       cliente.edad = 22;
       cliente.telefono = 341456543;
       cliente.credito = 135;
       System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años, mi telefono es " + cliente.telefono + " y mi credito disponible es " + cliente.credito + "$");

       trabajador.nombre = "Gastón";
       trabajador.edad = 34;
       trabajador.telefono = 341567894;
       trabajador.salario = 14000;
       System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi telefono es " + trabajador.telefono + " y mi salario anual es " + trabajador.salario + "$");
    }
}

class Persona{
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}