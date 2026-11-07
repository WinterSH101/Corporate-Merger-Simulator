# Journal

## Phase 1
The PriorityQueue know which company is the smallest because the compareTo() method compares their sizes. It automatically puts the smallest company first. If I wanted the largest companies to merge first, I would just reverse the comparison.
<br><br>
## Phase 2
A PriorityQueue makes the process easier because I don't have to keep sorting the companies myself. Adding a company O(log n) times, while sorting an ArrayList takes O(n log n). This makes the PriorityQueue more efficient for repeated mergers.