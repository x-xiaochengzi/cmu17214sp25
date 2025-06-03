package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private int totalAdded;
    private IntegerList list;

    public DelegationSortedIntList() {
        this.totalAdded = 0;
        this.list = new SortedIntList();
    }

    public int getTotalAdded() {
        return this.totalAdded;
    }

    @Override
    public boolean add(int num) {
        this.totalAdded++;
        return list.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        this.totalAdded += list.size();
        return this.list.addAll(list);
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        return list.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return this.list.removeAll(list);
    }

    @Override
    public int size() {
        return list.size();
    }
}