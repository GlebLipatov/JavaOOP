package HomeWorks.HW1.Services;

import HomeWorks.HW1.Domain.Product;

import java.util.Stack;

public class Cell {
    private Stack<Product> cell;
    private int position;
    private int size;

    public Cell(int position, int size) {
        this.cell = new Stack<>();
        this.position = position;
        this.size = size;
    }

    public boolean add(Product product) {
        this.cell.push(product);
        this.size++;
        return true;
    }
     public Product give() {
        if (this.cell.isEmpty()) return null;
        this.size--;
        return this.cell.pop();
     }

    public String getInfo(){
        return cell.peek().toString();
    }

    public Stack<Product> getCell() {
        return cell;
    }

    public int getSize() {
        return size;
    }

    public int getPosition() {
        return position;
    }

    public boolean hasEmptySlot() {
        return cell.size() < this.size;
    }
}
