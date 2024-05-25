package Estructura;

import java.util.ArrayList;

public abstract class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Departamento(String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public abstract void trabajar();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
