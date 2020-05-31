package org.example.quizapp.menu.questions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private List<Question> questionList = new ArrayList<>();

    public void loadCategoryQuestions (Statement statement, String categoryTable) {
        String QUERY_DATA_FROM_TABLE = "SELECT * FROM " + categoryTable;
        ResultSet resultSet = null;

        try {
            resultSet = statement.executeQuery(QUERY_DATA_FROM_TABLE);

            while (resultSet.next()) {
                int question_id = resultSet.getInt(1);
                String question_text = resultSet.getString(2);
                boolean question_answer;
                if (resultSet.getInt(3) == 1) {
                    question_answer = true;
                } else {
                    question_answer = false;
                }
                String question_complement = resultSet.getString(4);

                Question question = new Question(question_id, question_text, question_answer, question_complement);

                questionList.add(question);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
