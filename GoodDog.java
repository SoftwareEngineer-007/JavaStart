class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Raff raff!!!");
        } else if (size > 14) {
            System.out.println("Woof woof!!!");
        } else {
            System.out.println("Tyaf tyaf!!!");
        }
    }
}


class GoodDogTestDrive {

    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());
        one.bark();
        two.bark();
    }
}
