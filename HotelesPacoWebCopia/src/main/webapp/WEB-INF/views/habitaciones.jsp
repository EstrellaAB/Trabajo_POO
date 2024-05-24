<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Tipos de Habitaciones - Hotel</title>
  <link href="../CSS/habitacionesEstilos.css" rel="stylesheet" type="text/css">
</head>
<body>
  <header>
    <div class="left-section">
        <a href="index"class="header-btn">Pagina de Inicio</a>
        <a href="inicioSesion"class="header-btn">Iniciar Sesión</a>
        <a href="Login"class="header-btn">Registrarse</a>
    </div>
    <div class="center-section">
      <h1>Tipos de Habitaciones</h1>
      <p>Descubre nuestras confortables habitaciones</p>
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
 
  <div class="container">
    <div class="room-type">
      <h2 >Habitación Individual </h2>
      <p>Perfecta para viajeros solitarios o estancias rápidas. Habitación equipada con una cama individual, comodidades modernas y ambiente acogedor.</p>
      <a href="habIndividual" class="btn-slide-down">Más Información</a>
    </div>
 
    <div class="room-type">
      <h2>Habitación Doble</h2>
      
      <p>Una opción ideal para parejas o amigos. Habitación espaciosa con una cama doble o dos camas individuales, baño privado y todas las comodidades necesarias.</p>
      <a href="habDoble" class="btn-slide-down">Más Información</a>
    </div>
 
    <div class="room-type">
      <h2>Suite</h2>
      <p>Nuestra experiencia de lujo. Amplia suite con sala de estar independiente, cama king-size, baño de lujo, jacuzzi privado y servicios exclusivos para una estancia de alto nivel.</p>
      <a href="habSuite" class="btn-slide-down">Más Información</a>
    </div>
  </div>
 
  <footer>
    <p>&copy; 2023 HOTELES PACO - Todos los derechos reservados</p>
  </footer>
</body>
</html>