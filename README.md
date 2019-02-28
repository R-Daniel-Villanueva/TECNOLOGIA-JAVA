
# PROYECTO DESARROLLADO CON JAVA IMPLEMENTANDO EL PATRON DE DISEÑO OBSERVER

## Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

### El Patron de diseño observer se basa en el uso de dos interfaces, una que hace el papel de observador y otra que es el observable. 

### Dentro de la interfaz del observable se deben definir tres metodos principales, uno que añada los objetos observadores, otro que los elimine y otro metodo que los notifique en caso de que se efectue un cambio en el objeto observable.

### La ventaja de este patron de diseño es que se implementa en proyectos de alta complejidad y tamaño, segmenta las acciones a realizarse en el programa en objetos observables que son independientes entre si y nunca llegan a conocerse.

### La siguiente imagen muestra como se ejecuta el proceso de manera interna: 
![alt text](https://reactiveprogramming.io/public/books/patterns/img/patterns-articles/observer-sequence.png)
