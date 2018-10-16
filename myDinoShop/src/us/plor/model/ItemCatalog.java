package us.plor.model;

import java.util.ArrayList;
import java.util.List;

public class ItemCatalog {
    private List<Item> itemCatalog = new ArrayList<>();
    private int nextProductNumber;

    public ItemCatalog() {
        nextProductNumber = 1;
        itemCatalog.add(new Item(nextProductNumber++,"Red Brown Triceratop",44.75,false,"Red Brown colored Triceratop on four limbs","images/d1.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Ankylosaurus",40.99,true,"Grey spikey back dinosaur on four limbs","images/d2.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Triceratop & Tyrannosaurus",40.55,true,"Grey Triceratop on four limbs, Red angry roaring Tyrannosaurus","images/d3.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Angry Furious Tyrannosaurus",42.75,false,"Green fierce roaring Tyrannosaurus on 2 limbs","images/d4.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Raptor",30.99,false,"Gray Raptor with blue outline strip going down body, yellow eyes, sharp claws","images/d5.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Carnotaurus",35.75,true,"Blue, Red, Grey Carnotaurus roaring, red tongue","images/d6.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Feathered Velociraptor",39.65,false,"Feathered Velociraptor with blue outline around eyes","images/d7.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Spinosaurus",60.25,false,"Gray Spinosaurus with red tip on wing like back","images/d8.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Red Spike Kentrosaurus",32.55,true,"Red spike Kentrosaurus on four limbs","images/d9.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"White Spike Kentrosaurus",22.99,false,"","images/d10.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Papo Allosaurus",37.99,false,"","images/d11.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Papo Apatosaurus",34.99,false,"","images/d12.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Stripe Parasaurolophus",40.25,false,"","images/d13.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Suchomimus",31.99,false,"","images/d14.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Pteranodon",24.99,false,"","images/d15.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Edmontosaurus",23.99,false,"","images/d16.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Male Dimorphodon",44.99,false,"","images/d17.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Gallimimus",45.99,false,"","images/d18.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Bright Stegosaurus",28.99,false,"","images/d19.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Baryonyx",26.55,false,"","images/d20.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Stygimoloch",28.5,false,"","images/d21.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Metriacanthosaurus",29.99,false,"","images/d22.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Velociraptor",34.99,false,"","images/d23.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Pachycephalosaurus",33.99,false,"","images/d24.jpg"));
    }

    public List<Item> getItemCatalog() {
        return itemCatalog;
    }

    public List<Item> getFeaturedItemCatalog() {
        List<Item> item = new ArrayList<>();

        for(Item i: itemCatalog) {
            if (i.isFeatured()) {
                item.add(i);
            }
        }
        return item;
    }
    public Item getSingleItem(int itemNum) {
        Item item=null;

        for(Item i: itemCatalog) {
            if (i.getProductNumer() == itemNum) {
                return i;
            }
        }
        return item;
    }
}
