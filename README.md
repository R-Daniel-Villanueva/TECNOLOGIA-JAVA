
# PROYECTO DESARROLLADO CON JAVA IMPLEMENTANDO EL PATRON DE DISEÑO OBSERVER

### El Patron de diseño observer se basa en el uso de dos interfaces, una que hace el papel de observador y otra que es el observable. 

### Dentro de la interfaz del observable se deben definir tres metodos principales, uno que añada los objetos observadores, otro que los elimine y otro metodo que los notifique en caso de que se efectue un cambio en el objeto observable.

### La ventaja de este patron de diseño es que se implementa en proyectos de alta complejidad y tamaño, segmenta las acciones a realizarse en el programa en objetos observadores que son independientes entre si y nunca llegan a conocerse.

### La siguiente imagen muestra como se ejecuta el proceso de manera interna: 
![alt text](https://reactiveprogramming.io/public/books/patterns/img/patterns-articles/observer-sequence.png)

## DIAGRAMA DE ESTRUCTURA
![alt text](https://refactoring.guru/images/patterns/diagrams/observer/structure.png)

## PATRÓN DE COMPORTAMIENTO

### El patrón de diseño Observer permite observar los cambios producidos por un objeto, de esta forma, cada cambio que afecte el estado del objeto observado lanzará una notificación a los observadores; a esto se le conoce como Publicador-Suscriptor. Observer es uno de los principales patrones de diseño utilizados en interfaces gráficas de usuario (GUI), ya que permite desacoplar al componente gráfico de la acción a realizar.

![alt text](https://reactiveprogramming.io/public/books/patterns/img/patterns-articles/observer-diagram.png)

### Los componentes del patrón se explican a continuación:

IObservable: Interface que deben de implementar todos los objetos que quieren ser observados, en ella se definen los métodos mínimos que se deben implementar.
ConcreteObservable: Clase que desea ser observada, ésta implementa IObservable y debe implementar sus métodos.
IObserver: Interfaces que deben implementar todos los objetos que desean observar los cambios de IObservable.
ConcreteObserver: Clase concreta que está atenta de los cambios de IObserver, esta clase hereda de IObserver y debe de implementar sus métodos.
