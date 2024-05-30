package com.example.mockApi;

import com.example.mockApi.dta.MockIngredientDta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MockService {
    @GetMapping("/ingredients/{id}")
    public ResponseEntity<MockIngredientDta> getMockIngredient(@PathVariable final UUID id) {
        MockIngredientDta m = new MockIngredientDta(id, "chwast");
        return ResponseEntity.ok(m);
    }

}
