import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Company> market = new PriorityQueue<>();

        market.add(new Company("Disney", 30000));
        market.add(new Company("GE", 25000));
        market.add(new Company("ACME Corp", 1000));
        market.add(new Company("Stark Industries", 45000));
        market.add(new Company("Wayland-Yutani", 12000));
        market.add(new Company("Oscorp", 8000));
        market.add(new Company("Umbrella Corp", 5000));
        market.add(new Company("Cyberdyne", 15000));
        market.add(new Company("LexCorp", 35000));
        market.add(new Company("InGen", 2000));

        Company smallest = market.poll();
        System.out.println("Smallest company: " + smallest);
        market.add(smallest);
    }
}