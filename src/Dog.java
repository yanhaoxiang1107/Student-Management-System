public class Dog extends Animal implements Swimmable { // 继承+实现
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "汪汪叫！");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "正在狗刨式游泳！");
    }
}