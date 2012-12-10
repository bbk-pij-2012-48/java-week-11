public class NoahsArkScript {
	public static void main(String args[]) {
		NoahsArkScript launcher = new NoahsArkScript();
		launcher.launch();
	}
	
	public void test(Animal testee) {
		testee.call();
		testee.reproduce();
		testee.makeSound();
	}
	
	public void launch() {
		Animal bear = new NonAquaticMammal("bear","grrrrrraaw");
		Animal beetle = new NonFlyingInsect("beetle","*scuffle*");
		Animal cat = new NonAquaticMammal("cat","miaow");
		Animal crocodile = new Amphibian("crocodile","g'day");
		Animal dog = new NonAquaticMammal("dog","woof");
		Animal dolphin = new AquaticMammal("dolphin","clickclickclick");
		Animal eagle = new Bird("eagle","craaaw");
		Animal fly = new FlyingInsect("fly","bzzzzzzzzzz");
		Animal frog = new Amphibian("frog","ribbit");
		Animal lizard = new Reptile("lizard","......");
		Animal monkey = new NonAquaticMammal("monkey","oohoohahahahahah");
		Animal pigeon = new Bird("pigeon","cooo");
		Animal salmon = new Fish("salmon","*splash*");
		Animal shark = new Fish("shark","dundundundundundundundun AHHHHHH");
		Animal snake = new Reptile("snake","hisssssss");
		Animal whale = new AquaticMammal("whale","pshhhhhhh");
		
		test(bear);
		test(beetle);
		test(cat);
		test(crocodile);
		test(dog);
		test(dolphin);
		test(eagle);
		test(fly);
		test(frog);
		test(lizard);
		test(monkey);
		test(pigeon);
		test(salmon);
		test(shark);
		test(snake);
		test(whale);		
	}
}
