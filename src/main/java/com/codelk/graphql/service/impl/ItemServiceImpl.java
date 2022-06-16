package com.codelk.graphql.service.impl;

import com.codelk.graphql.entity.Item;
import com.codelk.graphql.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public List<Item> getItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        for (int m = 0;m<5;m++){
            Item item = new Item();
            item.setDescription("test"+m);
            item.setRate("6");
            item.setId((long) m);
            item.setName("bbbb"+m);
            items.add(item);
        }
        return items;
    }
}
