package com.proyecto.principal.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.proyecto.principal.entidades.Usuarios;
import com.proyecto.principal.repositorios.ConexionBBDD;

public class Login extends Usuarios {
	public Scanner sc = new Scanner(System.in);

	public void registrar(Usuarios usuario) {

		boolean malcon = true;
		boolean malfec = true;
		String admin = "NO";
		System.out.println("Ingrese su correo.");
		usuario.setCorreo(sc.next());
		
		System.out.println("Ingrese su nombre de usuario:");
		usuario.setNombreUsuario(sc.next());

		while (malcon) {
			System.out.println("Ingrese su contraseña:");
			usuario.setContrasena(sc.next());

			System.out.println("Confirme su contraseña:");
			String confirmarContrasena = sc.next();

			if (usuario.getContrasena().equals(confirmarContrasena)) {
				if (!usuario.getContrasena().matches("^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9]).{8,}$")) {
					System.out.println("La contraseña no cumple con los requisitos mínimos.");
					System.out.println("Debe contener al menos una letra mayúscula, un carácter especial (!@#$&*)");
					System.out.println("y un número, y tener una longitud mínima de 8 caracteres.");
				} else {
					System.out.println("Contraseña creada correctamente.");
					malcon = false;
					
					while (malfec) {
						System.out.println("Ingrese su año de nacimiento: ");
						usuario.setFechaCumple((sc.nextInt()));
						int añoActual = 2024; // año actual
						int edad = añoActual - usuario.getFechaCumple();

						if (edad < 18) {
							System.out.println("Lo siento, debes ser mayor de edad para registrarte.");
							return;
						} else {
							malfec = false;
							
							
							try {
							    ConexionBBDD conexionBBDD = new ConexionBBDD();
							    Connection conexion = conexionBBDD.conectar();
							 
							    String sql = "INSERT INTO usuarios (Nombre, Contrasena, Edad, Correo, Administrador) VALUES ( ?, ?, ?, ? , ?)";
							    PreparedStatement ps = conexion.prepareStatement(sql);
							   
							    ps.setString(1, usuario.getNombreUsuario());
							    ps.setString(2, usuario.getContrasena());
							    ps.setInt(3, usuario.getFechaCumple());
							    ps.setString(4, usuario.getCorreo());
							    ps.setString(5, admin);
							    ps.executeUpdate();
							    ps.close();
							    
							    conexionBBDD.desconectar(conexion);
							} catch (SQLException e) {
							    e.printStackTrace();
							}

							System.out.println("Registro exitoso. Esta es la información ingresada:");
							System.out.println("Nombre completo: " + usuario.getCorreo());
							System.out.println("Nombre de usuario: " + usuario.getNombreUsuario());
							System.out.println("Fecha de nacimiento: " + usuario.getFechaCumple());
							System.out.println(" ");
						}
					}
				}
			}
		}
	}

	public void inicioSesion(ArrayList<Usuarios> usuariosRegistrados) {
		try {
			System.out.println("Introduzca como quiere iniciar sesion: 1 usuario 2 Administrador. ");
			int opcionUsu = sc.nextInt();

			switch (opcionUsu) {
			case 1:
				loginUsuario(sc);
				break;
			case 2:
				admin(sc);
				break;

			default:
				System.out.println("Incorrecto");
				break;
			}
		} catch (java.util.InputMismatchException a) {
			System.out.println("No puedes ingresar letras.");
		}
	}

	// Funcion para el login de un usuario
	public void loginUsuario(Scanner sc) {

		Random random = new Random();
	    int randomNum = random.nextInt(10000);

	    System.out.println("Ingrese su nombre de usuario:");
	    String usu = sc.next();

	    try {
	        ConexionBBDD conexionBBDD = new ConexionBBDD();
	        Connection conexion = conexionBBDD.conectar();

	        String sql3 = "SELECT contrasena FROM usuarios WHERE nombre = ?";
	        PreparedStatement ps = conexion.prepareStatement(sql3);
	        ps.setString(1, usu);
	        ResultSet resultSet = ps.executeQuery();

	        if (resultSet.next()) {
	            String contrasenaDB = resultSet.getString("contrasena");

	            System.out.println("Ingrese su contraseña:");
	            String cont = sc.next();

	            if (contrasenaDB.equals(cont)) {
	                System.out.println("Para verificar que eres un humano, ingresa el siguiente número: " + randomNum);
	                System.out.println("Ingrese el número que aparece arriba: ");
	                int usuarioNum = sc.nextInt();

	                for (int intentos = 3; intentos > 0; intentos--) {
	                    if (usuarioNum == randomNum) {
	                        System.out.println("Has iniciado sesión correctamente.");
	                        selectorClases();
	                        break;
	                    } else {
	                        System.out.println("Error, número incorrecto.");
	                    }
	                }
	            } else {
	                System.out.println("Error, contraseña incorrecta.");
	            }
	        } else {
	            System.out.println("Error, nombre de usuario incorrecto.");
	        }

	        resultSet.close();
	        ps.close();
	        conexionBBDD.desconectar(conexion);
	    } catch (SQLException e) {
	        System.out.println("Error al iniciar sesión: " + e.getMessage());
	    }


	}

	// Funcion para el login de un administrador
	public void admin(Scanner sc) {
	    Random random = new Random();
	    int randomNum = random.nextInt(10000);

	    System.out.println("Ingrese su nombre de usuario:");
	    String usu = sc.next();

	    try {
	        ConexionBBDD conexionBBDD = new ConexionBBDD();
	        Connection conexion = conexionBBDD.conectar();

	        String sql4 = "SELECT contrasena, administrador FROM usuarios WHERE nombre = ? AND administrador = 'SI'";
	        PreparedStatement ps = conexion.prepareStatement(sql4);
	        ps.setString(1, usu);
	        ResultSet resultSet = ps.executeQuery();

	        if (resultSet.next()) {
	            String contrasenaDB = resultSet.getString("contrasena");

	            System.out.println("Ingrese la contraseña:");
	            String cont = sc.next();

	            if (cont.equals(contrasenaDB)) {
	                System.out.println("Para verificar que eres un humano, ingresa el siguiente número: " + randomNum);
	                System.out.println("Ingrese el número que aparece arriba: ");
	                int usuarioNum = sc.nextInt();

	                for (int intentos = 3; intentos > 0; intentos--) {
	                    if (usuarioNum == randomNum) {
	                        System.out.println("Has entrado en la sesión del administrador: " + usu);
	                        selectorClases();
	                        return; 
	                    } else {
	                        System.out.println("Error, número incorrecto.");
	                    }
	                }
	            } else {
	                System.out.println("Error, contraseña incorrecta.");
	            }
	        } else {
	            System.out.println("Error, nombre de usuario incorrecto o no eres administrador.");
	        }

	        resultSet.close();
	        ps.close();
	        conexionBBDD.desconectar(conexion);
	    } catch (SQLException e) {
	        System.out.println("Error al iniciar sesión: " + e.getMessage());
	    }
	}


	public void selectorClases() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione si quiere ir al 'gestor de menus', 'gestor de reservas' o 'pagina de inicio'");
		String eleccion = sc.nextLine();

		do {
			switch (eleccion) {

			case "gestor de menus":
				new Gestiones().menu();
				break;
			case "gestor de reservas":
				new PortalDeReservasMain().programaPpal();
				break;
			case "pagina de inicio":
				System.out.println("Volviendo al inicio del programa...");
				break;
			default:
				System.err.println("Introduzca una opción válida.");
				break;
			}
		} while (!eleccion.equals("pagina de inicio"));
		sc.close();
	}
}
