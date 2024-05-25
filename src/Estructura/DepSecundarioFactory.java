package Estructura;

public class DepSecundarioFactory implements DepartamentoFactory{
    public Departamento crearDepartamento(String nombre, String superior) {
        return new DepartamentoSecundario(nombre, superior);
    }

    @Override
    public Departamento crearDepartamento(String nombre) {
        return new DepartamentoSecundario(nombre);
    }
}
