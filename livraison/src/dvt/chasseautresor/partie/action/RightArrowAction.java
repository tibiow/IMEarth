package dvt.chasseautresor.partie.action;

import dvt.chasseautresor.partie.CardView;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Project : modele-de-jeu
 * Created by Thibaut on 08/03/2016
 */
public class RightArrowAction extends AbstractAction {
    private CardView cardView;

    public RightArrowAction(CardView cardView) {
        this.cardView=cardView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardView.rightAction();
    }
}