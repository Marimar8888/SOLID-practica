# Principios SOLID que incumple

### 1.- El principio de segregación de interfaces

La clase Directory, File tienen que implementar muchos métodos de FileSystemItem que no necesitan y que devuelven excepciones.


### 2.- Principio de responsabilidad única

Este principio que está muy relacionado con el anterior, lo incumple porque tenemos una interfaz con muchos métodos y por eso es difícil que las clases que lo implementen necesiten todas ellas. Se deberían hacer varias interfaces cada una, con menos métodos y que realicen una finalidad concreta.


### 3.- Principio de inversión de dependencias

Las interfaces no deben en la misma carpeta que las clases, para que las abstracciones no dependan de los detalles y en este
caso sería así.

Además la clase de alto nivel FileSystemItemBase debería estar en otra carpeta separada de las clases de bajo nivel. (Diretory y File)

### 3.- Principio de abierto y cerrado

No está abierto a la extensión, por imcumplir estos principios anteriores.

No está cerrado a la modificación por lo mismo. 

Muy difícil de mantener.
