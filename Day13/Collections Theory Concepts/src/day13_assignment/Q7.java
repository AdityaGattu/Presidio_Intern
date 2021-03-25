package day13_assignment;

/*
 * 7. Given: interface Hungry<E> { void munch(E x); }
 *  interface Carnivore<E extends Animal> extends Hungry<E> 
 *  {} interface Herbivore<E extends Plant> extends Hungry<E>
 *   {} abstract class Plant {} class Grass extends Plant {} 
 *   abstract class Animal {}
 *    class Sheep extends Animal implements Herbivore<Sheep> 
 *    { public void munch(Sheep x) {} } 
 *    
 *    class Wolf extends Animal implements Carnivore<Sheep> 
 *    { public void munch(Sheep x) {} } 
 *    
 *    Which of the following changes (taken separately) 
 * would allow this code to compile? (Choose all that apply) 
 
A. Change the Carnivore interface to interface Carnivore<E extends Plant> extends Hungry<E> {} 
B. Change the Herbivore interface to interface Herbivore<E extends Animal> extends Hungry<E> {}
C. Change the Sheep class to class Sheep extends Animal implements Herbivore<Plant> { public void munch(Grass x) {} } 
D. Change the Sheep class to class Sheep extends Plant implements Carnivore<Wolf> { public void munch(Wolf x) {} } 
E. Change the Wolf class to class Wolf extends Animal implements Herbivore<Grass> { public void munch(Grass x) {} } 
F. No changes are necessary
 */
public class Q7 {

}
