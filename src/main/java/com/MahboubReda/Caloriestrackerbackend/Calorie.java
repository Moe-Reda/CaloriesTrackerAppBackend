package com.MahboubReda.Caloriestrackerbackend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Calorie")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calorie {
    @Id
    private String id;
    private String date;
    private String location;
    private String type;
    private String name;
    private String cal;
}
