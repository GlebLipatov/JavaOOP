package HomeWorks.HW1.Services;

import HomeWorks.HW1.Domain.Product;

import java.math.BigDecimal;
import java.util.HashMap;

public class Holder {
    private HashMap<Integer, Cell> cells;

    public Holder(int quantityCell, int cellSize) {
        this.cells = new HashMap<>();

        for (int quantity = 0;  quantity < quantityCell; quantity++) {
            this.cells.put(quantity, new Cell(quantity, cellSize));
        }
    }
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

    private Cell getEmptyCell() {
        for (Cell cell : cells.values()) {
            if (cell.getCell().isEmpty())
                return cell;
        }
        return null;
    }

    public String getProductInfo(int position) {
        if (cells.containsKey(position)) {
            if (!cells.get(position).getCell().isEmpty()) {
                return cells.get(position).getInfo();
            }
        }
        return "There is empty!";
    }

    public boolean getProduct(int position) {
        Product product = cells.get(position).give();
        if (product == null) return false;
        return true;
    }

    public BigDecimal getPrice(int position) {
        return this.cells.get(position).getCell().peek().getPrice();
    }

    public String getBrand(int position) {
        return this.cells.get(position).getCell().peek().getBrand();
    }

    public String getName(int position) {
        return this.cells.get(position).getCell().peek().getName();
    }
}
