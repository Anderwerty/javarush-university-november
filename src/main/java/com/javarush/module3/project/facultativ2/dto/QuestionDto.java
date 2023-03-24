package com.javarush.module3.project.facultativ2.dto;

import java.util.List;

public class QuestionDto {
    private String text;
    private String url;
    private boolean isLast;
    private List<AnswerDto> answers;
}
