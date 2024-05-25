package Estructura;

public class DepartamentoPrimario extends Departamento{


    public DepartamentoPrimario(String nombre) {
        super(nombre);

    }

    @Override
    public void trabajar() {
        System.out.println("Realizar tareas y responder a CEO");
    }
}
