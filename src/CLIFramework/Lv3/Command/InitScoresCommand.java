package CLIFramework.Lv3.Command;

import CLIFramework.Lv2.Input;
import CLIFramework.Lv3.domain.StudentScores;

public class InitScoresCommand implements Command{
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int studentNum = Input.getInt("학생수> ");
        studentScores.setStudentNum(studentNum);
    }
}
