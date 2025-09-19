package seedu.address.logic.commands;

import org.junit.jupiter.api.Test;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;

public class RemarkCommandTest {
  private Model model = new ModelManager();
  private Model expectedModel = new ModelManager();

  @Test
  public void execute() {
    assertCommandFailure(new RemarkCommand(), model, "");
  }
}
