package com.fis.itemcatalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ItemRepository extends JpaRepository<Item, Long> {}