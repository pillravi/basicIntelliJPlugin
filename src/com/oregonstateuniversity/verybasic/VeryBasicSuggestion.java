package com.oregonstateuniversity.verybasic;

import com.intellij.openapi.actionSystem.*;
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

        PsiElement langElement = e.getData(LangDataKeys.PSI_ELEMENT);
//        PsiElement genericElement = e.getData(DataKeys.PSI_ELEMENT);
//        PsiElement platformElement = e.getData(PlatformDataKeys.PSI_ELEMENT);
//        PsiElement commonElement = e.getData(CommonDataKeys.PSI_ELEMENT);
//        PsiElement caret = e.getData(CommonDataKeys.CARET);
//        PsiElement langCaret = e.getData(LangDataKeys.CARET);

//        System.out.println("genericElement: " + genericElement.getClass());
//        System.out.println(genericElement.toString());
//        System.out.println("platformElement: " + platformElement.getClass());
//        System.out.println(platformElement.toString());
//        System.out.println("commonElement: " + commonElement.getClass());
//        System.out.println(commonElement.toString());


        if (langElement != null) {
            System.out.println("langElement Class: " + langElement.getClass());
            System.out.println("         toString: " + langElement.toString());
            System.out.println("         children: ");


            PsiElement scratchChildren[] = langElement.getChildren();
            for (Integer i = 0; i < scratchChildren.length; i++) {
                System.out.println("            child #" + i + ": " +
                        scratchChildren[i].toString());
            }
//            PsiElement srcChildren[] = scratchChildren[1].getChildren();

            System.out.println();
        } else {
            System.out.println("langElement was null");
            System.out.println();
        }


//        System.out.println(scratchChildren);


    }
}
