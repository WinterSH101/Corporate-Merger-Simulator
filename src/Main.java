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

        int mergerCount  = 0;
        int titanThreshold = 50000;
        Company titan = null;

        for (Company company : market) {
            if (company.size >= titanThreshold) {
                titan = company;
                break;
            }
        }
        System.out.println("\nStarting Merger Simulation...\n");

        while (market.size() >= 2 && titan == null) {
            Company companyA = market.poll();
            Company companyB = market.poll();

            int newSize = (int) ((companyA.size + companyB.size) * 1.1);

            String newName = companyA.name + "-" + companyB.name;

            Company mergedCompany = new Company(newName, newSize);

            market.add(mergedCompany);
            mergerCount++;

            System.out.println("MERGER:" + companyA.name + "and" + companyB.name + "have merged into " + newName+ "with size" + newSize + "!");

            if (newSize >= titanThreshold) {
                titan = mergedCompany;
                System.out.println("\nIndustry Titan has merged!");
            }
        }
        System.out.println("\n===== Final Report =====");

        if  (titan != null) {
            System.out.println("Industry Titan: " + titan);
        } else {
            System.out.println("No titan has merged.");
        }

        System.out.println("Total Mergers: " + mergerCount);
        System.out.println("Companies remaining: " + market.size());
    }
}