package com.codelk.graphql.resolver;

import com.codelk.graphql.entity.Item;
import com.codelk.graphql.service.ItemService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemResolver implements GraphQLQueryResolver {

    private final ItemService itemService;

    @Autowired
    public ItemResolver(ItemService itemService) {
        this.itemService = itemService;
    }

    public List<Item> getAllItems() {
        return itemService.getItems();
    }
}
