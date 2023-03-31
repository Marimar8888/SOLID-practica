# Principios SOLID que incumple

### 1.- El principio de segregación de interfaces

La clase Directory, File tienen que implementar muchos métodos de FileSystemItem que no necesitan y que devuelven excepciones.

*Solución**

Creo dos Interfaces con el nombre de FileSystemItemFile FileSystemItemDirectori para separar los métodos e implementarlos en la clase File y Directory respectivamente.

Además tanto File como Directory no heredan de la clase abstracta.

### 2.- Principio de responsabilidad única

Este principio que está muy relacionado con el anterior, lo incumple porque tenemos una interfaz con muchos métodos y por eso es difícil que las clases que lo implementen necesiten todas ellas. Se deberían hacer varias interfaces cada una, con menos métodos y que realicen una finalidad concreta.

**Solución**

Creo dos Interfaces con el nombre de FileSystemItemFile FileSystemItemDirectori para separar los métodos e implementarlos.

### 3.- Principio de inversión de dependencias

Las interfaces no deben en la misma carpeta que las clases, para que las abstracciones no dependan de los detalles y en este
caso sería así.

Además la clase de alto nivel FileSystemItemBase debería estar en otra carpeta separada de las clases de bajo nivel. (Diretory y File)

**Solución**

Creo una carpeta interfaces y pongo en ella las tres interfaces para separar de las clases de bajo nivel.
Además cambio de carpeta a FileSystemItemBase para separar las clases de bajo nivel con las de alto nivel.


### 4.- Principio de abierto y cerrado

No está abierto a la extensión, por imcumplir estos principios anteriores.

No está cerrado a la modificación por lo mismo. 

Muy difícil de mantener.

**Solución**

De esta manera el código es extensible y modificable, con un mantenimiento más fácil.

Nota: No he conseguido que me salga el resultado. He modificado partes de utils. Porque me lo pedía el IDE, pero aún así no he conseguido que funcione.

Exception in thread "main" java.lang.ClassCastException: class com.kreitek.files.Directory cannot be cast to class com.kreitek.interfaces.FileSystemItem (com.kreitek.files.Directory and com.kreitek.interfaces.FileSystemItem are in unnamed module of loader 'app')
at com.kreitek.utils.FileSystemBuilder.<init>(FileSystemBuilder.java:17)
at com.kreitek.utils.FileSystemBuilder.getBuilder(FileSystemBuilder.java:13)
at com.kreitek.Main.buildTestFileSystem(Main.java:37)
at com.kreitek.Main.main(Main.java:10)