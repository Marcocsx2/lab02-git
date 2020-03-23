package com.tecsup.cps.lab02_git;

public class Model_02
{
    private int id = 12345;
    private String nombre = "Jadir Hervias";
    private String especialidad = "Diseño y Desarrollo de Software";

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }
}
