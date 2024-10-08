package clasesobjetos;

public class Estudiante {
    private String nombre;
    private float notaParcial, notaParcial2, notaFinal;
    
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, float np1, float np2) {
        this.nombre = nombre;
        this.notaParcial = np1;
        this.notaParcial2 = np2;
    }

    public void asignarNotaParcial1(float np1) {
        this.notaParcial = np1;
    }

    public void asignarNotaParcial2(float np2) {
        this.notaParcial2 = np2;
    }

    public float obtenerNotaParcial1() {
        return notaParcial;
    }

    public float obtenerNotaParcial2() {
        return notaParcial2;
    }

    public void calcularNotaFinal() {
        notaFinal = (notaParcial + notaParcial2) / 2;
    }

    public float obtenerNotaFinal() {
        return notaFinal;
    }

    public String obtenerMensaje() {
        if(notaFinal <= 3) {
            return "Reprobo";
        }else {
            return "Aprobo";
        }
    }



}
