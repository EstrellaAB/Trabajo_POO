<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesión</title>
    <link href="../CSS/InicioSesionEstilo.css" rel="stylesheet" type="text/css">
</head>
   
<body>
    <header>
        <div class="left-section">
          <a href="index"class="header-btn">Pagina de Inicio</a>
          <a href="inicioSesion"class="header-btn">Iniciar Sesión</a>
          <a href="Login"class="header-btn">Registrarse</a>
        </div>
        <div class="center-section">
          <h1>Iniciar Sesión</h1>
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
        <label for="email">Dirección de correo electrónico</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <br>
        <label for="contraseña"> Contraseña: </label>
        <input type="password" name="contraseña" id="Contraseña" min="6" max="20">
        
        <br>
        <a href="index.html"><input type="submit" value="Iniciar Sesión"></a>
        <input type="reset" value="Restablecer">       
        

    </form>

        <footer>
            <p>&copy; 2023 HOTELES PACO - Todos los derechos reservados</p>
        </footer>
    
  
</body>
</html>