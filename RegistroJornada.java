
package com.mycompany.registrojornada;

/**
 * @author Xavier Mosquera
 */
import java.util.Scanner;

public class RegistroJornada { 

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        String nombreTrabajador;
        String cedula;
        int horasRegistradas = 0;

        while (true) {
            // Menú principal
            System.out.println("1. Ingresar horas");
            System.out.println("2. Ingresar novedad");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Ingresar horas
                    System.out.println("Ingrese la fecha de inicio:");
                    String fechaInicio = scanner.next();
                    System.out.println("Ingrese la hora de inicio:");
                    String horaInicio = scanner.next();
                    System.out.println("Ingrese la fecha de finalización:");
                    String fechaFinalizacion = scanner.next();
                    System.out.println("Ingrese la hora de finalización:");
                    String horaFinalizacion = scanner.next();

                    int horas = calcularHoras(horaInicio, horaFinalizacion);
                    horasRegistradas += horas;
                    System.out.println("Horas registradas: " + horasRegistradas);

                    if (horasRegistradas < 8) {
                        System.out.println("Alerta: Te faltan " + (8 - horasRegistradas) + " horas por completar.");
                    }
               }

                case 2 -> {
                    // Ingresa novedad
                    System.out.println("Seleccione la novedad:");
                    System.out.println("1. Licencia");
                    System.out.println("2. Incapacidad");
                    System.out.println("3. Vacaciones");
                    System.out.println("4. Permisos");
                    int novedad = scanner.nextInt();

                    switch (novedad) {
                        case 1 -> {
                            // Tipo de licencia
                            System.out.println("Seleccione el tipo de licencia:");
                            System.out.println("1. Temporal");
                            System.out.println("2. Maternidad");
                            System.out.println("3. Paternidad");
                            int tipoLicencia = scanner.nextInt();

                            switch (tipoLicencia) {
                                case 1 -> {
                                    // Licencia temporal
                                    System.out.println("Ingrese la cantidad de días (1-4):");
                                    int diasLicenciaTemporal = scanner.nextInt();

                                    if (diasLicenciaTemporal >= 1 && diasLicenciaTemporal <= 4) {
                                        // Procesar licencia temporal
                                    } else {
                                        System.out.println("Alerta: Debes tomar vacaciones en lugar de una licencia temporal.");
                                    }
                                }
                                
                                case 2 -> {
                                    // Maternidad
                                    System.out.println("Ingrese la cantidad de días (1-180):");
                                    int diasMaternidad = scanner.nextInt();

                                    if (diasMaternidad >= 1 && diasMaternidad <= 180) {
                                        // Procesar licencia por maternidad
                                    } else {
                                        System.out.println("Alerta: No puedes tomar más de 180 días de licencia por maternidad.");
                                    }
                                }
                                
                                case 3 -> {
                                    // Paternidad
                                    System.out.println("Ingrese la cantidad de días (1-15):");
                                    int diasPaternidad = scanner.nextInt();

                                    if (diasPaternidad >= 1 && diasPaternidad <= 15) {
                                        // Procesa licencia por paternidad
                                    } else {
                                        System.out.println("Alerta: No puedes tomar más de 15 días de licencia por paternidad.");
                                    }
                                }
                            }
                        }
                        
                        
                        case 2 -> {
                            // Incapacidad
                            System.out.println("Ingrese la cantidad de días (1-20):");
                            int diasIncapacidad = scanner.nextInt();

                            if (diasIncapacidad >= 1 && diasIncapacidad <= 20) {
                                // Procesa incapacidad
                            } else {
                                System.out.println("Alerta: No puedes tomar más de 20 días de incapacidad.");
                            }
                        }
                        
                        case 3 -> {
                            // Vacaciones
                            System.out.println("Ingrese la cantidad de días (1-15):");
                            int diasVacaciones = scanner.nextInt();

                            if (diasVacaciones >= 1 && diasVacaciones <= 15) {
                                // Procesa vacaciones
                            } else {
                                System.out.println("Alerta: No puedes tomar más de 15 días de vacaciones.");
                            }
                        }
                        
                        case 4 -> {
                            // Permisos
                            System.out.println("Ingrese la cantidad de horas (1-5):");
                            int horasPermisos = scanner.nextInt();

                            if (horasPermisos >= 1 && horasPermisos <= 5) {
                                // Procesar permisos
                            } else {
                                System.out.println("Alerta: Debes tomar 1 día de vacaciones o una licencia temporal en lugar de un permiso.");
                            }
                        }
                    }
               } 


                case 3 -> {
                    // Salir
                    System.out.println("Hasta luego.");
                    return;
               }

                default -> System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }

    public static int calcularHoras(String horaInicio, String horaFinalizacion) {
        return 0;
    }
}
