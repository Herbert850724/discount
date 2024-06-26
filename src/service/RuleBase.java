package service;

import java.util.List;

import common.CartContext;
import common.Discount;

public abstract class RuleBase {
    public int id;
    public String name;
    public String note;
    public abstract List<Discount> process(CartContext cart);
}
