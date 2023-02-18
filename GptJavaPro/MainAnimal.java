
public class Main
{
Animal animal = new Animal("Bichano", 5, "Ronronar");
System.out.println(animal.getNome() + " faz " + animal.getSom());

Cachorro cachorro = new Cachorro("Totó", 3);
System.out.println(cachorro.getNome() + " faz " + cachorro.getSom());

Gato gato = new Gato("Bolinha", 1);
System.out.println(gato.getNome() + " faz " + gato.getSom());
}
