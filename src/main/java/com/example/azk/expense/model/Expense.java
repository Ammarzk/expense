package com.example.azk.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.CloseableThreadContext;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "expense")
public class Expense {

    @Id
    private long id;

    private Instant expensedate;

    private String description;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;



}
