# | Dragon Ball Z |
Aplicaciones en relacion a la serie animada Dragon Ball. Estas aplicaciones estan desarrolladas para las clases de programación Java. 
Proyecto (Programación en JAVA - Politecnico Internacional) 

<h1 align="center"> | Proyecto Dragon Ball - Politecnico Internacional | </h1>


![24635](https://github.com/Harol003/DragonBall/assets/66041310/4d65702b-8d69-42b6-921f-c22a3e51d076)




   <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
 </p>
 



##Índice

*[Título e imagen de portada](#Título-e-imagen-de-portada)

*[Insignias](#insignias)

*[Índice](#índice)

        APP MVC - Dragon Ball 
        Clases, objetos, metodos, atributos en JAVA - Serie Dragon Ball Z

*[Descripción del proyecto](#descripción-del-proyecto)

*[Estado del proyecto](#Estado-del-proyecto)

El presente proyecto se encuentra en etapa de desarrollo.

*[Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)

A continuacion pueden descargar los proyectos relacionados en su orden a nivel de la serie Dragon Ball Z.

- DragonBallGame        (Aplicacion que permite ver la informacion de los personajes goku y vegeta con una interfaz basica. JFRAME)

![1](https://github.com/Harol003/DragonBall/assets/66041310/643d016a-78c8-414d-94a7-e1fa2eb97cfb)

- DragonBallGame2       (Aplicacion que permite ver la informacion de 5 personajes de la seria, con una interfaz basica. JFRAME)

![2](https://github.com/Harol003/DragonBall/assets/66041310/5e497636-f5ac-4af5-8ae4-a2a911c21c00)

- DragonBallLogo        (Aplicacion con una unica pantalla para cargar una imagen de fondo, con una interfaz basica. JFRAME)

  ![3](https://github.com/Harol003/DragonBall/assets/66041310/fa51a534-63f2-441e-ba09-1bec49a26946)

- DragonBallSuper       (Aplicacion que permite ver la informacion de los personajes, comparar niveles, mostrar campeones  y cargar una imagen, con una interfaz basica. JFRAME)

![4](https://github.com/Harol003/DragonBall/assets/66041310/f133073e-ce74-4a6d-aff4-77aadcf515ca)

- DragonBallZ           (Aplicacion que permite ver la informacion de los personaje utilizando Getter y Setter)

![5](https://github.com/Harol003/DragonBall/assets/66041310/832cef32-88a7-46d0-9718-7c131239a7f5)

- DragonBallZExample    (Aplicacion que permite ver la informacion de los personaje utilizando Getter y Setter)

![6](https://github.com/Harol003/DragonBall/assets/66041310/9e90049d-c6e8-4919-820b-c2c61625a4fc)

- DragonBallZGUI        (Aplicacion que permite ver la informacion de 1 personaje de la serie, con una interfaz basica. JFRAME)

![7](https://github.com/Harol003/DragonBall/assets/66041310/df4beb44-96a5-4eb7-94b1-117310ab5a04)

- DragonBallZJPanel     (Aplicacion que permite ver la informacion de 5 personajes con una interfaz basica. JFRAME)

![8](https://github.com/Harol003/DragonBall/assets/66041310/790e578d-4508-4149-84fd-ddcf79b3ecab)

- DragonBallZApp        (Aplicacion que permite ver la informacion de 5 personajes con una interfaz basica y login de usuario. JFRAME)

![9](https://github.com/Harol003/DragonBall/assets/66041310/44ea7fa8-bfe3-4e86-b6fa-e8309cb5ebab)

![10](https://github.com/Harol003/DragonBall/assets/66041310/26184632-8456-435f-b2c1-9c31a8070432)

Video de los programas en ejecucion

[https://youtu.be/tq7SZyE7jGY](https://www.youtube.com/watch?v=8KVfqbf7gSs)


*[Ejmplo UML](#DiagramaClases)

Diagrama Dragon Ball GAME

                     +-----------------+
                     |    Personaje    |
                     +-----------------+
                     | - nombre: String|
                     | - raza: String  |
                     | - nivelPelea: int|
                     | - velocidad: int|
                     | - nivelDefensa:int|
                     | - descripcion: String|
                     | - imagen: ImageIcon |
                     +-----------------+
                     | +getNombre(): String |
                     | +getRaza(): String |
                     | +getNivelPelea(): int |
                     | +getVelocidad(): int |
                     | +getNivelDefensa(): int |
                     | +getDescripcion(): String |
                     | +getImagen(): ImageIcon |
                     +-----------------+

                       |
                       |   extends
                       v

        +-------------------------+
        |    DragonBallGameView   |
        +-------------------------+
        | - personajeButtonMap: Map<JButton, Personaje> |
        | - infoTextArea: JTextArea |
        | - imagenLabel: JLabel     |
        +-------------------------+
        | +DragonBallGameView()    |
        | +mostrarInformacion(personaje: Personaje) : void |
        +-------------------------+
                    




*[Acceso al proyecto](#acceso-proyecto)

Las siguientes son las credenciales utilizadas para el proyecto.

App

   Poli - Usuario
   Colombia2023   - Password

*[Tecnologías utilizadas](#tecnologías-utilizadas)

El siguiente proyecto se desarrolla desde el paradigma de programacion orientada a objetos. Para el cual se definen: clases, objetos, metodos y atributos. De igual forma se presenta una solucion en un modelo de tres capas desde la integracion de un LAMP. Asi se listan el versionamiento utilizados en este proyecto: 

Product Version: Apache NetBeans IDE 18
Java: 20.0.2; Java HotSpot(TM) 64-Bit Server VM 20.0.2+9-78
Runtime: Java(TM) SE Runtime Environment 20.0.2+9-78
System: Windows 11 version 10.0 running on amd64; UTF-8; es_CO (nb


*[Personas Contribuyentes](#personas-contribuyentes)

Equipo de desarrollo Agil  - 
Desarrollador 1            -
Desarrollador 2            -
Product Owner              -
Scrum Master               -
QA Tester                  -

*[Personas-Desarrolladores del Proyecto](#personas-desarrolladores)

Harol Hernan Torres Neuta - Email: Harol.Torres@pi.edu.co

* [Licencia](#licencia)

Creative Commons 4.0

*[Conclusión](#conclusión)

De esta forma es importante programar utilizando el patrón Modelo-Vista-Controlador (MVC) en Java debido a los beneficios que aporta a la estructura y mantenibilidad del código. MVC es un patrón de diseño que separa claramente las responsabilidades de una aplicación en tres componentes principales: el Modelo, que representa los datos y la lógica de negocio; la Vista, que se encarga de la presentación y la interfaz de usuario; y el Controlador, que actúa como intermediario entre el Modelo y la Vista, gestionando las interacciones del usuario. Al seguir este enfoque, se obtiene un código más modular y organizado, lo que facilita la colaboración en equipos de desarrollo y permite una mejor escalabilidad del proyecto. La separación de preocupaciones en componentes distintos también hace que el mantenimiento y las actualizaciones sean más sencillos, ya que los cambios en un componente no afectan directamente a los demás. Además, MVC promueve una mayor reutilización de código, ya que la lógica de negocio y la interfaz de usuario están claramente separadas. Esto permite adaptar la aplicación a diferentes plataformas y dispositivos sin tener que reescribir grandes partes del código. En resumen, programar en un modelo vista controlador en Java fomenta una arquitectura más limpia y estructurada, facilita la colaboración entre desarrolladores, mejora la mantenibilidad del código y favorece la reutilización de componentes, lo que en última instancia conduce a un desarrollo más eficiente y una aplicación más robusta y adaptable.
