package Estructura;

public class DepartamentoSecundario extends Departamento{
    private String superior;

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    public DepartamentoSecundario(String nombre, String superior) {
        super(nombre);
        this.superior = superior;
    }

    public DepartamentoSecundario (String nombre){
        super(nombre);
    }

    @Override
    public void trabajar() {
        System.out.println("Realizar tareas y responder a " + superior);
    }
}
