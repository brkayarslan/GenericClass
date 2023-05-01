package GenericList;

public class Main {
    public static void main(String[] args) {
        MyList <Integer> inList = new MyList<>(3);
        System.out.println("kapiste " + inList.getCapacity());
        inList.add(1002);
        inList.add(542);
        inList.add(12);
        inList.add(15);

        inList.printArray();
        System.out.println("kapiste " + inList.getCapacity());
        System.out.println("Eleman sayısı " + inList.size());
        inList.removeIndex(0);
        inList.printArray();
        inList.set(0, 1963);
        inList.add(135);
        inList.add(15);
        inList.printArray();

        System.out.println( inList.indexOf(15));
        System.out.println(inList.lastIndexOf(15));

        System.out.println(inList.isEmpty());

        Object[] intArray = inList.toArray();
        for (Object o : intArray) {
            System.out.println("yeni liste "+o);
        }

        inList.clear();
        inList.printArray();
    }
}
