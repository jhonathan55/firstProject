import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static final int MAX_ESTUDIANTES = 2;
    public static final int Q_NOTAS = 3;
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double> notas=new ArrayList<Double>();
        String nombreEstudiante;
        double notaIngresada,sumaNotas=0,promedio=0;
        System.out.println("Bienvenido al sistema de notas");
        for(int i=0;i<MAX_ESTUDIANTES;i++){
            System.out.println("Ingrese el nombre del estudiante");
            nombreEstudiante=sc.nextLine();
            for(int j=0;j<Q_NOTAS;j++){
                System.out.println("Ingrese la nota "+(j+1)+" del estudiante");
                notaIngresada=sc.nextDouble();
                notas.add(notaIngresada);
                sumaNotas+=notaIngresada;
            }
            System.out.println("Las suma es "+sumaNotas);
            promedio=sumaNotas/Q_NOTAS;
            System.out.println("El promedio del estudiante "+nombreEstudiante+" es: "+promedio);
            System.out.println("Desea ingresar otro estudiante? (s/n)");
            sc.nextLine();
            String respuesta=sc.nextLine();
            if(respuesta.equals("s")){
                notas.clear();
                sumaNotas=0;
                promedio=0;
            }else{
                break;
            }
        }
        sc.close();
    }
}
