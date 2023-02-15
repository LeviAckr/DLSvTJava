/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
Animal animal = new Animal("Bichano", 5, "Ronronar");
System.out.println(animal.getNome() + " faz " + animal.getSom());

Cachorro cachorro = new Cachorro("Totó", 3);
System.out.println(cachorro.getNome() + " faz " + cachorro.getSom());

Gato gato = new Gato("Bolinha", 1);
System.out.println(gato.getNome() + " faz " + gato.getSom());
}
