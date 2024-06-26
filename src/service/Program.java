package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.CartContext;
import common.Discount;
import common.Pos;
import common.Product;
import common.Utility;

public class Program {

    public static void main(String[] args) {

        //==========================================================================//
        //All products

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();
        Product p6 = new Product();
        Product p7 = new Product();
        Product p8 = new Product();
        Product p9 = new Product();
        Product p10 = new Product();
        Product p11 = new Product();
        Product p12 = new Product();
        Product p13 = new Product();
        Product p14 = new Product();
        Product p15 = new Product();
        Product p16 = new Product();

        Product p17 = new Product();
        Product p18 = new Product();
        Product p19 = new Product();
        Product p20 = new Product();
        Product p21 = new Product();
        Product p22 = new Product();

        Product p23 = new Product();
        Product p24 = new Product();
        Product p25 = new Product();
        Product p26 = new Product();
        Product p27 = new Product();
        Product p28 = new Product();
        Product p29 = new Product();
    
        p1.setName("康寶雞湯塊");
        p1.setSku("SOUP-31423");
        p1.setPrice(45);
        p1.setTag("雞湯塊");

        p2.setName("康寶雞湯塊");
        p2.setSku("SOUP-31423");
        p2.setPrice(45);
        p2.setTag("雞湯塊");


        p3.setName("舒潔捲筒衛生紙");
        p3.setSku("TISU-00235");
        p3.setPrice(179);
        p3.setTag("衛生紙");

        p4.setName("舒潔捲筒衛生紙");
        p4.setSku("TISU-00235");
        p4.setPrice(179);
        p4.setTag("衛生紙");

        p5.setName("舒潔捲筒衛生紙");
        p5.setSku("TISU-00235");
        p5.setPrice(179);
        p5.setTag("衛生紙");

        p6.setName("舒潔攜帶衛生紙");
        p6.setSku("TISU-00358");
        p6.setPrice(139);
        p6.setTag("衛生紙");

        p7.setName("舒潔攜帶衛生紙");
        p7.setSku("TISU-00358");
        p7.setPrice(139);
        p7.setTag("衛生紙");

        p8.setName("舒潔攜帶衛生紙");
        p8.setSku("TISU-00358");
        p8.setPrice(139);
        p8.setTag("衛生紙");
        
        p9.setName("光泉茉莉蜜茶");
        p9.setSku("DRNK-00159");
        p9.setPrice(179);
        p9.setTag("熱銷飲品");

        p10.setName("御茶園");
        p10.setSku("DRNK-01201");
        p10.setPrice(400);
        p10.setTag("熱銷飲品");

        p11.setName("御茶園");
        p11.setSku("DRNK-01201");
        p11.setPrice(400);
        p11.setTag("熱銷飲品");

        p12.setName("氣泡水");
        p12.setSku("FMCP-00102");
        p12.setPrice(29);
        p12.setTag("加購優惠");

        p13.setName("氣泡水");
        p13.setSku("FMCP-00102");
        p13.setPrice(29);
        p13.setTag("加購優惠");

        p14.setName("氣泡水");
        p14.setSku("FMCP-00102");
        p14.setPrice(29);
        p14.setTag("加購優惠");

        p15.setName("氣泡水");
        p15.setSku("FMCP-00102");
        p15.setPrice(29);
        p15.setTag("加購優惠");
        
        p16.setName("氣泡水");
        p16.setSku("FMCP-00102");
        p16.setPrice(29);
        p16.setTag("加購優惠");

        p17.setName("氣泡水1");
        p17.setSku("FMCP-00102");
        p17.setPrice(2999);
        p17.setTag("自由配食物#49");
        p18.setName("氣泡水2");
        p18.setSku("FMCP-00102");
        p18.setPrice(100);
        p18.setTag("自由配食物#39");
        p19.setName("氣泡水3");
        p19.setSku("FMCP-00102"); 
        p19.setPrice(100);
        p19.setTag("自由配食物#49");
        p20.setName("氣泡水4");
        p20.setSku("FMCP-00102");
        p20.setPrice(200);
        p20.setTag("自由配飲料#39");
        p21.setName("氣泡水5");
        p21.setSku("FMCP-00102");
        p21.setPrice(300);
        p21.setTag("自由配飲料#49");
        p22.setName("氣泡水6");
        p22.setSku("FMCP-00102");
        p22.setPrice(3000);
        p22.setTag("自由配飲料#59");

        p23.setName("test");
        p23.setSku("FMCP-00102");
        p23.setPrice(100);
        p23.setTag("test");
        p24.setName("test");
        p24.setSku("FMCP-00102");
        p24.setPrice(100);
        p24.setTag("test");
        p25.setName("test");
        p25.setSku("FMCP-00102");
        p25.setPrice(100);
        p25.setTag("test");
        p26.setName("test");
        p26.setSku("FMCP-00102");
        p26.setPrice(100);
        p26.setTag("test");
        p27.setName("test");
        p27.setSku("FMCP-00102");
        p27.setPrice(100);
        p27.setTag("test");
        p28.setName("test");
        p28.setSku("FMCP-00102");
        p28.setPrice(100);
        p28.setTag("test");



        List<Product> list = new ArrayList<>();
        Collections.addAll(list,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16);
        Collections.addAll(list,p17,p18,p19,p20,p21,p22);
        Collections.addAll(list,p23,p24,p25,p26,p27,p28,p17,p21);

        //========================================================================================//
        CartContext cart = new CartContext();
        Pos pos = new Pos();

        cart.setPurchasedItems(list);
        pos.setActivedRules(Utility.loadRules());
        pos.checkoutProcess(cart);

        System.out.println("購買商品:");
        System.out.println("---------------------------------------------------");
        for (Product p : cart.getPurchasedItems()) {
            System.out.printf("[%s] %8.2f, %s, %s%n",p.getSku(), p.getPrice(), p.getName(), p.getTag());
        }
        System.out.println();

        System.out.println("折扣:");
        System.out.println("---------------------------------------------------");
        for (Discount d : cart.getAppliedDiscounts()) {
            System.out.printf("- 折抵 %8.2f, %s", d.getAmount(), d.getRuleName());
            System.out.println();
            for (Product p : d.getProducts()) {
                System.out.printf("  * 符合:  [%s], %s, %s%n", p.getSku(), p.getName(), p.getTag());
            }
            
            
        }
        System.out.println();

        System.out.println("---------------------------------------------------");
        System.out.printf("結帳金額:   %8.2f%n", cart.getTotalPrice());
    }
}
