package com.example.mockApi.dta;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class MockIngredientDta {
    UUID id;
    String name;
}
