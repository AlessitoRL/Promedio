public class Promedio {

    private final String nombre;

    private final double[] calificaciones;

    public Promedio(String nombre, double[] calificaciones){
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma= 0;
        for (double calificacion : calificaciones){
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
    public char obtenercalificaciones(double Promedio){
        if (Promedio<= 50){
            return 'F';
        } else if (Promedio<= 60) {
            return 'E';
        } else if (Promedio<= 70) {
            return 'D';
        } else if (Promedio<= 80) {
            return 'C';
        } else if (Promedio<= 90) {
            return 'B';
        } else{
            return 'A';
        }
    }

    public void imprimirResultados(){
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1:" + calificaciones[0]);
        System.out.println("Calificación 2:" + calificaciones[1]);
        System.out.println("Calificación 3:" + calificaciones[2]);
        System.out.println("Calificación 4:" + calificaciones[3]);
        System.out.println("Calificación 5:" + calificaciones[4]);
        double promedio = calcularPromedio();
        char calificacionFinal = obtenercalificaciones(promedio);
        System.out.println("Promedio" + promedio);
        System.out.println ("Calificacion" + calificacionFinal);
    }
    public static void main(String [] args) {
        double[] calificaciones ={80,90,85,95,70};
        Promedio alumno = new Promedio("Juan", calificaciones);
        alumno.imprimirResultados();
    }
}
