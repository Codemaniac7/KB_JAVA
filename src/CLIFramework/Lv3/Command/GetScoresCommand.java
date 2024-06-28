package CLIFramework.Lv3.Command;

import CLIFramework.Lv2.Input;
import CLIFramework.Lv3.domain.StudentScores;

public class GetScoresCommand implements Command{
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();

        for(int i = 0; i < scores.length; i++){
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }
}
