package clientes;

import java.util.ArrayList;
import java.util.List;

import com.ejemplo.LineItem;

import tipos.Date;

/**
 * Class Shopping_Cart_
 */
public class Shopping_Cart {
  private Date created;
  private List<LineItem> items;

  public Shopping_Cart() {
      this.created = new Date();
      this.items = new ArrayList<>();
  }

  public Date getCreated() { 
	  return created; 
  }

  public List<LineItem> getItems() { 
	  return items; 
  }

  public void addItem(LineItem item) {
      items.add(item);
  }

  public void removeItem(LineItem item) {
      items.remove(item);
  }

  public double getTotal() {
      return items.stream()
              .mapToDouble(i -> i.getPrice() * i.getQuantity())
              .sum();
  }
}
