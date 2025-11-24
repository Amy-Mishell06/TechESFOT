import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Empleado> empleados = new ArrayList<>();
        int opcion = 0;
        do {
            try{
                System.out.println("---------- BIENVENIDO A TechESFOT -----------");
                System.out.println("1. Registrar empleado tiempo completo");
                System.out.println("2. Registrar empleado medio tiempo");
                System.out.println("3. Mostrar empleados registrados");
                System.out.println("4. Mostrar Estadísticas.");
                System.out.println("5. Salir");
                System.out.print("Ingrese su opcion: ");
                String opcion1 = sc.nextLine();
                opcion = Integer.parseInt(opcion1);
                switch (opcion) {
                    case 1:
                        try{
                            System.out.println("--------- REGISTRANDO EMPLEADO TIEMPO COMPLETO ---------");
                            System.out.print("Ingrese el codigo de empleado: ");
                            int codigo = sc.nextInt();
                            sc.nextLine(); //limpiar buffer
                            System.out.print("Ingrese el nombre: ");
                            String nombre = sc.nextLine();
                            System.out.print("Ingrese el cargo: ");
                            String cargo = sc.nextLine();
                            System.out.print("Ingrese el Sueldo Base: ");
                            double sueldoBase = sc.nextDouble();
                            sc.nextLine(); //limpiar buffer
                            System.out.print("Ingrese el Bono: ");
                            double bono = sc.nextDouble();
                            sc.nextLine(); //limpiar buffer
                            EmpleadoTCompleto empleadoC = new EmpleadoTCompleto(codigo, nombre, cargo, sueldoBase, bono);
                            empleados.add(empleadoC);
                            break;
                        }catch(DatoInvalidoException e){
                            System.out.println(e.getMessage());
                            break;
                        }
                    case 2:
                        try{
                            System.out.println("--------- REGISTRANDO EMPLEADO MEDIO TIEMPO ---------");
                            System.out.print("Ingrese el codigo de empleado: ");
                            int codigo2 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Ingrese el nombre: ");
                            String nombre2 = sc.nextLine();
                            System.out.print("Ingrese el cargo: ");
                            String cargo2 = sc.nextLine();
                            System.out.print("Ingrese las horas trabajadas : ");
                            int horas = sc.nextInt();
                            sc.nextLine(); //limpiar buffer
                            System.out.print("Ingrese el pago por hora: ");
                            double pagoHora = sc.nextDouble();
                            sc.nextLine(); //limpiar buffer
                            EmpleadoMedioT empleadoM = new EmpleadoMedioT(codigo2, nombre2, cargo2, horas, pagoHora);
                            empleados.add(empleadoM);
                            break;
                        }catch(DatoInvalidoException e){
                            System.out.println(e.getMessage());
                            break;
                        }
                    case 3:
                        System.out.println("--------- LISTA DE EMPLEADOS REGISTRADOS ---------");
                        if (empleados.size() == 0) {
                            System.out.println("Lista de empleados vacia");
                            break;
                        }
                        for(Empleado emp : empleados){
                            System.out.println(emp.MostrarInfo());
                        }
                        break;
                    case 4:
                        System.out.println("--------- ESTADISTICAS DE LA EMPRESA ---------");
                        break;
                    case 5:
                        System.out.println("Saliendo del Sistema TechESFOT...");
                        break;
                    default:
                        System.out.println("Opcion fuera del menu");
                }
            }catch (NumberFormatException e){
                System.out.println("ERROR: Ingrese una opcion valida");
            }
        }while (opcion != 5);
    }
}