public class Company implements Comparable<Company>{
    String name;
    int size;

    public Company(String name, int size){
        this.name=name;
        this.size=size;
    }
    @Override
    public int compareTo(Company other) {
        return Integer.compare(this.size, other.size);
    }
    @Override
    public String toString() {
        return name + "(Size:" + size + ")";
    }
}