# Parcial 2do Tercio -Ejercicios de Diseño


## Tabla de contenido

- [Requisitos](#requisitos-).
- [Enunciado](#enunciado).
- [Video](#video)
- [Comenzando](#comenzando-).
- [Diagrama de clases](#diagrama-de-clases-).
- [Productividad](#productividad).
- [Javadoc](#javaDoc-).
- [Licencia](#licencia-)



## Requisitos 📋
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://git-scm.com/) - Software de control de versiones
* [Java](https://www.oracle.com/java/) - Lenguaje de programación

## Enunciado


Diseñé, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".

0. log
1. ln
2. sin
3. cos
4. tan
5. acos
6. asin
7. atan
8. sqrt
9. exp (el número de eauler elevado ala potendia del parámetro)


Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".


Ejemplo de una llamado:

https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592


Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato

{

 "operation": "cos",

 "input":  3.141592,

 "output":  -0.999999

}


Entregable:

1. Proyecto actualizado en github. Incluya instrucciones de cómo clonarlo, compilarlo, y deplegarlo.
2. Descripción del proyecto enel README con pantalazos que muestren el funcionamiento.
3. Descripción de como correrlo en EC2
4. Video de menos de un minuto del funcionamiento (lo puede tomar con el celular una vez funcione)

## Video

[VIDEO](https://github.com/Jose1102/AREP_PARCIAL_2/blob/main/Video%20AWS%20PARCIAL.mp4)



## Comenzando 🚀
1. Clonar el repositorio
```
git clone https://github.com/Jose1102/AREP_PARCIAL_2
```

2. Compilar el proyecto

```
mvn package
```

3. Ejecutar el proyecto 

### Ejercicio 1

Para ejecutarlo de local

```
java -cp "target/classes:target/dependency/*" edu.escuelaing.arep.parcial.App
```



## Diagrama de clases 📖

Se tiene una clase App que es la clase principal, se tienen los métodos para calcular Log y Sin. Se le hace el llamado de los métodos de la clase Calculator

![WebServer](https://github.com/Jose1102/AREP_PARCIAL_2/blob/main/images/arepj/packages.PNG)






## Productividad
La productividad de este proyecto fue:
* 114 loc / 3 hours

## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/AREP_PARCIAL_2/tree/main/doc) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/AREP_PARCIAL_2/blob/main/LICENSE.txt) para obtener más detalles.



