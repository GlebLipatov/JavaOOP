package HomeWorks.HW1.Services;

import HomeWorks.HW1.Domain.Product;

import java.util.Stack;

public class Cell {
    private Stack<Product> cell;
    private int position;
    private int size;

    /**
     * @param position int the holder
     * @param size     of the any cell
     */
    public Cell(int position, int size) {
        this.cell = new Stack<>();
        this.position = position;
        this.size = size;
    }

    /**
     * Add any product in the cell
     *
     * @param product to added
     * @return true if is done and false if not
     */
    public boolean add(Product product) {
        this.cell.push(product);
        this.size++;
        return true;
    }

    /**
     * give the product
     *
     * @return choises product
     */
    public Product give() {
        if (this.cell.isEmpty()) return null;
        this.size--;
        return this.cell.pop();
    }

    /**
     * Get info about product
     *
     * @return info
     */
    public String getInfo() {
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

    /**
     * Has int the current cell empty slot to the new product
     *
     * @return
     */
    public boolean hasEmptySlot() {
        return cell.size() < this.size;
    }
}
