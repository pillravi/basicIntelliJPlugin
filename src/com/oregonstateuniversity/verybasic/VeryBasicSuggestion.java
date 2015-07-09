package com.oregonstateuniversity.verybasic;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by lily on 7/9/15.
 */
public class VeryBasicSuggestion extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        String txt = Messages.showInputDialog(project, "What is your name?",
                "Input you name:", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, " + txt +
                        "!\nI am glad to see you.", "Information",
                Messages.getInformationIcon());

    }
}
