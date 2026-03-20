import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de usuarios a crear: ");
        int numero = sc.nextInt();

        Usuario[] misUsuarios = crearArrayUsuarios(numero);

        System.out.println("\n--- Lista de Usuarios ---");
        for (Usuario u : misUsuarios) {
            System.out.println("Nombre: " + u.nombre + " | Apellidos: " + u.apellidos + " | Email: " + u.email);
        }
    }

    public static Usuario[] crearArrayUsuarios(int cantidad) {
        Scanner sc = new Scanner(System.in);
        Usuario[] lista = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            lista[i] = new Usuario();
            System.out.println("\nDatos del usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            lista[i].nombre = sc.nextLine();
            System.out.print("Apellidos: ");
            lista[i].apellidos = sc.nextLine();
            System.out.print("Email: ");
            lista[i].email = sc.nextLine();
        }
        return lista;
    }
}