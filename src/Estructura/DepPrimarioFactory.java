package Estructura;

public class DepPrimarioFactory implements DepartamentoFactory {

    @Override
    public Departamento crearDepartamento(String nombre) {
        return new DepartamentoPrimario(nombre);
    }
}
