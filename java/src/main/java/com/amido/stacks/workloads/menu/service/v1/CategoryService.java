package com.amido.stacks.workloads.menu.service.v1;

import com.amido.stacks.core.api.dto.response.ResourceCreatedResponse;
import com.amido.stacks.core.api.dto.response.ResourceUpdatedResponse;
import com.amido.stacks.workloads.menu.api.v1.dto.request.CreateCategoryRequest;
import com.amido.stacks.workloads.menu.api.v1.dto.request.UpdateCategoryRequest;
import jakarta.validation.Valid;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@RequiredArgsConstructor
public class CategoryService {

  private static final Logger logger = LoggerFactory.getLogger(CategoryService.class);
  public ResourceCreatedResponse create(@Valid CreateCategoryRequest body, String correlationId) {
    logger.info("category service create method called");
    return new ResourceCreatedResponse(UUID.randomUUID());
  }

  public ResourceUpdatedResponse update(
      UUID menuId, UUID categoryId, @Valid UpdateCategoryRequest body, String correlationId) {
    return new ResourceUpdatedResponse(UUID.randomUUID());
  }
}
