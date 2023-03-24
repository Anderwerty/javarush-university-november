package com.javarush.module3.project.facultativ2;

import com.javarush.module3.project.facultativ2.dto.AnswerDto;
import com.javarush.module3.project.facultativ2.dto.QuestionDto;
import com.javarush.module3.project.facultativ2.entity.Question;
import com.javarush.module3.project.facultativ2.repository.AnswerRepository;
import com.javarush.module3.project.facultativ2.repository.QuestionRepository;

import java.util.Optional;

public class GameService {
    private final AnswerRepository answerRepository;
    private  final QuestionRepository questionRepository;

    public GameService(AnswerRepository answerRepository, QuestionRepository questionRepository) {
        this.answerRepository = answerRepository;
        this.questionRepository = questionRepository;
    }

    public QuestionDto findQuestionById(Integer id){
        Question question = questionRepository.findById(id).orElseThrow();

        return  null;
    }
}
