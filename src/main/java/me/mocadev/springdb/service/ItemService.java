package me.mocadev.springdb.service;

import java.util.List;
import java.util.Optional;
import me.mocadev.springdb.domain.Item;
import me.mocadev.springdb.repository.ItemSearchCond;
import me.mocadev.springdb.repository.ItemUpdateDto;

public interface ItemService {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

	Optional<Item> findById(Long id);

    List<Item> findItems(ItemSearchCond itemSearch);
}
