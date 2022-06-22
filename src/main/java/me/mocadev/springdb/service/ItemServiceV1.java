package me.mocadev.springdb.service;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import me.mocadev.springdb.domain.Item;
import me.mocadev.springdb.repository.ItemRepository;
import me.mocadev.springdb.repository.ItemSearchCond;
import me.mocadev.springdb.repository.ItemUpdateDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceV1 implements ItemService {

        private final ItemRepository itemRepository;

        @Override
        public Item save(Item item) {
            return itemRepository.save(item);
        }

        @Override
        public void update(Long itemId, ItemUpdateDto updateParam) {
        itemRepository.update(itemId, updateParam);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public List<Item> findItems(ItemSearchCond cond) {
        return itemRepository.findAll(cond);
    }
}
