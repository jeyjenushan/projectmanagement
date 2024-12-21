package org.example.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Issue {

    @Id
    private Long IssueID;


}
