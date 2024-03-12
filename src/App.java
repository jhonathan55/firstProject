import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static final int MAX_ESTUDIANTES = 2;
    public static final int Q_NOTAS = 3;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<Double>();
        String nombreEstudiante;
        double notaIngresada, sumaNotas = 0, promedio = 0;
        System.out.println("Bienvenido al sistema de notas");
        for (int i = 0; i < MAX_ESTUDIANTES; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            nombreEstudiante = sc.nextLine();
            for (int j = 0; j < Q_NOTAS; j++) {
                System.out.println("Ingrese la nota " + (j + 1) + " del estudiante");
                notaIngresada = sc.nextDouble();
                notas.add(notaIngresada);
                sumaNotas += notaIngresada;
            }
            System.out.println("Las suma es " + sumaNotas);
            promedio = sumaNotas / Q_NOTAS;
            System.out.println("El promedio del estudiante " + nombreEstudiante + " es: " + promedio);
            System.out.println("Desea ingresar otro estudiante? (s/n)");
            sc.nextLine();
            String respuesta = sc.nextLine();
            if (respuesta.equals("s")) {
                notas.clear();
                sumaNotas = 0;
                promedio = 0;
            } else {
                break;
            }
        }
        sc.close();

        /*
         * implementar esta solucion
         * import java.util.ArrayList;
         * import java.util.List;
         * import java.util.Scanner;
         * 
         * class Estudiante {
         * private String nombre;
         * private List<Double> notas;
         * 
         * public Estudiante(String nombre) {
         * this.nombre = nombre;
         * this.notas = new ArrayList<>();
         * }
         * 
         * public void agregarNota(double nota) {
         * notas.add(nota);
         * }
         * 
         * public double calcularPromedio() {
         * return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
         * }
         * 
         * public String getNombre() {
         * return nombre;
         * }
         * 
         * public List<Double> getNotas() {
         * return notas;
         * }
         * }
         * 
         * class GestorEstudiantes {
         * private List<Estudiante> estudiantes;
         * 
         * public GestorEstudiantes() {
         * this.estudiantes = new ArrayList<>();
         * }
         * 
         * public void agregarEstudiante(Estudiante estudiante) {
         * estudiantes.add(estudiante);
         * }
         * 
         * public double calcularPromedioClase() {
         * return
         * estudiantes.stream().mapToDouble(Estudiante::calcularPromedio).average().
         * orElse(0.0);
         * }
         * 
         * // Puedes añadir más funcionalidades aquí, como buscar el estudiante con
         * mejor promedio, etc.
         * }
         * 
         * public class App {
         * public static final int MAX_ESTUDIANTES = 2;
         * public static final int Q_NOTAS = 3;
         * 
         * public static void main(String[] args) {
         * Scanner sc = new Scanner(System.in);
         * GestorEstudiantes gestor = new GestorEstudiantes();
         * 
         * System.out.println("Bienvenido al sistema de notas");
         * 
         * for (int i = 0; i < MAX_ESTUDIANTES; i++) {
         * System.out.println("Ingrese el nombre del estudiante: ");
         * String nombreEstudiante = sc.nextLine();
         * Estudiante estudiante = new Estudiante(nombreEstudiante);
         * 
         * for (int j = 0; j < Q_NOTAS; j++) {
         * System.out.println("Ingrese la nota " + (j + 1) + " del estudiante:");
         * double notaIngresada = Double.parseDouble(sc.nextLine());
         * estudiante.agregarNota(notaIngresada);
         * }
         * 
         * gestor.agregarEstudiante(estudiante);
         * System.out.println("El promedio del estudiante " + nombreEstudiante + " es: "
         * + estudiante.calcularPromedio());
         * }
         * 
         * System.out.println("El promedio de la clase es: " +
         * gestor.calcularPromedioClase());
         * sc.close();
         * }
         * }
         * 
         */
    }
}
