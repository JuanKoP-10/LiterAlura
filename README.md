# Proyecto: Literatura API

## Descripción

Este proyecto es una aplicación de consola basada en Java y Spring Boot que interactúa con una API externa de libros (¡Gutenberg!) para buscar, guardar y gestionar información de libros y autores en una base de datos. La aplicación utiliza JPA para la persistencia y ofrece diversas funcionalidades relacionadas con la literatura.

---

## Funcionalidades principales

1. **Buscar libro por título y guardar en la base de datos.**
2. **Listar libros buscados previamente.**
3. **Buscar libro por nombre (consulta directa en la base de datos).**
4. **Listar todos los autores registrados.**
5. **Buscar autores vivos en un año determinado.**
6. **Buscar libros por idioma.**
7. **Buscar autor por nombre.**
8. **Listar autores buscados previamente.**

---

## Requisitos previos

- **Java 17 o superior.**
- **Maven 3.8 o superior.**
- **Base de datos PostgreSQL en funcionamiento.**
- **Dependencias del proyecto instaladas:**
  - Spring Boot Starter Data JPA.
  - Spring Boot Starter Web.
  - Jackson para convertir datos JSON.

---

## Configuración inicial

1. **Clonar el repositorio:**

   ```bash
   git clone <url-del-repositorio>
   ```

2. **Configurar la base de datos:**

   - Asegúrate de que PostgreSQL esté en ejecución.
   - Configura las credenciales de la base de datos en el archivo `application.properties` o `application.yml`:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_basedatos
     spring.datasource.username=usuario
     spring.datasource.password=contraseña
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Compilar y ejecutar:**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

---

## Uso

### Menú principal

El programa inicia mostrando el siguiente menú interactivo:

```plaintext
|***************************************************|
|*****       BIENVENIDO A LITERALURA       ******|
|***************************************************|

1 - Agregar Libro por Titulo
2 - Libros buscados
3 - Buscar libro por Nombre
4 - Buscar todos los Autores Registrados
5 - Buscar Autores por año
6 - Buscar Libros por Idioma
7 - Buscar Autor Por Nombre
8 - Listar Autores Buscados

0 - Salir
```

### Opciones del menú

#### 1. Agregar Libro por Título

- Solicita al usuario un título de libro.
- Busca en la API de GutenDex y guarda el libro si no existe previamente en la base de datos.

#### 2. Libros buscados

- Lista todos los libros almacenados en la base de datos.

#### 3. Buscar libro por Nombre

- Permite buscar un libro por título en la base de datos local.

#### 4. Buscar todos los Autores Registrados

- Lista los nombres de los autores almacenados en la base de datos.

#### 5. Buscar Autores por año

- Solicita un año y muestra los autores que estaban vivos en ese año.

#### 6. Buscar Libros por Idioma

- Permite filtrar los libros almacenados por idioma (e.g., "es" para español, "en" para inglés).

#### 7. Buscar Autor Por Nombre

- Busca un autor por nombre en la base de datos.

#### 8. Listar Autores Buscados

- Lista todos los autores previamente registrados en la base de datos.

---

## Estructura del proyecto

### Principales clases y paquetes

- **`Principal`**:
  Clase principal que contiene el menú interactivo y la lógica de la aplicación.

- **Paquete ****`config`**:

  - `ConsumoAPI`: Clase para realizar solicitudes a la API externa.
  - `ConvierteDatos`: Clase para convertir datos JSON en objetos Java.

- **Paquete ****`model`**:

  - `Autor`: Modelo de datos para autores.
  - `Libro`: Modelo de datos para libros.
  - `LibrosRespuestaApi`: Clase que representa la respuesta de la API de libros.

- **Paquete ****`repository`**:

  - `IAutorRepository`: Repositorio JPA para gestionar autores.
  - `ILibroRepository`: Repositorio JPA para gestionar libros.

---

## Consideraciones

1. **Errores comunes:**

   - Si un libro ya existe en la base de datos, no se vuelve a guardar.
   - Si un autor o libro no se encuentra, se muestra un mensaje adecuado.

2. **Validaciones:**

   - Los datos de entrada se validan para evitar errores comunes.

3. **Persistencia:**

   - Se utiliza JPA con PostgreSQL para gestionar la persistencia de los datos.

---

## Mejoras futuras

- Implementar pruebas unitarias.
- Agregar soporte para más idiomas.
- Mejorar la interfaz de usuario con un cliente web.

---

## Autor

Este proyecto fue desarrollado como parte de un ejercicio práctico para gestionar libros y autores usando Java y Spring Boot.

JuanKo
