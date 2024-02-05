import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
        System.out.println("Hola mundo");

        fechaYhora();
        System.out.println();

		System.out.print("Introduce una cantidad de alumnos: ");
		int cantidad = Integer.parseInt(teclado.nextLine());
		
		Usuario[] usuario = pedirUsuarios(cantidad);
		
		for(int i = 0; i < usuario.length; i++) {
			System.out.println("\n" + (i+1) + "º usuario");
			System.out.println("-------------");
			System.out.println("Nombre: " + usuario[i].getNombre());
			System.out.println("Apellidos: " + usuario[i].getApellidos());
			System.out.println("Email: " + usuario[i].getEmail());
		}
    }

    public static void fechaYhora(){
        LocalDateTime actual = LocalDateTime.now();

        String a = "Fecha: " + actual.getDayOfMonth() + "/" + actual.getMonth() + "/" + actual.getYear() + "\nHora: " + actual.getHour() + ":" + actual.getMinute() + ":" + actual.getSecond();
        System.out.println(a);
    }

	public static Usuario[] pedirUsuarios(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		Usuario[] usuarios = new Usuario[cantidad];
		
		for(int i = 0; i < cantidad; i++) {
			Usuario actual = new Usuario();
			System.out.println((i+1) + "º usuario");

			System.out.print("Nombre: ");
			actual.setNombre(teclado.nextLine());
			
			System.out.print("Apellidos: ");
			actual.setApellidos(teclado.nextLine());
			
			System.out.print("Email: ");
			actual.setEmail(teclado.nextLine());
			
			usuarios[i] = actual;
		}
		return usuarios;
	}
}

    class Usuario{
        private String nombre;
        private String apellidos;
        private String email;

        public Usuario() {
		
	    }
	    public Usuario(String nombre, String apellidos, String email) {
		    this.nombre = nombre;
		    this.apellidos = apellidos;
		    this.email = email;
	    }
	    
	    //Nombre
	    public String getNombre() { 
		    return nombre;
	    }
	    public void setNombre(String nombre) { 
		    this.nombre = nombre;
	    }
	    
	    //Apellido
	    public String getApellidos() {
		    return apellidos;
	    }
	    public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
	    }
	    
	    //Email
	    public String getEmail() {
		    return email;
	    }
	    public void setEmail(String email) {
            this.email = email;  
	    }
    }
