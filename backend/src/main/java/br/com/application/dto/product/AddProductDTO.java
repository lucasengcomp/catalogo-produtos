package br.com.application.dto.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 400)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(length = 400)
    private String imgUrl;

    private LocalDateTime date;
}
