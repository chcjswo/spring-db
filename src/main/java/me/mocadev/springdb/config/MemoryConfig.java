package me.mocadev.springdb.config;

import me.mocadev.springdb.repository.ItemRepository;
import me.mocadev.springdb.repository.memory.MemoryItemRepository;
import me.mocadev.springdb.service.ItemService;
import me.mocadev.springdb.service.ItemServiceV1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemoryConfig {

    @Bean
    public ItemService itemService() {
        return new ItemServiceV1(itemRepository());
    }

    @Bean
    public ItemRepository itemRepository() {
        return new MemoryItemRepository();
    }

}
