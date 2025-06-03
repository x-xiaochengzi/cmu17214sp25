package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation
    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        totalAdded = 0;
    }

    /**
     * Returns the count of the number of attempted element insertions
     * 
     * @return the count of the number of attempted element insertions
     */
    public int getTotalAdded() {
        return this.totalAdded;
    }

    /**
     * Adds the specified int to the list.
     * Updates the count of the number of attempted element insertions.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    public boolean add(int num) {
        this.totalAdded++;
        return super.add(num);
    }
}