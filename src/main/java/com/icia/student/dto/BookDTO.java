package com.icia.student.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private Long BookId;
    private String BookName;
    private String BookAuthor;
    private int BookPrice;
    private String BookPublisher;



}
