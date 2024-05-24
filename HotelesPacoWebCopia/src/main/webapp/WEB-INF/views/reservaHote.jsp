<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reserva de Hotel</title>
    <link href="../CSS/ReservaEstilo.css" rel="stylesheet" type="text/css">
</head>
   
<body>
    <header>
        <div class="left-section">
          <a href="index" class="header-btn">Pagina de Inicio</a>
          <a href="inicioSesion" class="header-btn">Iniciar Sesión</a>
          <a href="Login" class="header-btn">Registrarse</a>
        </div>
        <div class="center-section">
          <h1>Reserva Hotel</h1>
          
        </div>
        <div class="right-section">
          <div class="hotel-info">
            <h2>Hoteles Paco</h2>
            <p>Avenida de la Constitución, 28, Sevilla, España</p>
            <p>Teléfono: (+34) 653 89 74 53</p>
            <p>Correo : info@hotelespaco.com</p>
          </div>
        </div>
    </header>
 
    <form action="/reserva" method="POST">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>
 
        <label for="fecha">Fecha de llegada:</label>
        <input type="date" id="fecha" name="fecha" required><br><br>

        <label for="fecha">Fecha de salida:</label>
        <input type="date" id="fecha" name="fecha" required><br><br>
 
        <label for="habitacion">Tipo de habitación:</label>
        <select id="habitacion" name="habitacion" required>
        <option value="individual">Individual</option>
        <option value="doble">Doble</option>
        <option value="suite">Suite</option>
        </select><br><br>
 
        <input type="submit" value="Reservar">
    </form>

        <footer>
            <p>&copy; 2023 HOTELES PACO - Todos los derechos reservados</p>
          </footer>
  
</body>
</html>