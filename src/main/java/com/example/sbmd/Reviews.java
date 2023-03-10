package com.example.sbmd;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Reviews {
    @Id
    private ObjectId Id;
    private String body;
}
