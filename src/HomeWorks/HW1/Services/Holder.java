package HomeWorks.HW1.Services;

import HomeWorks.HW1.Domain.Product;

import java.math.BigDecimal;
import java.util.HashMap;

public class Holder {
    private HashMap<Integer, Cell> cells;

    /**
     * Init new holder
     *
     * @param quantityCell set the quantity cells
     * @param cellSize     size of the any cell
     */
    public Holder(int quantityCell, int cellSize) {
        this.cells = new HashMap<>();

        for (int quantity = 0; quantity < quantityCell; quantity++) {
            this.cells.put(quantity, new Cell(quantity, cellSize));
        }
    }

    /**
     * Add new product in holder
     *
     * @param product any product
     * @return true if add is done and false if not
     */
    public boolean addProduct(Product product) {
        for (var cell : cells.values()) {
            if (!cell.getCell().isEmpty()) {
                if (cell.getCell().peek().equals(product)) {
                    cell.add(product);
                    return true;
                }
            }
        }

        Cell emptyCell = getEmptyCell();

        if (emptyCell == null) {
            System.out.println("There no empty cell.");
            return false;
        }

        return emptyCell.add(product);
    }

    /**
     * Find empty cells to where will be added new product
     *
     * @return empty cell if there is it or null if not
     */
    private Cell getEmptyCell() {
        for (Cell cell : cells.values()) {
            if (cell.getCell().isEmpty())
                return cell;
        }
        return null;
    }

    /**
     * Get any product info in the holder
     *
     * @param position needed position in the holder
     * @return info
     */
    public String getProductInfo(int position) {
        if (cells.containsKey(position)) {
            if (!cells.get(position).getCell().isEmpty()) {
                return cells.get(position).getInfo();
            }
        }
        return "There is empty!";
    }

    /**
     * Get product to release
     *
     * @param position needed product
     * @return true if it is done and false if there no product
     */
    public boolean getProduct(int position) {
        Product product = cells.get(position).give();
        if (product == null) return false;
        return true;
    }

    /**
     * Get price
     *
     * @param position product position
     * @return product price
     */
    public BigDecimal getPrice(int position) {
        return this.cells.get(position).getCell().peek().getPrice();
    }

    /**
     * Get brand
     *
     * @param position product position
     * @return product brand
     */
    public String getBrand(int position) {
        return this.cells.get(position).getCell().peek().getBrand();
    }

    /**
     * Get name
     *
     * @param position product position
     * @return product name
     */
    public String getName(int position) {
        return this.cells.get(position).getCell().peek().getName();
    }
}
