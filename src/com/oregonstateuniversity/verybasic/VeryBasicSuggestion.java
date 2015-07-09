package com.oregonstateuniversity.verybasic;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.refactoring.RefactoringFactory;
import com.intellij.refactoring.openapi.impl.JavaRefactoringFactoryImpl;

/**
 * Created by lily on 7/9/15.
 */
public class VeryBasicSuggestion extends AnAction {

    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
//        String txt = Messages.showInputDialog(project, "What is your name?",
//                "Input you name:", Messages.getQuestionIcon());
//        Messages.showMessageDialog(project, "Hello, " + txt +
//                        "!\nI am glad to see you.", "Information",
//                Messages.getInformationIcon());

        PsiElement element = e.getData(LangDataKeys.PSI_ELEMENT);

//        System.out.println(element.toString());

        PsiElement parent = PsiTreeUtil.getParentOfType(element, PsiElement.class);

//        System.out.println(parent.toString());

        System.out.println(element.getClass());

        RefactoringFactory factory = new JavaRefactoringFactoryImpl(project);
//        factory = RefactoringFactory.getInstance(project);
        factory.createRename(element, "somethingReallyLongSoWeWontMissIt");

        System.out.println(element.toString());

    }
}
